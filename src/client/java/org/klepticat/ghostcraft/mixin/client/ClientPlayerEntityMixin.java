package org.klepticat.ghostcraft.mixin.client;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.klepticat.ghostcraft.item.ExtendedElytraItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {
    @Redirect(at = @At(target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z", value = "INVOKE"), method = "tickMovement")
    public boolean itemIsElytra(ItemStack instance, Item item) {
        return ExtendedElytraItem.itemIsElytra(instance);
    }
}
