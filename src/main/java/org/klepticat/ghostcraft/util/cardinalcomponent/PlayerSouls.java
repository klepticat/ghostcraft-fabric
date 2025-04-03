package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class PlayerSouls implements ByteComponent, AutoSyncedComponent {
    private byte souls = 0;
    private final Object provider;

    public PlayerSouls(Object provider) {
        this.provider = provider;
    }

    @Override
    public byte get() {
        return this.souls;
    }

    @Override
    public void set(byte value) {
        souls = value;
        GCCardinalComponents.PLAYER_SOULS.sync(this.provider);
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
