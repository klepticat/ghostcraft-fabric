package org.klepticat.ghostcraft.mixin;

import com.google.common.collect.Lists;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.MapIdComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.Texts;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.Nullable;
import org.klepticat.ghostcraft.AllDataComponents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.function.Consumer;

/** @noinspection UnresolvedMixinReference, UnresolvedMixinReference */
@Mixin(ItemStack.class)
public abstract class ItemStackRarityMixin {
    private static final Text DISABLED_TEXT = Text.translatable("item.disabled").formatted(Formatting.RED);


    @Inject(
            method = "Lnet/minecraft/item/ItemStack;getTooltip(Lnet/minecraft/item/Item$TooltipContext;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/item/tooltip/TooltipType;)Ljava/util/List;",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private void overwriteTooltipRarityColor(Item.TooltipContext context, @Nullable PlayerEntity player, TooltipType type, CallbackInfoReturnable<List<Text>> callbackInfoReturnable) {
        if (!type.isCreative() && ((ItemStack) (Object) this).contains(DataComponentTypes.HIDE_TOOLTIP)) {
            callbackInfoReturnable.setReturnValue(List.of());
            return;
        } else {
            List<Text> list = Lists.<Text>newArrayList();

            MutableText mutableText;

            if(((ItemStack) (Object) this).getComponents().contains(AllDataComponents.GC_RARITY)) {
                mutableText = Text.empty().append(this.getName()).formatted(((ItemStack) (Object) this).getComponents().get(AllDataComponents.GC_RARITY).getFormatting());
            } else {
                mutableText = Text.empty().append(this.getName()).formatted(this.getRarity().getFormatting());
            }

            if (((ItemStack) (Object) this).contains(DataComponentTypes.CUSTOM_NAME)) {
                mutableText.formatted(Formatting.ITALIC);
            }

            list.add(mutableText);
            if (!type.isAdvanced() && !((ItemStack) (Object) this).contains(DataComponentTypes.CUSTOM_NAME) && this.isOf(Items.FILLED_MAP)) {
                MapIdComponent mapIdComponent = ((ItemStack) (Object) this).get(DataComponentTypes.MAP_ID);
                if (mapIdComponent != null) {
                    list.add(FilledMapItem.getIdText(mapIdComponent));
                }
            }

            Consumer<Text> consumer = list::add;
            if (!((ItemStack) (Object) this).contains(DataComponentTypes.HIDE_ADDITIONAL_TOOLTIP)) {
                this.getItem().appendTooltip(((ItemStack) (Object) this), context, list, type);
            }

            this.appendTooltip(DataComponentTypes.JUKEBOX_PLAYABLE, context, consumer, type);
            this.appendTooltip(DataComponentTypes.TRIM, context, consumer, type);
            this.appendTooltip(DataComponentTypes.STORED_ENCHANTMENTS, context, consumer, type);
            this.appendTooltip(DataComponentTypes.ENCHANTMENTS, context, consumer, type);
            this.appendTooltip(DataComponentTypes.DYED_COLOR, context, consumer, type);
            this.appendTooltip(DataComponentTypes.LORE, context, consumer, type);
            this.appendAttributeModifiersTooltip(consumer, player);
            this.appendTooltip(DataComponentTypes.UNBREAKABLE, context, consumer, type);
            BlockPredicatesChecker blockPredicatesChecker = ((ItemStack) (Object) this).get(DataComponentTypes.CAN_BREAK);
            if (blockPredicatesChecker != null && blockPredicatesChecker.showInTooltip()) {
                consumer.accept(ScreenTexts.EMPTY);
                consumer.accept(BlockPredicatesChecker.CAN_BREAK_TEXT);
                blockPredicatesChecker.addTooltips(consumer);
            }

            BlockPredicatesChecker blockPredicatesChecker2 = ((ItemStack) (Object) this).get(DataComponentTypes.CAN_PLACE_ON);
            if (blockPredicatesChecker2 != null && blockPredicatesChecker2.showInTooltip()) {
                consumer.accept(ScreenTexts.EMPTY);
                consumer.accept(BlockPredicatesChecker.CAN_PLACE_TEXT);
                blockPredicatesChecker2.addTooltips(consumer);
            }

            if (type.isAdvanced()) {
                if (this.isDamaged()) {
                    list.add(Text.translatable("item.durability", ((ItemStack) (Object) this).getMaxDamage() - ((ItemStack) (Object) this).getDamage(), ((ItemStack) (Object) this).getMaxDamage()));
                }

                list.add(Text.literal(Registries.ITEM.getId(this.getItem()).toString()).formatted(Formatting.DARK_GRAY));
                int i = ((ItemStack) (Object) this).getComponents().size();
                if (i > 0) {
                    list.add(Text.translatable("item.components", i).formatted(Formatting.DARK_GRAY));
                }
            }

            if (player != null && !this.getItem().isEnabled(player.getWorld().getEnabledFeatures())) {
                list.add(DISABLED_TEXT);
            }

            callbackInfoReturnable.setReturnValue(list);
            return;
        }
    }

    @Inject(
            method = "net.minecraft.item.ItemStack.toHoverableText",
            at = @At("HEAD"),
            cancellable = true
    )
    public void toHoverableText(CallbackInfoReturnable callbackInfoReturnable) {
        MutableText mutableText = Text.empty().append(this.getName());
        if (((ItemStack) (Object) this).contains(DataComponentTypes.CUSTOM_NAME)) {
            mutableText.formatted(Formatting.ITALIC);
        }

        MutableText mutableText2 = Texts.bracketed(mutableText);
        if (!((ItemStack) (Object) this).isEmpty()) {
            if(((ItemStack) (Object) this).getComponents().contains(AllDataComponents.GC_RARITY)) {
                mutableText2 = Text.empty().append(this.getName()).formatted(((ItemStack) (Object) this).getComponents().get(AllDataComponents.GC_RARITY).getFormatting());
            } else {
                mutableText2 = Text.empty().append(this.getName()).formatted(this.getRarity().getFormatting());
            }
            mutableText2.styled(style -> style.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_ITEM, new HoverEvent.ItemStackContent(((ItemStack) (Object) this)))));
        }

        callbackInfoReturnable.setReturnValue(mutableText2);
        return;
    }

    @Shadow abstract boolean isOf(Item filledMap);

    @Shadow abstract Rarity getRarity();

    @Shadow abstract void appendAttributeModifiersTooltip(Consumer<Text> consumer, PlayerEntity player);

    @Shadow abstract boolean isDamaged();

    @Shadow abstract void appendTooltip(ComponentType<?> jukeboxPlayable, Item.TooltipContext context, Consumer<Text> consumer, TooltipType type);

    @Shadow abstract Item getItem();

    @Shadow abstract Text getName();
}
