package org.klepticat.ghostcraft.item;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;

public class AttributeTrinketItem extends TrinketItem {
    private RegistryEntry<StatusEffect> statusEffect;
    private int effectStrength;

    private AttributeTrinketItem(Settings settings) {
        super(settings);
    }

    public AttributeTrinketItem(Settings settings, RegistryEntry<StatusEffect> effect, int effectStrength) {
        this(settings);

        this.statusEffect = effect;
        this.effectStrength = effectStrength;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onEquip(stack, slot, entity);

        entity.addStatusEffect(new StatusEffectInstance(
                this.statusEffect,
                StatusEffectInstance.INFINITE,
                this.effectStrength,
                true,
                false,
                false,
                entity.getStatusEffect(this.statusEffect)
        ));
    }

    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onEquip(stack, slot, entity);

        entity.removeStatusEffect(this.statusEffect);
    }
}
