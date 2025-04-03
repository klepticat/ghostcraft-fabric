package org.klepticat.ghostcraft.entity.stickers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Ownable;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.klepticat.ghostcraft.GCAttachmentTypes;
import org.klepticat.ghostcraft.stickers.Sticker;

import java.util.UUID;

public class StickerEntity extends Entity implements Ownable {
    @Nullable
    UUID ownerUuid;
    @Nullable
    Entity owner;
    protected Direction facing = Direction.SOUTH;
    private Sticker sticker;

    public StickerEntity(EntityType<? extends Entity> type, World world, Sticker sticker, Entity owner, Direction facing) {
        this(type, world, sticker);
        this.setOwner(owner);
        this.setFacing(facing);
    }

    public StickerEntity(EntityType<? extends Entity> type, World world, Sticker sticker) {
        super(type, world);
        this.setSticker(sticker);
    }

    public StickerEntity(EntityType<? extends Entity> type, World world) {
        super(type, world);
    }

    public void setSticker(Sticker sticker) {
        this.setAttached(GCAttachmentTypes.STICKER, sticker);
        this.sticker = sticker;
    }

    public Sticker getSticker() {
        Sticker sticker1 = this.getAttachedOrCreate(GCAttachmentTypes.STICKER);
        this.sticker = sticker1;
        return sticker1;
    }

    public void setOwner(@Nullable Entity owner) {
        if (owner != null) {
            this.owner = owner;
            this.ownerUuid = owner.getUuid();
        }
    }

    @Override
    public @Nullable Entity getOwner() {
        if (this.owner != null && !this.owner.isRemoved()) {
            return this.owner;
        } else if (this.ownerUuid != null && this.getWorld() instanceof ServerWorld serverWorld) {
            this.owner = serverWorld.getEntity(this.ownerUuid);
            return this.owner;
        } else {
            return null;
        }
    }

    public boolean isOwner(@NotNull Entity entity) {
        return entity.getUuid().equals(this.ownerUuid);
    }

    protected void setFacing(@NotNull Direction facing) {
        this.facing = facing;
        if (facing.getAxis().isHorizontal()) {
            this.setPitch(0.0F);
            this.setYaw((float) (this.facing.getHorizontal() * 90));
        } else {
            this.setPitch((float) (-90 * facing.getDirection().offset()));
            this.setYaw(0.0F);
        }

        this.prevPitch = this.getPitch();
        this.prevYaw = this.getYaw();
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        if (nbt.containsUuid("Owner")) {
            this.ownerUuid = nbt.getUuid("Owner");
            this.owner = null;
        }

        //this.setSticker(GCRegistries.STICKERS.get(Identifier.tryParse(nbt.getString("Sticker"))));
        this.setFacing(Direction.byId(nbt.getByte("Facing")));
    }

    @Override
    protected void writeCustomDataToNbt(@NotNull NbtCompound nbt) {
        if (this.ownerUuid != null) {
            nbt.putUuid("Owner", this.ownerUuid);
        }

        //nbt.putString("Sticker", GCRegistries.STICKERS.getId(this.getSticker()).toString());
        nbt.putByte("Facing", (byte) this.facing.getId());
    }
}
