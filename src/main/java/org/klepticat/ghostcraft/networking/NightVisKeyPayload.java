package org.klepticat.ghostcraft.networking;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public record NightVisKeyPayload() implements CustomPayload {
    public static final Id<NightVisKeyPayload> ID = new Id<>(Constants.NIGHT_VIS_KEY_PAYLOAD_ID);
    public static final PacketCodec<RegistryByteBuf, NightVisKeyPayload> CODEC = PacketCodec.unit(new NightVisKeyPayload());

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
