package org.klepticat.ghostcraft;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.item.ExtendedRarity;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class AllDataComponents {
    public static final ComponentType<ExtendedRarity> GC_RARITY = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(MOD_ID, "gc_rarity"),
            ComponentType.<ExtendedRarity>builder().codec(ExtendedRarity.CODEC).build()
    );

    public static void initialize() {}
}
