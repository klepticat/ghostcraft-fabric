package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.klepticat.ghostcraft.entity.EyeBatVariant;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class EyeBatVariantComponent implements AutoSyncedComponent, Component {
    EyeBatVariant variant;
    private final Object provider;

    public EyeBatVariantComponent(Object provider) {
        this.provider = provider;
    }

    public EyeBatVariant getVariant() {
        return this.variant;
    }

    public void setVariant(EyeBatVariant variant) {
        this.variant = variant;
        GCCardinalComponents.EYE_BAT_VARIANT.sync(this.provider);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        this.setVariant(EyeBatVariant.valueOf(tag.getString("variant")));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putString("variant", this.getVariant().name());
    }
}
