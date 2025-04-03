package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.klepticat.ghostcraft.entity.RatVariant;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class RatVariantComponent implements Component, AutoSyncedComponent {
    RatVariant variant;
    private final Object provider;

    public RatVariantComponent(Object provider) {
        this.provider = provider;
    }

    public RatVariant getVariant() {
        return variant;
    }

    public void setVariant(RatVariant variant) {
        this.variant = variant;
        GCCardinalComponents.RAT_VARIANT.sync(this.provider);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        this.setVariant(RatVariant.valueOf(tag.getString("variant")));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putString("variant", this.getVariant().name());
    }
}
