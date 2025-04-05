package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class PlayerSticker implements UUIDComponent {
    UUID stickerUuid;

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.@NotNull WrapperLookup registryLookup) {
        if (tag.containsUuid("uuid")) this.stickerUuid = tag.getUuid("uuid");
        else this.stickerUuid = null;
    }

    @Override
    public void writeToNbt(@NotNull NbtCompound tag, RegistryWrapper.@NotNull WrapperLookup registryLookup) {
        if (stickerUuid != null) tag.putUuid("uuid", this.getUuid());
    }

    @Override
    public UUID getUuid() {
        return stickerUuid;
    }

    @Override
    public void setUuid(UUID uuid) {
        this.stickerUuid = uuid;
    }
}
