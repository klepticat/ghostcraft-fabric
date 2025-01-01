package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.klepticat.ghostcraft.AllCardinalComponents;
import org.klepticat.ghostcraft.entity.TotemEntity;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class TotemRadiusTracker implements DoubleComponent, AutoSyncedComponent {
    private final Object provider;
    private double radius = 0;

    public TotemRadiusTracker(Object provider) {
        this.provider = provider;
    }

    @Override
    public double get() {
        return this.radius;
    }

    @Override
    public void set(double value) {
        this.radius = value;
        AllCardinalComponents.TOTEM_RADIUS_TRACKER.sync(provider);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        this.set(tag.getDouble("radius"));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putDouble("radius", this.radius);
    }
}
