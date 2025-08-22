package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import org.jetbrains.annotations.Nullable;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.klepticat.ghostcraft.util.types.TotemData;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class TotemDataComponent implements AutoSyncedComponent, Component {
    private final Object provider;
    private TotemData data;

    public TotemDataComponent(Object provider) {
        this.provider = provider;
    }

    public void set(TotemData data) {
        this.data = data;
        GCCardinalComponents.TOTEM_DATA.sync(this.provider);
    }

    public TotemData get() {
        return this.data;
    }


    public boolean isLocked() {
        return data.isLocked();
    }

    public boolean toggleLocked() {
        return data.toggleLocked();
    }


    public @Nullable RegistryEntry<StatusEffect> getEffect() {
        return data.statusEffect;
    }

    public void setEffect(@Nullable RegistryEntry<StatusEffect> effect) {
        data.statusEffect = effect;
        GCCardinalComponents.TOTEM_DATA.sync(this.provider);
    }


    public byte getAmplifier() {
        return data.statusEffectAmplifier;
    }

    public void setAmplifier(byte amplifier) {
        data.statusEffectAmplifier = amplifier;
    }


    public short getUptime() {
        return data.uptime;
    }

    public void setUptime(short uptime) {
        data.uptime = uptime;
    }


    public float getRadius() {
        return data.radius;
    }

    public void setRadius(float radius) {
        data.radius = radius;
        GCCardinalComponents.TOTEM_DATA.sync(this.provider);
    }


    public @Nullable TotemData.TotemParticle getParticle() {
        return data.particle;
    }

    public void setParticle(@Nullable TotemData.TotemParticle particle) {
        data.particle = particle;
        GCCardinalComponents.TOTEM_DATA.sync(this.provider);
    }


    @Override
    public void readFromNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        this.set(TotemData.fromNbt(nbtCompound));
    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        nbtCompound.copyFrom(data.toNbt());
    }
}
