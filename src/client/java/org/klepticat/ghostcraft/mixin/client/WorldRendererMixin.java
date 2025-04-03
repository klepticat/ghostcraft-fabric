package org.klepticat.ghostcraft.mixin.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.Block;
import net.minecraft.block.LeverBlock;
import net.minecraft.block.TargetBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.render.debug.DebugRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.entity.GCPlayerEntityStickers;
import org.klepticat.ghostcraft.item.GrapplingHookItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;

@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {
    @Shadow
    private @Nullable ClientWorld world;

    @Accessor
    abstract MinecraftClient getClient();

    @Accessor
    abstract BufferBuilderStorage getBufferBuilders();


    @Inject(method = "render", at = @At("HEAD"))
    public void hookTargetRender(
            RenderTickCounter tickCounter,
            boolean renderBlockOutline,
            Camera camera,
            GameRenderer gameRenderer,
            LightmapTextureManager lightmapTextureManager,
            Matrix4f matrix4f,
            Matrix4f matrix4f2,
            CallbackInfo ci
    ) {
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.mul(matrix4f);
        //RenderSystem.applyModelViewMatrix();

        MatrixStack matrixStack = new MatrixStack();
        VertexConsumerProvider.Immediate immediate = getBufferBuilders().getEntityVertexConsumers();

        WorldRenderer __this = (WorldRenderer) ((Object) this);
        PlayerEntity player = getClient().player;
        float tickDelta = tickCounter.getTickDelta(true);

        assert player != null;
        if (((player.getMainHandStack().getItem() instanceof GrapplingHookItem) || (player.getOffHandStack().getItem() instanceof GrapplingHookItem)))
            renderGrapplingHookTarget(player, matrixStack, immediate, tickDelta);

        if (((GCPlayerEntityStickers) player).hasStickerSelected())
            renderStickerTarget(player, matrixStack, immediate, tickDelta);

        matrix4fStack.popMatrix();
    }

    @Unique
    public void renderGrapplingHookTarget(
            PlayerEntity player,
            MatrixStack matrixStack,
            VertexConsumerProvider immediate,
            float tickDelta
    ) {
        matrixStack.push();

        Vec3d cameraPos = player.getClientCameraPosVec(tickDelta);
        Vec3d cameraRot = player.getRotationVec(tickDelta);

        float maxAngle = GrapplingHookItem.maxAngle;

        // TODO: move search box to be in front of the player, should save frametime by at least 8x
        // TODO: add entity highlighting
        Optional<BlockPos> blockPosOptional = BlockPos.stream(Box.of(player.getClientCameraPosVec(tickDelta), 30, 30, 30)).map(BlockPos::toImmutable).filter(blockPos -> {
            assert world != null;
            Block block = world.getBlockState(blockPos).getBlock();
            Vec3d blockCenterPos = blockPos.toCenterPos();
            Vec3d relativeBlockPos = blockCenterPos.relativize(cameraPos);

            if (!((block instanceof TargetBlock) || (block instanceof LeverBlock))) return false;
            if (blockCenterPos.squaredDistanceTo(cameraPos) >= 225) return false;
            return !(Math.PI - Math.acos(relativeBlockPos.dotProduct(cameraRot) / (relativeBlockPos.length() * cameraRot.length())) >= maxAngle);
        }).min((blockPosA, blockPosB) -> {
            double angleA = Math.PI - (Math.acos(blockPosA.toCenterPos().relativize(cameraPos).dotProduct(cameraRot) / (blockPosA.toCenterPos().relativize(cameraPos).length() * cameraRot.length())));
            double angleB = Math.PI - (Math.acos(blockPosB.toCenterPos().relativize(cameraPos).dotProduct(cameraRot) / (blockPosB.toCenterPos().relativize(cameraPos).length() * cameraRot.length())));

            return angleA != angleB ? (angleA > angleB ? 1 : -1) : 0;
        });

        blockPosOptional.ifPresent(blockPos -> DebugRenderer.drawBox(matrixStack, immediate, blockPos, 0.025f, 1.00f, 0.67f, 0.33f, 0.33f));

        matrixStack.pop();
    }

    @Unique
    public void renderStickerTarget(
            PlayerEntity player,
            MatrixStack matrixStack,
            VertexConsumerProvider immediate,
            float tickDelta
    ) {
        HitResult raycast = player.raycast(player.getBlockInteractionRange(), tickDelta, false);

        if (raycast.getType() != HitResult.Type.BLOCK) return;

        Vec3d position = (player.isSneaking() ? ((BlockHitResult) raycast).getBlockPos().toCenterPos().offset(((BlockHitResult) raycast).getSide(), 0.5) : raycast.getPos());

        Vec3d cameraPos = player.getClientCameraPosVec(tickDelta);
        Vec3d relativeRaycastPos = cameraPos.relativize(position);

        matrixStack.push();

        DebugRenderer.drawBox(matrixStack, immediate, Box.of(relativeRaycastPos, 0.25, 0.25, 0.25), 0.33f, 0.67f, 1.0f, 0.33f);

        matrixStack.pop();
    }
}
