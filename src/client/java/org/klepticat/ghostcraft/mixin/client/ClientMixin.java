package org.klepticat.ghostcraft.mixin.client;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.entity.GCPlayerEntityStickers;
import org.klepticat.ghostcraft.networking.PlaceStickerPayload;
import org.klepticat.ghostcraft.stickers.ClientStickerCooldown;
import org.klepticat.ghostcraft.stickers.Sticker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(MinecraftClient.class)
public class ClientMixin implements ClientStickerCooldown {
    @Unique
    private int stickerCooldown = 0;

    @Shadow
    @Nullable
    public ClientPlayerEntity player;

    @Shadow
    public int attackCooldown;

    @Shadow
    @Nullable
    public ClientPlayerInteractionManager interactionManager;

    @Inject(method = "tick", at = @At("HEAD"))
    public void tick(CallbackInfo ci) {
        if (stickerCooldown > 0) --stickerCooldown;
    }

    @Inject(method = "doItemUse", at = @At("HEAD"), cancellable = true)
    public void doItemUse(CallbackInfo ci) {
        assert this.player != null;
        if (((GCPlayerEntityStickers) this.player).hasStickerSelected()) {
            HitResult raycast = player.raycast(player.getBlockInteractionRange(), 1, false);

            Vector3f position = (player.isSneaking() ? ((BlockHitResult) raycast).getBlockPos().toCenterPos().offset(((BlockHitResult) raycast).getSide(), 0.5) : raycast.getPos()).toVector3f();

            if (((GCPlayerEntityStickers) player).hasStickerSelected() && raycast.getType() == HitResult.Type.BLOCK) {
                ClientPlayNetworking.send(
                        new PlaceStickerPayload(
                                ((GCPlayerEntityStickers) player).getSelectedSticker(),
                                player.getId(),
                                position,
                                ((BlockHitResult) raycast).getSide()
                        )
                );

                ((GCPlayerEntityStickers) player).setSelectedSticker((Sticker) null);

                this.stickerCooldown = 10;

                ci.cancel();
            }
        }

        if (stickerCooldown > 0) ci.cancel();
        return;
    }

    @Inject(method = "handleBlockBreaking", at = @At("HEAD"), cancellable = true)
    public void handleBlockBreaking(boolean breaking, CallbackInfo ci) {
        if (breaking && ((GCPlayerEntityStickers) Objects.requireNonNull(this.player)).hasStickerSelected() && this.attackCooldown <= 0 && !this.player.isUsingItem()) {
            ((GCPlayerEntityStickers) this.player).cancelStickerPlacement();

            this.attackCooldown = 10;
            assert this.interactionManager != null;
            this.interactionManager.cancelBlockBreaking();

            this.stickerCooldown = 10;

            ci.cancel();
        }

        if (stickerCooldown > 0) {
            ci.cancel();
            assert this.interactionManager != null;
            this.interactionManager.cancelBlockBreaking();
        }
        return;
    }

    @Override
    public int getStickerCooldown() {
        return this.stickerCooldown;
    }
}
