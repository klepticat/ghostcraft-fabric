package org.klepticat.ghostcraft.networking;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public record WaterBreathKeyPayload() implements CustomPayload {
    public static final Id<WaterBreathKeyPayload> ID = new Id<>(Constants.WATER_BREATH_PAYLOAD_ID);
    public static final PacketCodec<RegistryByteBuf, WaterBreathKeyPayload> CODEC = PacketCodec.unit(new WaterBreathKeyPayload());

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
