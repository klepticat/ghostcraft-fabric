package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;

import java.util.UUID;

public class PlayerTotem implements UUIDComponent {
    UUID totemUUID;

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        if (tag.containsUuid("uuid")) this.totemUUID = tag.getUuid("uuid");
        else this.totemUUID = null;
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        if(totemUUID != null) tag.putUuid("uuid", this.getUuid());
    }

    @Override
    public UUID getUuid() {
        return totemUUID;
    }

    @Override
    public void setUuid(UUID uuid) {
        this.totemUUID = uuid;
    }
}
