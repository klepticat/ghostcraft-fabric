package org.klepticat.ghostcraft.stickers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.klepticat.ghostcraft.GCRegistries;

public class Sticker {
    public static final Codec<Sticker> CODEC = RecordCodecBuilder.create(stickerInstance ->
            stickerInstance.group(
                    Identifier.CODEC.fieldOf("texture").forGetter(Sticker::getTexture)
            ).apply(stickerInstance, texture1 -> new Sticker(texture1, true))
    );
    public static final PacketCodec<PacketByteBuf, Sticker> PACKET_CODEC = PacketCodec.tuple(Identifier.PACKET_CODEC, Sticker::getTexture, texture1 -> new Sticker(texture1, true));

    public String translationKey;
    private final Identifier texture;
    private final boolean showInMenu;

    public Sticker(Identifier texture, boolean showInMenu) {
        this.texture = texture;
        this.showInMenu = showInMenu;
    }

    public Identifier getTexture() {
        return this.texture;
    }

    public String toString() {
        return GCRegistries.STICKERS.getEntry(this).getIdAsString();
    }

    public Text getName() {
        return Text.translatable(this.getTranslationKey());
    }

    protected String getOrCreateTranslationKey() {
        if (this.translationKey == null)
            this.translationKey = Util.createTranslationKey("sticker", GCRegistries.STICKERS.getId(this));

        return this.translationKey;
    }

    public String getTranslationKey() {
        return this.getOrCreateTranslationKey();
    }

    public boolean isShowInMenu() {
        return showInMenu;
    }
}
