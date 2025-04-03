package org.klepticat.ghostcraft.entity;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.klepticat.ghostcraft.stickers.Sticker;

public interface GCPlayerEntityStickers {
    Sticker selectedSticker = null;

    void setSelectedSticker(Sticker sticker);

    void setSelectedSticker(Identifier identifier);

    Sticker getSelectedSticker();

    boolean placeSticker(Sticker sticker, Vec3d position, Direction direction);

    void cancelStickerPlacement();

    boolean hasStickerSelected();
}
