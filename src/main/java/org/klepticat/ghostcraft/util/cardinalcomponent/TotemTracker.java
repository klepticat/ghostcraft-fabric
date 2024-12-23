package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;

import java.util.UUID;

public class TotemTracker implements UUIDComponent {
    UUID totemUUID;

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        this.totemUUID = tag.getUuid("uuid");
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putUuid("uuid", this.getUuid());
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
