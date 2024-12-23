package org.klepticat.ghostcraft.item;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.util.Formatting;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.function.ValueLists;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public enum ExtendedRarity implements StringIdentifiable {
    COMMON(0, "common", Formatting.WHITE),
    UNCOMMON(1, "uncommon", Formatting.GRAY),
    RARE(2, "rare", Formatting.AQUA),
    EPIC(3, "epic", Formatting.DARK_PURPLE),
    UNIQUE(4, "unique", Formatting.GOLD),
    LEGENDARY(5, "legendary", Formatting.DARK_RED);

    public static final Codec<ExtendedRarity> CODEC = StringIdentifiable.createBasicCodec(ExtendedRarity::values);
    public static final IntFunction<ExtendedRarity> ID_TO_VALUE = ValueLists.createIdToValueFunction((ToIntFunction<ExtendedRarity>) value -> value.index, values(), ValueLists.OutOfBoundsHandling.ZERO);
    public static final PacketCodec<ByteBuf, ExtendedRarity> PACKET_CODEC = PacketCodecs.indexed(ID_TO_VALUE, value -> value.index);
    private final int index;
    private final String name;
    private final Formatting formatting;

    private ExtendedRarity(final int index, final String name, final Formatting formatting) {
        this.index = index;
        this.name = name;
        this.formatting = formatting;
    }

    public Formatting getFormatting() {
        return this.formatting;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
