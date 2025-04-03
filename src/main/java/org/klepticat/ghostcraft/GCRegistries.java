package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.registry.DefaultedRegistry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.stickers.Sticker;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCRegistries {
    public static final DefaultedRegistry<Sticker> STICKERS = FabricRegistryBuilder.createDefaulted(GCRegistryKeys.STICKERS, Identifier.of(MOD_ID, "default")).buildAndRegister();

    public static void initialize() {
    }
}
