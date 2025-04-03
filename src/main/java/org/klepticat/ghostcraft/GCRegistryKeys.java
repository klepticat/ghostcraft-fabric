package org.klepticat.ghostcraft;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.stickers.Sticker;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCRegistryKeys {
    public static final RegistryKey<Registry<Sticker>> STICKERS = RegistryKey.ofRegistry(Identifier.of(MOD_ID, "stickers"));

    public static void initialize() {
    }
}
