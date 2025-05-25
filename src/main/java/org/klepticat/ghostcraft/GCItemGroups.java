package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.block.BlockType;

import static org.klepticat.ghostcraft.GCBlocks.*;
import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCItemGroups {
    private static final ItemGroup GC_BLOCKS = register("blocks", FabricItemGroup.builder()
            .icon(GCBlocks.EBONY_LOG.asItem()::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(ADENDA_LEAVES);
                entries.add(ENCHANTED_LEAVES);

                entries.add(ANCIENT_OAK_DOOR);
                entries.add(BOSS_DOOR);
                entries.add(AURITE);
                entries.add(AURORA_CRYSTAL);
                entries.add(BLEEDING_COIL);
                entries.add(CANDY_CANE);
                entries.add(CHOGGY_BLOGGY);
                entries.add(END_MOSS);
                entries.add(NOISE);
                entries.add(VOID);

                entries.add(BLUE_NETHERRACK);
                entries.add(BLUE_NETHERRACK_STAIRS);
                entries.add(BLUE_NETHERRACK_SLAB);
                entries.add(BLUE_NETHERRACK_WALL);

                entries.add(TEMPLE_BRICKS);
                entries.add(TEMPLE_BRICKS_STAIRS);
                entries.add(TEMPLE_BRICKS_SLAB);
                entries.add(TEMPLE_BRICKS_WALL);

                entries.add(BROWN_GRANITE);
                entries.add(BROWN_GRANITE_STAIRS);
                entries.add(BROWN_GRANITE_SLAB);
                entries.add(BROWN_GRANITE_WALL);

                entries.add(POLISHED_BROWN_GRANITE);
                entries.add(POLISHED_BROWN_GRANITE_STAIRS);
                entries.add(POLISHED_BROWN_GRANITE_SLAB);
                entries.add(POLISHED_BROWN_GRANITE_WALL);

                entries.add(SLATE);
                entries.add(SLATE_STAIRS);
                entries.add(SLATE_SLAB);
                entries.add(SLATE_WALL);

                entries.add(DARK_CHERRY_LOG);
                entries.add(DARK_CHERRY_WOOD);
                entries.add(STRIPPED_DARK_CHERRY_LOG);
                entries.add(STRIPPED_DARK_CHERRY_WOOD);
                entries.add(DARK_CHERRY_SET.get(BlockType.CUBE));
                entries.add(DARK_CHERRY_SET.get(BlockType.STAIRS));
                entries.add(DARK_CHERRY_SET.get(BlockType.SLAB));
                entries.add(DARK_CHERRY_SET.get(BlockType.FENCE));
                entries.add(DARK_CHERRY_SET.get(BlockType.GATE));
                entries.add(DARK_CHERRY_SET.get(BlockType.DOOR));
                entries.add(DARK_CHERRY_SET.get(BlockType.TRAPDOOR));
                entries.add(DARK_CHERRY_SET.get(BlockType.PRESSURE_PLATE));
                entries.add(DARK_CHERRY_SET.get(BlockType.BUTTON));
                entries.add(GCItems.DARK_CHERRY_SIGN);
                entries.add(GCItems.DARK_CHERRY_HANGING_SIGN);

                entries.add(EBONY_LOG);
                entries.add(EBONY_WOOD);
                entries.add(STRIPPED_EBONY_LOG);
                entries.add(STRIPPED_EBONY_WOOD);
                entries.add(EBONY_SET.get(BlockType.CUBE));
                entries.add(EBONY_SET.get(BlockType.STAIRS));
                entries.add(EBONY_SET.get(BlockType.SLAB));
                entries.add(EBONY_SET.get(BlockType.FENCE));
                entries.add(EBONY_SET.get(BlockType.GATE));
                entries.add(EBONY_SET.get(BlockType.DOOR));
                entries.add(EBONY_SET.get(BlockType.TRAPDOOR));
                entries.add(EBONY_SET.get(BlockType.PRESSURE_PLATE));
                entries.add(EBONY_SET.get(BlockType.BUTTON));
                entries.add(GCItems.EBONY_SIGN);
                entries.add(GCItems.EBONY_HANGING_SIGN);

                entries.add(TANGLEWOOD_LOG);
                entries.add(TANGLEWOOD);
                entries.add(TANGLEWOOD_SET.get(BlockType.CUBE));
                entries.add(TANGLEWOOD_SET.get(BlockType.STAIRS));
                entries.add(TANGLEWOOD_SET.get(BlockType.SLAB));
                entries.add(TANGLEWOOD_SET.get(BlockType.FENCE));
                entries.add(TANGLEWOOD_SET.get(BlockType.GATE));
                entries.add(TANGLEWOOD_SET.get(BlockType.PRESSURE_PLATE));
                entries.add(TANGLEWOOD_SET.get(BlockType.BUTTON));
                entries.add(TANGLEWOOD_SET.get(BlockType.WALL));

                entries.add(GLOWSHROOM_LOG);
                entries.add(GLOWSHROOM_WOOD);
                entries.add(STRIPPED_GLOWSHROOM_LOG);
                entries.add(STRIPPED_GLOWSHROOM_WOOD);
                entries.add(GLOWSHROOM_SET.get(BlockType.CUBE));
                entries.add(GLOWSHROOM_SET.get(BlockType.STAIRS));
                entries.add(GLOWSHROOM_SET.get(BlockType.SLAB));
                entries.add(GLOWSHROOM_SET.get(BlockType.FENCE));
                entries.add(GLOWSHROOM_SET.get(BlockType.GATE));
                entries.add(GLOWSHROOM_SET.get(BlockType.PRESSURE_PLATE));
                entries.add(GLOWSHROOM_SET.get(BlockType.BUTTON));

                entries.add(ANCHOR_LOG);
                entries.add(ANCHOR_WOOD);
                entries.add(STRIPPED_ANCHOR_LOG);
                entries.add(STRIPPED_ANCHOR_WOOD);
                entries.add(ANCHOR_SET.get(BlockType.CUBE));
                entries.add(ANCHOR_SET.get(BlockType.STAIRS));
                entries.add(ANCHOR_SET.get(BlockType.SLAB));
                entries.add(ANCHOR_SET.get(BlockType.FENCE));
                entries.add(ANCHOR_SET.get(BlockType.GATE));
                entries.add(ANCHOR_SET.get(BlockType.DOOR));
                entries.add(ANCHOR_SET.get(BlockType.TRAPDOOR));
                entries.add(ANCHOR_SET.get(BlockType.PRESSURE_PLATE));
                entries.add(ANCHOR_SET.get(BlockType.BUTTON));

                entries.add(APPLE_CRATE);
                entries.add(BEETROOT_CRATE);
                entries.add(GOLDEN_APPLE_CRATE);
                entries.add(GOLDEN_CARROT_CRATE);
                entries.add(CARROT_CRATE);
                entries.add(POTATO_CRATE);
                entries.add(BERRY_SACK);
                entries.add(COCOA_BEANS_SACK);
                entries.add(GLOWBERRY_SACK);
                entries.add(GUNPOWDER_SACK);
                entries.add(NETHER_WART_SACK);

                entries.add(BLACK_CORUNDUM);
                entries.add(BLACK_CORUNDUM_CLUSTER);
                entries.add(BLUE_CORUNDUM);
                entries.add(BLUE_CORUNDUM_CLUSTER);
                entries.add(GREEN_CORUNDUM);
                entries.add(GREEN_CORUNDUM_CLUSTER);
                entries.add(INDIGO_CORUNDUM);
                entries.add(INDIGO_CORUNDUM_CLUSTER);
                entries.add(ORANGE_CORUNDUM);
                entries.add(ORANGE_CORUNDUM_CLUSTER);
                entries.add(RED_CORUNDUM);
                entries.add(RED_CORUNDUM_CLUSTER);
                entries.add(VIOLET_CORUNDUM);
                entries.add(VIOLET_CORUNDUM_CLUSTER);
                entries.add(WHITE_CORUNDUM);
                entries.add(WHITE_CORUNDUM_CLUSTER);
                entries.add(YELLOW_CORUNDUM);
                entries.add(YELLOW_CORUNDUM_CLUSTER);

                entries.add(BLACK_TERRACOTTA_BRICK);
                entries.add(BLUE_TERRACOTTA_BRICK);
                entries.add(BROWN_TERRACOTTA_BRICK);
                entries.add(CYAN_TERRACOTTA_BRICK);
                entries.add(GRAY_TERRACOTTA_BRICK);
                entries.add(GREEN_TERRACOTTA_BRICK);
                entries.add(LIGHT_BLUE_TERRACOTTA_BRICK);
                entries.add(LIGHT_GRAY_TERRACOTTA_BRICK);
                entries.add(LIME_TERRACOTTA_BRICK);
                entries.add(MAGENTA_TERRACOTTA_BRICK);
                entries.add(ORANGE_TERRACOTTA_BRICK);
                entries.add(PINK_TERRACOTTA_BRICK);
                entries.add(RED_TERRACOTTA_BRICK);
                entries.add(TERRACOTTA_BRICK);
                entries.add(WHITE_TERRACOTTA_BRICK);
                entries.add(YELLOW_TERRACOTTA_BRICK);

                entries.add(CHISELED_SCULK_STONE);

                entries.add(COBBLED_SCULK_STONE);
                entries.add(COBBLED_SCULK_STONE_STAIRS);
                entries.add(COBBLED_SCULK_STONE_SLAB);
                entries.add(COBBLED_SCULK_STONE_WALL);

                entries.add(POLISHED_SCULK_STONE);
                entries.add(POLISHED_SCULK_STONE_STAIRS);
                entries.add(POLISHED_SCULK_STONE_SLAB);
                entries.add(POLISHED_SCULK_STONE_WALL);

                entries.add(CUT_SCULK_STONE);
                entries.add(CUT_SCULK_STONE_STAIRS);
                entries.add(CUT_SCULK_STONE_SLAB);

                entries.add(SCULK_STONE);
                entries.add(SCULK_STONE_STAIRS);
                entries.add(SCULK_STONE_SLAB);
                entries.add(SCULK_STONE_WALL);

                entries.add(SCULK_STONE_BRICKS);
                entries.add(SCULK_STONE_BRICKS_STAIRS);
                entries.add(SCULK_STONE_BRICKS_SLAB);
                entries.add(SCULK_STONE_BRICKS_WALL);

                entries.add(SCULK_STONE_TILES);
                entries.add(SCULK_STONE_TILES_SLAB);

                entries.add(SMOOTH_SCULK_STONE);
                entries.add(SMOOTH_SCULK_STONE_STAIRS);
                entries.add(SMOOTH_SCULK_STONE_SLAB);
                entries.add(SMOOTH_SCULK_STONE_WALL);
            })
    );

    public static void initialize() {
    }

    public static ItemGroup register(String name, ItemGroup.Builder itemGroupBuilder) {
        return Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, name), itemGroupBuilder.displayName(Text.translatable("itemGroup." + MOD_ID + "." + name)).build());
    }
}
