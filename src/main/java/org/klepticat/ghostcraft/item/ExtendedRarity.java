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
    NULL(0, "null", Formatting.GRAY),
    CLEAN(1, "clean", Formatting.LIGHT_PURPLE),
    BALANCED(2, "balanced", Formatting.DARK_BLUE),
    UNITED(3, "united", Formatting.LIGHT_PURPLE),
    LIVING(4, "living", Formatting.WHITE),
    DEATHLY(5, "deathly", Formatting.DARK_GRAY),
    CHARM(6, "charming", Formatting.YELLOW),
    BRAVE(7, "brave", Formatting.GOLD),
    MAGIC(8, "magic", Formatting.GREEN),
    ETHEREAL(9, "ethereal", Formatting.AQUA),
    POTENT(10, "potent", Formatting.DARK_PURPLE),
    CHAOS(11, "chaotic", Formatting.DARK_RED);

// Wh common, GR uncommon, AQ rare,  PU epic, GO unique, R legendary
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
