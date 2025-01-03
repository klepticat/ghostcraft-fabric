package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.klepticat.ghostcraft.AllCardinalComponents;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class TotemRadius implements FloatComponent, AutoSyncedComponent {
    private final Object provider;
    private float radius = 0;

    public TotemRadius(Object provider) {
        this.provider = provider;
    }

    @Override
    public float get() {
        return this.radius;
    }

    @Override
    public void set(float value) {
        this.radius = value;
        AllCardinalComponents.TOTEM_RADIUS.sync(provider);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        this.set(tag.getFloat("radius"));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putFloat("radius", this.radius);
    }
}
