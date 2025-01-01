package org.klepticat.ghostcraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Ownable;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.klepticat.ghostcraft.AllCardinalComponents;
import org.klepticat.ghostcraft.item.RelikItem;

import java.util.UUID;

public class TotemEntity extends Entity implements Ownable {
    private static final TrackedData<ItemStack> ITEM = DataTracker.registerData(TotemEntity.class, TrackedDataHandlerRegistry.ITEM_STACK);
    private UUID ownerUuid;
    private Entity owner;
    private Box visibilityBoundingBox;

    public double currentRadius = 0.0;

    public TotemEntity(EntityType<? extends Entity> entityType, RelikItem totemItem, double radius, Entity owner, World world) {
        this(entityType, totemItem, owner, world);
        this.getComponent(AllCardinalComponents.TOTEM_RADIUS_TRACKER).set(radius);
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

        if(this.currentRadius < this.getComponent(AllCardinalComponents.TOTEM_RADIUS_TRACKER).get()) this.currentRadius += this.getComponent(AllCardinalComponents.TOTEM_RADIUS_TRACKER).get() / 10.0;
    }
}
