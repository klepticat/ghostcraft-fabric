package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

import java.util.Optional;

public class TotemStatusEffect implements StatusEffectComponent, AutoSyncedComponent {
    private final Object provider;
    private byte amplifier = 0;
    private RegistryEntry<StatusEffect> effect;

    public TotemStatusEffect(Object provider) {
        this.provider = provider;
    }

    @Override
    @Nullable
    public RegistryEntry<StatusEffect> getEffect() {
        return this.effect;
    }

    @Override
    public byte getAmplifier() {
        return this.amplifier;
    }

    @Override
    public void setEffect(RegistryEntry<StatusEffect> effect, byte amplifier) {
        this.setEffect(effect);
        this.setAmplifier(amplifier);
    }

    @Override
    public void setEffect(RegistryEntry<StatusEffect> effect) {
        this.effect = effect;
        GCCardinalComponents.TOTEM_STATUS_EFFECT.sync(provider);
    }

    @Override
    public void setAmplifier(byte amplifier) {
        this.amplifier = amplifier;
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        Optional<RegistryEntry.Reference<StatusEffect>> effectReference = Registries.STATUS_EFFECT.getEntry(Identifier.of(tag.getString("id")));
        if (effectReference.isPresent()) this.setEffect(effectReference.get(), tag.getByte("amplifier"));
        else this.setEffect(null);
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putString("id", getEffect().getIdAsString());
        tag.putByte("amplifier", getAmplifier());
    }
}
