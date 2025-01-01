package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;

public class TotemUptimeTracker implements IntComponent {
    private int uptime = 0;

    @Override
    public int get() {
        return uptime;
    }

    @Override
    public void set(int value) {
        this.uptime = value;
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        this.set(tag.getInt("lifetime"));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putInt("lifetime", this.uptime);
    }
}
