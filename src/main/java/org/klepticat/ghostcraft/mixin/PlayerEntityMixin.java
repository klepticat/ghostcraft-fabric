package org.klepticat.ghostcraft.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.klepticat.ghostcraft.GCEntityTypes;
import org.klepticat.ghostcraft.GCRegistries;
import org.klepticat.ghostcraft.entity.GCPlayerEntityStickers;
import org.klepticat.ghostcraft.entity.stickers.StickerEntity;
import org.klepticat.ghostcraft.item.ExtendedElytraItem;
import org.klepticat.ghostcraft.stickers.Sticker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin implements GCPlayerEntityStickers {
    @Unique
    Sticker sticker;

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"), method = "checkFallFlying")
    public boolean itemIsElytra(ItemStack instance, Item item) {
        return ExtendedElytraItem.itemIsElytra(instance);
    }

    @Override
    public void setSelectedSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    @Override
    public void setSelectedSticker(Identifier identifier) {
        this.sticker = GCRegistries.STICKERS.get(identifier);
    }

    @Override
    public Sticker getSelectedSticker() {
        return this.sticker;
    }

    @Override
    public boolean placeSticker(Sticker sticker, Vec3d position, Direction direction) {
        PlayerEntity __this = (PlayerEntity) (Object) this;

        if (__this.getWorld() instanceof ServerWorld world) {
            Vec3d stickerPos = position.add(0.0, -0.5, 0.0);

            StickerEntity stickerEntity = new StickerEntity(GCEntityTypes.STICKER, world, sticker, __this, direction);
            stickerEntity.setPosition(stickerPos);

            world.spawnEntityAndPassengers(stickerEntity);

            return true;
        } else return false;
    }

    @Override
    public void cancelStickerPlacement() {
        this.sticker = null;
    }

    @Override
    public boolean hasStickerSelected() {
        return !(this.sticker == null);
    }
}
