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
//TODO: Finish setting up the rest of the long reach componet, right now it does the same as extended reach
public enum LongReach implements StringIdentifiable {
    SHORT(0, "short", Formatting.GRAY),
    MEDIUM(1, "medium", Formatting.WHITE),
    LONG(2, "long", Formatting.GREEN);



    public static final Codec<LongReach> CODEC = StringIdentifiable.createBasicCodec(LongReach::values);
    public static final IntFunction<LongReach> ID_TO_VALUE = ValueLists.createIdToValueFunction((ToIntFunction<LongReach>) value -> value.index, values(), ValueLists.OutOfBoundsHandling.ZERO);
    public static final PacketCodec<ByteBuf, LongReach> PACKET_CODEC = PacketCodecs.indexed(ID_TO_VALUE, value -> value.index);
    private final int index;
    private final String name;
    private final Formatting formatting;

    private LongReach(final int index, final String name, final Formatting formatting) {
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
