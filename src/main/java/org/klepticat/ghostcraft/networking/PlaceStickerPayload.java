package org.klepticat.ghostcraft.networking;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.math.Direction;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.stickers.Sticker;

public record PlaceStickerPayload(Sticker sticker, int entityId, Vector3f position,
                                  Direction direction) implements CustomPayload {
    public static final Id<PlaceStickerPayload> ID = new Id<>(Constants.PLACE_STICKER_PAYLOAD_ID);
    public static final PacketCodec<RegistryByteBuf, PlaceStickerPayload> PACKET_CODEC = PacketCodec.tuple(
            Sticker.PACKET_CODEC, PlaceStickerPayload::sticker,
            PacketCodecs.INTEGER, PlaceStickerPayload::entityId,
            PacketCodecs.VECTOR3F, PlaceStickerPayload::position,
            Direction.PACKET_CODEC, PlaceStickerPayload::direction,
            PlaceStickerPayload::new
    );

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
