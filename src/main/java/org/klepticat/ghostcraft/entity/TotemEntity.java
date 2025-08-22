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
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.klepticat.ghostcraft.item.RelikItem;
import org.klepticat.ghostcraft.util.cardinalcomponent.TotemDataComponent;
import org.klepticat.ghostcraft.util.types.TotemData;

import java.util.List;
import java.util.UUID;

public class TotemEntity extends Entity implements Ownable {
    private static final TrackedData<ItemStack> ITEM = DataTracker.registerData(TotemEntity.class, TrackedDataHandlerRegistry.ITEM_STACK);
    private UUID ownerUuid;
    private Entity owner;
    private final Box visibilityBoundingBox;

    public float currentRadius = 0.0f;

    private float hue;

    public TotemEntity(EntityType<? extends Entity> entityType, RelikItem totemItem, TotemData totemData, Entity owner, World world) {
        this(entityType, totemItem, owner, world);
        this.getComponent(GCCardinalComponents.TOTEM_DATA).set(totemData);
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

        TotemDataComponent totemData = this.getComponent(GCCardinalComponents.TOTEM_DATA);

        if (this.age >= totemData.getUptime() && totemData.getUptime() > 0) {
            if (this.getOwner() != null) this.getOwner().getComponent(GCCardinalComponents.PLAYER_TOTEM).setUuid(null);
            this.discard();
        }

        List<Entity> nearbyPlayers = this.getWorld().getOtherEntities(this, Box.of(this.getPos(), this.currentRadius * 2, this.currentRadius * 2, this.currentRadius * 2), entity -> entity.isAlive() && entity.isPlayer());

        RegistryEntry<StatusEffect> statusEffect = totemData.getEffect();
        byte amplifier = totemData.getAmplifier();

        nearbyPlayers.forEach(player -> {
            if (player.getPos().distanceTo(this.getPos()) > currentRadius) return;

            ((LivingEntity) player).addStatusEffect(new StatusEffectInstance(statusEffect, 3, amplifier, true, true));
        });

        double maxRadius = totemData.getRadius();

        // grow radius on placement
        if (this.currentRadius < maxRadius)
            this.currentRadius += (float) (maxRadius / 10.0);
        else this.currentRadius = (float) maxRadius;

        if (this.getWorld().isClient()) {
            if (maxRadius != 0.0) {
                RegistryWrapper.WrapperLookup wrapperLookup = getWorld().getRegistryManager();

                double radius = this.currentRadius;

                int stepSize = 15;

                Vec3d lastParticlePos = new Vec3d(this.getX() + radius, this.getY(), this.getZ());

                float h = ((hue % 360) / 60) % 6;
                float r, g, b;

                if (h < 1) {
                    r = 1;
                    g = h;
                    b = 0;
                } else if (h < 2) {
                    r = 2 - h;
                    g = 1;
                    b = 0;
                } else if (h < 3) {
                    r = 0;
                    g = 1;
                    b = h - 2;
                } else if (h < 4) {
                    r = 0;
                    g = 4 - h;
                    b = 1;
                } else if (h < 5) {
                    r = h - 4;
                    g = 0;
                    b = 1;
                } else {
                    r = 1;
                    g = 0;
                    b = 6 - h;
                }


                ParticleEffect particleEffect = totemData.getParticle().isRainbow() ? TotemData.TotemParticle.makeDustParticle(r, g, b, 1.0f).getParticle(wrapperLookup) : totemData.getParticle().getParticle(wrapperLookup);

                // particle ring
                for (int angle = stepSize; angle <= 360; angle += stepSize) {
                    double angleRadians = (2 * Math.PI) * angle / 360;

                    Vec3d particlePos = new Vec3d((radius) * Math.cos(angleRadians) + this.getX(), this.getY(), (radius) * Math.sin(angleRadians) + this.getZ());

                    ClientParticles.setParticleCount((int) Math.round(maxRadius * 0.5));
                    ClientParticles.spawnLine(
                            particleEffect,
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
                            particleEffect,
                            this.getWorld(),
                            particlePos,
                            0.1f
                    );
                }
            }
        }

        this.hue = this.hue > 360 ? hue - 360 : hue + 2;
    }
}
