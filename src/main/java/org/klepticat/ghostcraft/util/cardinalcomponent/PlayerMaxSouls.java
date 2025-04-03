package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class PlayerMaxSouls implements ByteComponent, AutoSyncedComponent {
    private final Object provider;
    private byte maxSouls = 10;

    public PlayerMaxSouls(Object provider) {
        this.provider = provider;
    }

    @Override
    public byte get() {
        return this.maxSouls;
    }

    @Override
    public void set(byte value) {
        if (value == 0) return;

        this.maxSouls = value;
        GCCardinalComponents.PLAYER_MAX_SOULS.sync(provider);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        set(tag.getByte("souls"));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putByte("souls", get());
    }
}
