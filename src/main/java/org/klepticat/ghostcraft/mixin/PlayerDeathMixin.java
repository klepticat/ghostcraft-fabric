package org.klepticat.ghostcraft.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerWorld.class)
public class PlayerDeathMixin {
    @Inject(method = "onPlayerRespawned(Lnet/minecraft/server/network/ServerPlayerEntity;)V", at = @At("HEAD"))
    public void onSpawn(ServerPlayerEntity player, CallbackInfo ci) {
        player.getComponent(GCCardinalComponents.PLAYER_SOULS).set((byte) (player.getComponent(GCCardinalComponents.PLAYER_SOULS).get() - 1));

        return;
    }
}
