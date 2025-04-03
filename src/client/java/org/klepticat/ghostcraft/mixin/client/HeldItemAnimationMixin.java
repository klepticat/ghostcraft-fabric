package org.klepticat.ghostcraft.mixin.client;

import net.minecraft.block.TargetBlock;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.debug.DebugRenderer;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.*;
import org.klepticat.ghostcraft.item.GrapplingHookItem;
import org.klepticat.ghostcraft.item.MagicWeaponItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HeldItemRenderer.class)
public abstract class HeldItemAnimationMixin {
    @Inject(method = "renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V", at = @At("HEAD"))
    private void renderFirstPersonItem(
            AbstractClientPlayerEntity player,
            float tickDelta,
            float pitch,
            Hand hand,
            float swingProgress,
            ItemStack item,
            float equipProgress,
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            int light,
            CallbackInfo callbackInfo
    ) {
        boolean bl = hand == Hand.MAIN_HAND;
        Arm arm = bl ? player.getMainArm() : player.getMainArm().getOpposite();
        boolean bl2 = arm == Arm.RIGHT;
        if (player.isUsingItem() && player.getItemUseTimeLeft() > 0 && player.getActiveHand() == hand) {
            matrices.push();
            int l = bl2 ? 1 : -1;
            if(item.getItem() instanceof MagicWeaponItem) {
                this.applyEquipOffset(matrices, arm, equipProgress);
                matrices.translate((float)l * -0.2785682F, 1F, 0.15731531F);
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-13.935F));
                matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float)l * 35.3F));
                matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((float)l * -9.785F));

                float mx = (float)item.getMaxUseTime(player) - ((float)player.getItemUseTimeLeft() - tickDelta + 1.0F);
                float fxx = mx / ((MagicWeaponItem) item.getItem()).getPullTime();
                fxx = (fxx * fxx + fxx * 2.0F) / 3.0F;
                if (fxx > 1.0F) {
                    fxx = 1.0F;
                }

                if (fxx > 0.1F) {
                    float gx = MathHelper.sin((mx - 0.1F) * 1.3F);
                    float h = fxx - 0.1F;
                    float j = gx * h;
                    matrices.translate(j * 0.0F, j * 0.004F, j * 0.0F);
                }

                matrices.translate(fxx * 0.0F, fxx * 0.0F, fxx * 0.04F);
                matrices.scale(1.0F, 1.0F, 1.0F + fxx * 0.2F);
                matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees((float)l * 45.0F));
            }
        }

        return;
    }

    @Shadow
    protected abstract void applyEquipOffset(MatrixStack matrices, Arm arm, float equipProgress);
}
