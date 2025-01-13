package org.klepticat.ghostcraft.mixin.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import org.klepticat.ghostcraft.AllCardinalComponents;
import org.klepticat.ghostcraft.AllDataComponents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

/**
 * @noinspection UnresolvedMixinReference
 */
@Mixin(InGameHud.class)
public abstract class InGameHudMixin {
    @Accessor("EXPERIENCE_BAR_BACKGROUND_TEXTURE")
    abstract Identifier getBarBackgroundTexture();

    @Accessor("EXPERIENCE_BAR_PROGRESS_TEXTURE")
    abstract Identifier getBarProgressTexture();

    @Accessor("client")
    abstract MinecraftClient getClient();

    @Accessor("heldItemTooltipFade")
    abstract int getTooltipFade();

    @Accessor("currentStack")
    abstract ItemStack getCurrentStack();

    private boolean drewXp = false;

    @Inject(
            method = "Lnet/minecraft/client/gui/hud/InGameHud;renderHeldItemTooltip(Lnet/minecraft/client/gui/DrawContext;)V",
            at = @At("HEAD"),
            cancellable = true
    )
    private void renderCustomItemRarity(DrawContext context, CallbackInfo callbackInfo) {
        getClient().getProfiler().push("selectedItemName");
        if (getTooltipFade() > 0 && !getCurrentStack().isEmpty()) {
            MutableText mutableText;

            if (!getCurrentStack().getComponents().contains(AllDataComponents.GC_RARITY)) {
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

    @Inject(method = "Lnet/minecraft/client/gui/hud/InGameHud;renderExperienceLevel(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", at = @At("HEAD"))
    private void moveExperienceLevel(DrawContext context, RenderTickCounter tickCounter, CallbackInfo callbackInfo) {
        context.push();

        if (this.shouldRenderExperience() && getClient().player.experienceLevel > 0) {
            int width = ((InGameHud) (Object) this).getTextRenderer().getWidth(getClient().player.experienceLevel + "");
            context.translate(-2.0f - width + width / 2, 8.0f, 0.0f);
        }
    }

    @Inject(method = "Lnet/minecraft/client/gui/hud/InGameHud;renderExperienceLevel(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", at = @At("TAIL"))
    private void renderSoulLevel(DrawContext context, RenderTickCounter tickCounter, CallbackInfo callbackInfo) {
        context.pop();

        context.push();
        context.translate(3.0f, 8.0f, 0.0f);

        String string = this.getClient().player.getComponent(AllCardinalComponents.PLAYER_SOULS).get() + "";
        int j = (this.shouldRenderExperience() && getClient().player.experienceLevel > 0) ? (context.getScaledWindowWidth() / 2) : -2 + (context.getScaledWindowWidth() - ((InGameHud) (Object) this).getTextRenderer().getWidth(string)) / 2;
        int i = context.getScaledWindowHeight() - 31 - 4;
        context.drawText(((InGameHud) (Object) this).getTextRenderer(), string, j + 1, i, 0, false);
        context.drawText(((InGameHud) (Object) this).getTextRenderer(), string, j - 1, i, 0, false);
        context.drawText(((InGameHud) (Object) this).getTextRenderer(), string, j, i + 1, 0, false);
        context.drawText(((InGameHud) (Object) this).getTextRenderer(), string, j, i - 1, 0, false);
        context.drawText(((InGameHud) (Object) this).getTextRenderer(), string, j, i, ColorHelper.Argb.fromFloats(1.0f, 0.0f, 0.66f, 0.66f), false);

        context.pop();

        if (drewXp) context.pop();
        drewXp = false;
    }

    @Inject(method = "Lnet/minecraft/client/gui/hud/InGameHud;renderExperienceBar(Lnet/minecraft/client/gui/DrawContext;I)V", at = @At("HEAD"))
    private void renderSoulBar(DrawContext context, int x, CallbackInfo callbackInfo) {
        int k = (int) Math.min(((float) this.getClient().player.getComponent(AllCardinalComponents.PLAYER_SOULS).get() / (float) this.getClient().player.getComponent(AllCardinalComponents.PLAYER_MAX_SOULS).get() * 183.0f), 183.0f);
        int l = context.getScaledWindowHeight() - 32 + 3;
        RenderSystem.enableBlend();
        context.drawGuiTexture(Identifier.of(MOD_ID, "hud/soul_bar_background"), x, l, 182, 5);
        if (k > 0) {
            context.drawGuiTexture(Identifier.of(MOD_ID, "hud/soul_bar_progress"), 182, 5, 0, 0, x, l, k, 5);
        }

        RenderSystem.disableBlend();

        context.push();
        drewXp = true;
        context.translate(0.0f, -6.0f, 0.0f);
    }

    private boolean shouldRenderExperience() {
        return getClient().player.getJumpingMount() == null && getClient().interactionManager.hasExperienceBar();
    }
}
