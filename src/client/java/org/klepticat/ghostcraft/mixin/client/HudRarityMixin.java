package org.klepticat.ghostcraft.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.ColorHelper;
import org.klepticat.ghostcraft.AllDataComponents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(InGameHud.class)
public abstract class HudRarityMixin {
    @Accessor("client")
    abstract MinecraftClient getClient();

    @Accessor("heldItemTooltipFade")
    abstract int getTooltipFade();

    @Accessor("currentStack")
    abstract ItemStack getCurrentStack();

    @Inject(
            method = "Lnet/minecraft/client/gui/hud/InGameHud;renderHeldItemTooltip(Lnet/minecraft/client/gui/DrawContext;)V",
            at = @At("HEAD"),
            cancellable = true
    )
    private void renderHeldItemTooltip(DrawContext context, CallbackInfo callbackInfo) {
        getClient().getProfiler().push("selectedItemName");
        if (getTooltipFade() > 0 && !getCurrentStack().isEmpty()) {
            MutableText mutableText;

            if(!getCurrentStack().getComponents().contains(AllDataComponents.GC_RARITY)) {
                mutableText = Text.empty().append(getCurrentStack().getName()).formatted(getCurrentStack().getRarity().getFormatting());
            } else {
                mutableText = Text.empty().append(getCurrentStack().getName()).formatted(getCurrentStack().getComponents().get(AllDataComponents.GC_RARITY).getFormatting());
            }

            if (getCurrentStack().contains(DataComponentTypes.CUSTOM_NAME)) {
                mutableText.formatted(Formatting.ITALIC);
            }

            int i = ((InGameHud) (Object) this).getTextRenderer().getWidth(mutableText);
            int j = (context.getScaledWindowWidth() - i) / 2;
            int k = context.getScaledWindowHeight() - 59;
            if (!getClient().interactionManager.hasStatusBars()) {
                k += 14;
            }

            int l = (int)((float)getTooltipFade() * 256.0F / 10.0F);
            if (l > 255) {
                l = 255;
            }

            if (l > 0) {
                context.drawTextWithBackground(((InGameHud) (Object) this).getTextRenderer(), mutableText, j, k, i, ColorHelper.Argb.withAlpha(l, -1));
            }
        }

        getClient().getProfiler().pop();
        callbackInfo.cancel();
    }
}
