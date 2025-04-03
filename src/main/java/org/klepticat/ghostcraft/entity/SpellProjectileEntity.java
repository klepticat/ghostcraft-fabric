package org.klepticat.ghostcraft.entity;

import net.minecraft.entity.*;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.klepticat.ghostcraft.GCEntityTypes;
import org.klepticat.ghostcraft.GCItems;
import org.klepticat.ghostcraft.item.MagicType;

public class SpellProjectileEntity extends ProjectileEntity implements FlyingItemEntity {
    private static final TrackedData<ItemStack> ITEM = DataTracker.registerData(SpellProjectileEntity.class, TrackedDataHandlerRegistry.ITEM_STACK);
    private MagicType magicType;

    private int damage = 2;

    public SpellProjectileEntity(MagicType magicType, int damage, LivingEntity owner, World world) {
        this(magicType, owner, world);

        this.damage = damage;
    }

    public SpellProjectileEntity(EntityType<? extends ProjectileEntity> entityType, World world) {
        super(entityType, world);

        if(this.magicType == null) {
            this.magicType = MagicType.MAGIC;
            this.getComponent(GCCardinalComponents.MAGIC_TYPE_TRACKER).setMagicType(MagicType.MAGIC);
        }
    }

    public SpellProjectileEntity(MagicType magicType, LivingEntity owner, World world) {
        this(GCEntityTypes.SPELL_PROJECTILE, world);

        this.magicType = magicType;
        this.getComponent(GCCardinalComponents.MAGIC_TYPE_TRACKER).setMagicType(magicType);

        switch (this.magicType) {
            case ETHEREAL -> {
                this.getDataTracker().set(ITEM, new ItemStack(GCItems.ETHEREAL_CHARGE));
            }
            case DIRE -> {
                this.getDataTracker().set(ITEM, new ItemStack(GCItems.DIRE_CHARGE));
            }
            case POTENT -> {
                this.getDataTracker().set(ITEM, new ItemStack(GCItems.POTENT_CHARGE));
            }
            default -> {
                this.getDataTracker().set(ITEM, new ItemStack(GCItems.MAGIC_CHARGE));
            }
        }
        this.setOwner(owner);
        this.setPosition(owner.getX(), owner.getEyeY() - 0.1F, owner.getZ());
    }

    public SpellProjectileEntity(EntityType<? extends ProjectileEntity> entityType, LivingEntity owner, World world) {
        super(entityType, world);
        this.setOwner(owner);
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getStack();
        return (ParticleEffect)(new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack));
    }

    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            ParticleEffect particleEffect = this.getParticleParameters();

            for (int i = 0; i < 8; i++) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), (float)this.damage);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.discard();
        }
    }

    @Override
    public void tick() {
        super.tick();
        HitResult hitResult = ProjectileUtil.getCollision(this, this::canHit);
        if (hitResult.getType() != HitResult.Type.MISS) {
            this.hitOrDeflect(hitResult);
        }

        this.checkBlockCollision();
        Vec3d vec3d = this.getVelocity();
        double d = this.getX() + vec3d.x;
        double e = this.getY() + vec3d.y;
        double f = this.getZ() + vec3d.z;
        this.updateRotation();
        float h;
        if (this.isTouchingWater()) {
            for (int i = 0; i < 4; i++) {
                float g = 0.25F;
                this.getWorld().addParticle(ParticleTypes.BUBBLE, d - vec3d.x * 0.25, e - vec3d.y * 0.25, f - vec3d.z * 0.25, vec3d.x, vec3d.y, vec3d.z);
            }

            h = 0.8F;
        } else {
            h = 0.99F;
        }

        //GhostCraft.LOGGER.info(this.getComponent(GCCardinalComponents.MAGIC_TYPE_TRACKER).getMagicType().toString());

        this.getWorld().addParticle(new DustParticleEffect(this.getComponent(GCCardinalComponents.MAGIC_TYPE_TRACKER).getMagicType().color, 1.0f), d - vec3d.x * 0.25, e - vec3d.y * 0.25, f - vec3d.z * 0.25, vec3d.x, vec3d.y, vec3d.z);

        this.setVelocity(vec3d.multiply((double)h));
        this.applyGravity();
        this.setPosition(d, e, f);
    }

    protected Item getDefaultItem() {
        return GCItems.MAGIC_CHARGE;
    }

    @Override
    public ItemStack getStack() { return this.getDataTracker().get(ITEM); }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        builder.add(ITEM, new ItemStack(this.getDefaultItem()));
    }
}
