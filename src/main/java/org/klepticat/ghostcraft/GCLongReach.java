package org.klepticat.ghostcraft;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.item.ExtendedRarity;
import org.klepticat.ghostcraft.item.LongReach;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCLongReach {
    public static final ComponentType<LongReach> GC_LONGREACH = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(MOD_ID, "gc_longreach"),
            ComponentType.<LongReach>builder().codec(LongReach.CODEC).build()
    );

    public static void initialize() {}
}