package org.klepticat.ghostcraft.mixin.client;

import net.minecraft.client.render.entity.feature.CapeFeatureRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.klepticat.ghostcraft.item.ExtendedElytraItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CapeFeatureRenderer.class)
public class CapeFeatureRendererMixin {
    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"), method = "render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/network/AbstractClientPlayerEntity;FFFFFF)V")
    public boolean itemIsElytra(ItemStack instance, Item item) {
        return ExtendedElytraItem.itemIsElytra(instance);
    }
}
