package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.impl.attachment.AttachmentRegistryImpl;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.stickers.Sticker;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCAttachmentTypes {
    public static final AttachmentType<Sticker> STICKER = AttachmentRegistry.<Sticker>builder()
            .persistent(Sticker.CODEC)
            .initializer(() -> GCRegistries.STICKERS.getDefaultEntry().get().value())
            .syncWith(Sticker.PACKET_CODEC, (target, player) -> true)
            .buildAndRegister(Identifier.of(MOD_ID, "sticker"));

    public static void initialize() {
    }
}
