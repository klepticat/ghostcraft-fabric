package org.klepticat.ghostcraft.util.types;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtFloat;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtOps;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class TotemData {
    @Nullable
    public RegistryEntry<StatusEffect> statusEffect;
    public byte statusEffectAmplifier;

    @Nullable
    public TotemParticle particle;

    public short uptime;
    public float radius;

    private boolean locked;

    public TotemData(
            @Nullable RegistryEntry<StatusEffect> statusEffect,
            byte statusEffectAmplifier,
            @Nullable TotemParticle particle,
            short uptime,
            float radius,
            boolean locked
    ) {
        this.statusEffect = statusEffect;
        this.statusEffectAmplifier = statusEffectAmplifier;
        this.particle = particle;
        this.uptime = uptime;
        this.radius = radius;
        this.locked = locked;
    }

    public TotemData(
            @Nullable RegistryEntry<StatusEffect> statusEffect,
            byte statusEffectAmplifier,
            @Nullable TotemParticle particle,
            short uptime,
            float radius
    ) {
        this(statusEffect, statusEffectAmplifier, particle, uptime, radius, false);
    }

    public TotemData(
            short uptime
    ) {
        this(null, (byte) 0, null, uptime, 0f);
    }

    public boolean isLocked() {
        return this.locked;
    }

    public boolean toggleLocked() {
        return setLocked(!this.locked);
    }

    public boolean setLocked(boolean locked) {
        this.locked = locked;
        return this.locked;
    }

    public NbtCompound toNbt() {
        NbtCompound compound = new NbtCompound();

        if (this.statusEffect != null) {
            NbtCompound effect = new NbtCompound();
            effect.putString("id", this.statusEffect.getIdAsString());
            effect.putByte("amplifier", this.statusEffectAmplifier);

            compound.put("effect", effect);
        }

        if (this.particle != null) {
            compound.put("particle", this.particle.toNbt());
        }

        compound.putShort("uptime", this.uptime);
        compound.putFloat("radius", this.radius);
        compound.putBoolean("locked", this.locked);

        return compound;
    }

    public static TotemData fromNbt(NbtCompound compound) {
        @Nullable RegistryEntry<StatusEffect> effect = null;
        byte amplifier = 0;
        if (compound.contains("effect")) {
            NbtCompound effectCompound = compound.getCompound("effect");
            Optional<RegistryEntry.Reference<StatusEffect>> optionalEffect = Registries.STATUS_EFFECT.getEntry(Identifier.of(effectCompound.getString("id")));

            if (optionalEffect.isPresent()) {
                effect = optionalEffect.get();
                amplifier = effectCompound.getByte("amplifier");
            }
        }

        @Nullable TotemParticle particle = null;
        if (compound.contains("particle")) {
            particle = TotemParticle.fromNbt(compound.getCompound("particle"));
        }

        short uptime = compound.getShort("uptime");
        float radius = compound.getFloat("radius");
        boolean locked = compound.getBoolean("locked");

        return new TotemData(effect, amplifier, particle, uptime, radius, locked);
    }

    public static class TotemParticle {
        @Nullable
        private ParticleType<?> type;
        @Nullable
        private NbtCompound parameters;
        private boolean rainbow = false;

        public TotemParticle(ParticleType<?> particleType) {
            this(particleType, new NbtCompound());
        }

        private TotemParticle(ParticleType<?> particleType, NbtCompound compound) {
            this.type = particleType;
            this.parameters = compound;
        }

        public TotemParticle() {
            this.rainbow = true;
        }

        public boolean isRainbow() {
            return rainbow;
        }

        public static TotemParticle makeDustParticle(float r, float g, float b, float scale) {
            NbtCompound compound = new NbtCompound();

            compound.put("color", rgbColorComponent(r, g, b));
            compound.putFloat("scale", scale);

            return new TotemParticle(ParticleTypes.DUST, compound);
        }

        public static TotemParticle makeEffectParticle(float r, float g, float b, float a) {
            NbtCompound compound = new NbtCompound();

            compound.put("color", rgbaColorComponent(r, g, b, a));

            return new TotemParticle(ParticleTypes.ENTITY_EFFECT, compound);
        }

        public static TotemParticle makeTransDustParticle(float fromR, float fromG, float fromB, float toR, float toG, float toB, float scale) {
            NbtCompound compound = new NbtCompound();

            compound.put("from_color", rgbColorComponent(fromR, fromG, fromB));
            compound.put("to_color", rgbColorComponent(toR, toG, toB));
            compound.putFloat("scale", scale);

            return new TotemParticle(ParticleTypes.DUST_COLOR_TRANSITION, compound);
        }

        public static TotemParticle makeBlockParticle(Identifier blockId) {
            NbtCompound compound = new NbtCompound();

            compound.putString("block_state", blockId.toString());

            return new TotemParticle(ParticleTypes.BLOCK, compound);
        }

        public @Nullable ParticleEffect getParticle(RegistryWrapper.WrapperLookup registryLookup) {
            if (this.type == null) return null;
            return this.type.getCodec().codec().parse(registryLookup.getOps(NbtOps.INSTANCE), parameters).getOrThrow();
        }

        public NbtCompound toNbt() {
            NbtCompound compound = new NbtCompound();

            if (this.rainbow) {
                compound.putBoolean("rainbow", true);
            } else {
                compound.putString("id", Registries.PARTICLE_TYPE.getEntry(this.type).getIdAsString());
                compound.put("parameters", this.parameters);
            }

            return compound;
        }

        public static TotemParticle fromNbt(NbtCompound compound) {
            if (compound.contains("rainbow") && compound.getBoolean("rainbow")) {
                return new TotemParticle();
            } else {
                ParticleType<?> type = Registries.PARTICLE_TYPE.get(Identifier.of(compound.getString("id")));
                NbtCompound parameters = compound.getCompound("parameters");

                return new TotemParticle(type, parameters);
            }
        }

        private static NbtList rgbColorComponent(float r, float g, float b) {
            NbtList color = new NbtList();

            color.add(0, NbtFloat.of(r));
            color.add(1, NbtFloat.of(g));
            color.add(2, NbtFloat.of(b));

            return color;
        }

        private static NbtList rgbaColorComponent(float r, float g, float b, float a) {
            NbtList color = new NbtList();

            color.add(0, NbtFloat.of(r));
            color.add(1, NbtFloat.of(g));
            color.add(2, NbtFloat.of(b));
            color.add(3, NbtFloat.of(a));

            return color;
        }
    }
}
