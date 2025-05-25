package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCWoodTypes {
    public static final WoodType EBONY = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(MOD_ID, "ebony"), BlockSetType.OAK);
    public static final WoodType DARK_CHERRY = WoodTypeBuilder.copyOf(WoodType.MANGROVE).register(Identifier.of(MOD_ID, "dark_cherry"), BlockSetType.MANGROVE);
    public static final WoodType TANGLEWOOD = WoodTypeBuilder.copyOf(WoodType.WARPED).register(Identifier.of(MOD_ID, "tanglewood"), BlockSetType.WARPED);
    public static final WoodType ANCHOR = WoodTypeBuilder.copyOf(WoodType.ACACIA).register(Identifier.of(MOD_ID, "anchor"), BlockSetType.ACACIA);

    public static void initialize() {
    }
}
