package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.klepticat.ghostcraft.AllCardinalComponents;
import org.klepticat.ghostcraft.item.MagicType;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class MagicTypeTracker implements MagicTypeComponent, AutoSyncedComponent {
    MagicType magicType;
    private final Object provider;

    public MagicTypeTracker(Object provider) {
        this.provider = provider;
    }

    @Override
    public MagicType getMagicType() {
        return this.magicType;
    }

    @Override
    public void setMagicType(MagicType magicType) {
        this.magicType = magicType;
        AllCardinalComponents.MAGIC_TYPE_TRACKER.sync(this.provider);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        this.setMagicType(MagicType.valueOf(tag.getString("type")));
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putString("type", this.magicType.name());
    }
}
