package org.klepticat.ghostcraft.entity;

import io.wispforest.owo.particles.ClientParticles;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Ownable;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Colors;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.AllCardinalComponents;
import org.klepticat.ghostcraft.item.RelikItem;

import java.util.List;
import java.util.UUID;

public class TotemEntity extends Entity implements Ownable {
    private static final TrackedData<ItemStack> ITEM = DataTracker.registerData(TotemEntity.class, TrackedDataHandlerRegistry.ITEM_STACK);
    private UUID ownerUuid;
    private Entity owner;
    private Box visibilityBoundingBox;

    public float currentRadius = 0.0f;

    public TotemEntity(EntityType<? extends Entity> entityType, RelikItem totemItem, float radius, short uptime, RegistryEntry<StatusEffect> effect, byte effectAmplifier, Entity owner, World world) {
        this(entityType, totemItem, owner, world);
        this.getComponent(AllCardinalComponents.TOTEM_RADIUS).set(radius);
        this.getComponent(AllCardinalComponents.TOTEM_UPTIME).set(uptime);
        this.getComponent(AllCardinalComponents.TOTEM_STATUS_EFFECT).setEffect(effect, effectAmplifier);
    }

    public TotemEntity(EntityType<? extends Entity> entityType, RelikItem totemItem, Entity owner, World world) {
        super(entityType, world);
        this.setOwner(owner);
        dataTracker.set(ITEM, totemItem.getDefaultStack());
        this.visibilityBoundingBox = this.getBoundingBox();
        this.ignoreCameraFrustum = true;
    }

    public TotemEntity(EntityType<? extends Entity> entityType, World world) {
        super(entityType, world);
        this.visibilityBoundingBox = this.getBoundingBox();
        this.ignoreCameraFrustum = true;
    }

    @Override
    public Box getVisibilityBoundingBox() {
        return this.visibilityBoundingBox;
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) { builder.add(ITEM, new ItemStack(this.getDefaultItem())); }

    public void setItemStack(ItemStack itemStack) { dataTracker.set(ITEM, itemStack); }

    public ItemStack getItemStack() { return dataTracker.get(ITEM); }

    protected Item getDefaultItem() { return Items.BARRIER; }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        if (nbt.containsUuid("Owner")) {
            this.ownerUuid = nbt.getUuid("Owner");
            this.owner = null;
        }

        if (nbt.contains("Item", NbtElement.COMPOUND_TYPE)) {
            this.setItemStack(ItemStack.fromNbtOrEmpty(this.getRegistryManager(), nbt.getCompound("Item")));
        }
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        if (this.ownerUuid != null) {
            nbt.putUuid("Owner", this.ownerUuid);
        }

        nbt.put("Item", this.getItemStack().encode(this.getRegistryManager()));
    }

    public void setOwner(@Nullable Entity owner) {
        if(owner != null) {
            this.owner = owner;
            this.ownerUuid = owner.getUuid();
        }
    }

    @Nullable
    @Override
    public Entity getOwner() {
        if (this.owner != null && !this.owner.isRemoved()) {
            return this.owner;
        } else if (this.ownerUuid != null && this.getWorld() instanceof ServerWorld serverWorld) {
            this.owner = serverWorld.getEntity(this.ownerUuid);
            return this.owner;
        } else {
            return null;
        }
    }

    public boolean isOwner(Entity entity) { return entity.getUuid().equals(this.ownerUuid); }

    @Override
    public void tick() {
        super.tick();

        if (this.age >= this.getComponent(AllCardinalComponents.TOTEM_UPTIME).get() && this.getComponent(AllCardinalComponents.TOTEM_UPTIME).get() > 0) {
            if (this.getOwner() != null) this.getOwner().getComponent(AllCardinalComponents.PLAYER_TOTEM).setUuid(null);
            this.discard();
        }

        List<Entity> nearbyPlayers = this.getWorld().getOtherEntities(this, Box.of(this.getPos(), this.currentRadius * 2, this.currentRadius * 2, this.currentRadius * 2), entity -> entity.isAlive() && entity.isPlayer());

        RegistryEntry<StatusEffect> statusEffect = this.getComponent(AllCardinalComponents.TOTEM_STATUS_EFFECT).getEffect();
        byte amplifier = this.getComponent(AllCardinalComponents.TOTEM_STATUS_EFFECT).getAmplifier();

        nearbyPlayers.forEach(player -> {
            if (player.getPos().distanceTo(this.getPos()) > currentRadius) return;

            ((LivingEntity) player).addStatusEffect(new StatusEffectInstance(statusEffect, 3, amplifier, true, true));
        });

        if (this.currentRadius < this.getComponent(AllCardinalComponents.TOTEM_RADIUS).get())
            this.currentRadius += this.getComponent(AllCardinalComponents.TOTEM_RADIUS).get() / 10.0;
        else this.currentRadius = this.getComponent(AllCardinalComponents.TOTEM_RADIUS).get();

        if (this.getWorld().isClient()) {
            double maxRadius = this.getComponent(AllCardinalComponents.TOTEM_RADIUS).get();
            if (maxRadius != 0.0) {
                double radius = this.currentRadius;

                int stepSize = 15;
                int particleColor = Colors.WHITE;

                if (statusEffect != null)
                    particleColor = ColorHelper.Argb.withAlpha(255, statusEffect.value().getColor());

                Vec3d lastParticlePos = new Vec3d(this.getX() + radius, this.getY(), this.getZ());

                // particle ring
                for (int angle = stepSize; angle <= 360; angle += stepSize) {
                    double angleRadians = (2 * Math.PI) * angle / 360;

                    Vec3d particlePos = new Vec3d((radius) * Math.cos(angleRadians) + this.getX(), this.getY(), (radius) * Math.sin(angleRadians) + this.getZ());

                    ClientParticles.setParticleCount((int) Math.round(maxRadius * 0.5));
                    ClientParticles.spawnLine(
                            new DustParticleEffect(new Vector3f(ColorHelper.Argb.getRed(particleColor) / 255.0f, ColorHelper.Argb.getGreen(particleColor) / 255.0f, ColorHelper.Argb.getBlue(particleColor) / 255.0f), (float) (this.currentRadius / maxRadius)),
                            this.getWorld(),
                            lastParticlePos,
                            particlePos,
                            0.0f
                    );

                    lastParticlePos = particlePos;
                }

                // random particles in particle sphere
                ClientParticles.setParticleCount(1);

                for (int particle = 0; particle < Math.round(maxRadius * maxRadius * 0.25); particle++) {
                    double randomYaw = (2 * Math.PI) * Math.random();
                    double randomPitch = (2 * Math.PI) * Math.random() * 90 / 360;

                    Vec3d particlePos = new Vec3d((radius) * Math.cos(randomYaw) * Math.sin(randomPitch) + this.getX(), radius * Math.cos(randomPitch) + this.getY(), (radius) * Math.sin(randomYaw) * Math.sin(randomPitch) + this.getZ());

                    ClientParticles.spawn(
                            new DustParticleEffect(new Vector3f(ColorHelper.Argb.getRed(particleColor) / 255.0f, ColorHelper.Argb.getGreen(particleColor) / 255.0f, ColorHelper.Argb.getBlue(particleColor) / 255.0f), (float) (this.currentRadius / maxRadius)),
                            this.getWorld(),
                            particlePos,
                            0.1f
                    );
                }
            }
        }
    }
}
