package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;

public class TotemUptime implements ShortComponent {
    private short uptime = 0;

    @Override
    public short get() {
        return uptime;
    }

    @Override
    public void set(short value) {
        this.uptime = value;
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        this.set(tag.getShort("lifetime"));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putShort("lifetime", this.uptime);
    }
}
