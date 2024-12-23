package org.klepticat.ghostcraft.networking;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public record InvisKeyPayload() implements CustomPayload {
    public static final Id<InvisKeyPayload> ID = new Id<>(Constants.INVIS_KEY_PAYLOAD_ID);
    public static final PacketCodec<RegistryByteBuf, InvisKeyPayload> CODEC = PacketCodec.unit(new InvisKeyPayload());

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
