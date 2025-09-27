package org.klepticat.ghostcraft.mixin.client;

import net.minecraft.client.render.entity.FishingBobberEntityRenderer;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FishingBobberEntityRenderer.class)
public class CustomRodRenderMixin {
    @Redirect(
            method = "getHandPos",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z")
    )
    public boolean isFishingRod(ItemStack instance, Item item) {
        return instance.getItem() instanceof FishingRodItem;
    }
}
