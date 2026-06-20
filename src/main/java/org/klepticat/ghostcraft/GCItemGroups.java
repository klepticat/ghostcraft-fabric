package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.GoatHornItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.block.BlockType;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import static org.klepticat.ghostcraft.GCBlocks.*;
import static org.klepticat.ghostcraft.GCItems.*;
import static org.klepticat.ghostcraft.GCItems.WarriorItems.SICKLE;
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
                entries.add(CABBAGE_BLOCK);
                entries.add(CHOGGY_BLOGGY);
                entries.add(END_MOSS);
                entries.add(NOISE);
                entries.add(VOID);

                entries.add(CHECK_MARK);
                entries.add(X_MARK);

                entries.add(LIGHT_COBBLED_DREADSTONE);
                entries.add(LIGHT_COBBLED_DREADSTONE_STAIRS);
                entries.add(LIGHT_COBBLED_DREADSTONE_SLAB);
                entries.add(LIGHT_COBBLED_DREADSTONE_WALL);

                entries.add(POLISHED_LIGHT_DREADSTONE);
                entries.add(POLISHED_LIGHT_DREADSTONE_STAIRS);
                entries.add(POLISHED_LIGHT_DREADSTONE_SLAB);
                entries.add(POLISHED_LIGHT_DREADSTONE_WALL);

                entries.add(RIVETED_LIGHT_DREADSTONE);
                entries.add(RIVETED_LIGHT_DREADSTONE_STAIRS);
                entries.add(RIVETED_LIGHT_DREADSTONE_SLAB);
                entries.add(RIVETED_LIGHT_DREADSTONE_WALL);

                entries.add(BLOODY_LIGHT_DREADSTONE);
                entries.add(BLOODY_LIGHT_DREADSTONE_STAIRS);
                entries.add(BLOODY_LIGHT_DREADSTONE_SLAB);
                entries.add(BLOODY_LIGHT_DREADSTONE_WALL);

                entries.add(BLOODY_LIGHT_DREADSTONE_BRICKS);
                entries.add(BLOODY_LIGHT_DREADSTONE_BRICKS_STAIRS);
                entries.add(BLOODY_LIGHT_DREADSTONE_BRICKS_SLAB);
                entries.add(BLOODY_LIGHT_DREADSTONE_BRICKS_WALL);
                entries.add(TILED_LIGHT_DREADSTONE);
                entries.add(LIGHT_DREADSTONE_DOOR);
                entries.add(LIGHT_DREADSTONE_TRAPDOOR);

                entries.add(DREADSTONE_BLOCK);
                entries.add(DREADSTONE_BLOCK_STAIRS);
                entries.add(DREADSTONE_BLOCK_SLAB);
                entries.add(DREADSTONE_BLOCK_WALL);


                entries.add(GRATED_DREADSTONE);
                entries.add(GRATED_DREADSTONE_STAIRS);
                entries.add(GRATED_DREADSTONE_SLAB);
                entries.add(GRATED_DREADSTONE_WALL);

                entries.add(POLISHED_DREADSTONE);

                entries.add(POLISHED_CHISELED_DREADSTONE);
                entries.add(POLISHED_CHISELED_DREADSTONE_STAIRS);
                entries.add(POLISHED_CHISELED_DREADSTONE_SLAB);
                entries.add(POLISHED_CHISELED_DREADSTONE_WALL);

                entries.add(CHISELED_DREADSTONE);

                entries.add(COBBLED_DREADSTONE);
                entries.add(COBBLED_DREADSTONE_STAIRS);
                entries.add(COBBLED_DREADSTONE_SLAB);
                entries.add(COBBLED_DREADSTONE_WALL);

                entries.add(TILED_COBBLED_DREADSTONE);
                entries.add(TILED_COBBLED_DREADSTONE_STAIRS);
                entries.add(TILED_COBBLED_DREADSTONE_SLAB);
                entries.add(TILED_COBBLED_DREADSTONE_WALL);


                entries.add(DREADSTONE_BRICKS);
                entries.add(DREADSTONE_BRICKS_STAIRS);
                entries.add(DREADSTONE_BRICKS_SLAB);

                entries.add(DREADSTONE_PILLAR);
                entries.add(DREADSTONE_GLASS);
                entries.add(DREADSTONE_GLASS_BLACK);
                entries.add(DREADSTONE_GLASS_BLUE);
                entries.add(DREADSTONE_GLASS_BROWN);
                entries.add(DREADSTONE_GLASS_CYAN);
                entries.add(DREADSTONE_GLASS_GREEN);
                entries.add(DREADSTONE_GLASS_LIGHT);
                entries.add(DREADSTONE_GLASS_LIGHT_BLUE);
                entries.add(DREADSTONE_GLASS_LIME);
                entries.add(DREADSTONE_GLASS_ORANGE);
                entries.add(DREADSTONE_GLASS_PINK);
                entries.add(DREADSTONE_GLASS_PURPLE);
                entries.add(DREADSTONE_GLASS_RED);
                entries.add(DREADSTONE_GLASS_SOUL);
                entries.add(DREADSTONE_GLASS_WHITE);
                entries.add(DREADSTONE_GLASS_YELLOW);
                entries.add(DREADSTONE_BARS);
                entries.add(DREADSTONE_LAMP);
                entries.add(DREADSTONE_WINDOW);
                entries.add(DREADSTONE_GRATE);

                entries.add(DREADSTONE_DOOR);
                entries.add(DREADSTONE_TRAPDOOR);
                entries.add(LOCKED_DREADSTONE_DOOR);

                entries.add(GRATED_IRON_TRAPDOOR);
                entries.add(GRATED_SPRUCE_TRAPDOOR);
                entries.add(DREADWOOD_TRAPDOOR);

                entries.add(SOUL_QUARTZ_BLOCK);
                entries.add(SMOOTH_SOUL_QUARTZ);
                entries.add(SOUL_QUARTZ_BRICKS);
                entries.add(CRACKED_SOUL_QUARTZ_BRICKS);
                entries.add(SOUL_QUARTZ_PILLAR);


                entries.add(SMOOTH_LAPIS_BLOCK);
                entries.add(LAPIS_BRICKS);
                entries.add(LAPIS_TILES);
                entries.add(CHISELED_LAPIS);
                entries.add(LAPIS_PILLAR);

                entries.add(GILDED_LAPIS_BLOCK);
                entries.add(GILDED_LAPIS_BRICKS);
                entries.add(GILDED_LAPIS_TILES);
                entries.add(GILDED_FANCY_LAPIS);
                entries.add(GILDED_LAPIS_PILLAR);

                entries.add(ITERATOR_PULSE);
                entries.add(ITERATOR_PROJECTION_TILE);
                entries.add(ITERATOR_PROCESSING_SCREEN);

                entries.add(MARBLED_FLESH);
                entries.add(MARBLED_FLESH_STAIRS);
                entries.add(MARBLED_FLESH_SLAB);
                entries.add(MARBLED_FLESH_FENCE);

                entries.add(SCALED_FLESH);
                entries.add(SCALED_FLESH_STAIRS);
                entries.add(SCALED_FLESH_SLAB);
                entries.add(SCALED_FLESH_WALL);

                entries.add(CRIMSON_WOOL);
                entries.add(CRIMSON_CARPET);

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

                entries.add(WATCHFUL_ASPEN);
                entries.add(WEEPING_BARK);

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

                entries.add(BLUE_ENCHANTED_LOG);
                entries.add(BLUE_ENCHANTED);
                entries.add(STRIPPED_BLUE_ENCHANTED_LOG);

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

                entries.add(COOKING_POT);
                entries.add(COOKING_POT_HANDLE);
                entries.add(COOKING_POT_TRAY);

                entries.add(APPLE_CRATE);
                entries.add(CABBAGE_CRATE);
                entries.add(BEETROOT_CRATE);
                entries.add(GOLDEN_APPLE_CRATE);
                entries.add(GOLDEN_CARROT_CRATE);
                entries.add(CARROT_CRATE);
                entries.add(CARROT_CRATE_SPRUCE);
                entries.add(POTATO_CRATE);
                entries.add(POTATO_CRATE_SPRUCE);
                entries.add(TOMATO_CRATE);
                entries.add(ONION_CRATE);
                entries.add(BERRY_SACK);
                entries.add(RICE_BAG);
                entries.add(RICE_BALE);
                entries.add(STRAW_BALE);
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
                entries.add(BLACK_TERRACOTTA_BRICK_STAIRS);
                entries.add(BLACK_TERRACOTTA_BRICK_SLAB);
                entries.add(BLACK_TERRACOTTA_BRICK_WALL);

                entries.add(BLUE_TERRACOTTA_BRICK);
                entries.add(BLUE_TERRACOTTA_BRICK_STAIRS);
                entries.add(BLUE_TERRACOTTA_BRICK_SLAB);
                entries.add(BLUE_TERRACOTTA_BRICK_WALL);

                entries.add(BROWN_TERRACOTTA_BRICK);
                entries.add(BROWN_TERRACOTTA_BRICK_STAIRS);
                entries.add(BROWN_TERRACOTTA_BRICK_SLAB);
                entries.add(BROWN_TERRACOTTA_BRICK_WALL);

                entries.add(CYAN_TERRACOTTA_BRICK);
                entries.add(CYAN_TERRACOTTA_BRICK_STAIRS);
                entries.add(CYAN_TERRACOTTA_BRICK_SLAB);
                entries.add(CYAN_TERRACOTTA_BRICK_WALL);

                entries.add(GRAY_TERRACOTTA_BRICK);
                entries.add(GRAY_TERRACOTTA_BRICK_STAIRS);
                entries.add(GRAY_TERRACOTTA_BRICK_SLAB);
                entries.add(GRAY_TERRACOTTA_BRICK_WALL);

                entries.add(GREEN_TERRACOTTA_BRICK);
                entries.add(GREEN_TERRACOTTA_BRICK_STAIRS);
                entries.add(GREEN_TERRACOTTA_BRICK_SLAB);
                entries.add(GREEN_TERRACOTTA_BRICK_WALL);

                entries.add(LIGHT_BLUE_TERRACOTTA_BRICK);
                entries.add(LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
                entries.add(LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
                entries.add(LIGHT_BLUE_TERRACOTTA_BRICK_WALL);

                entries.add(LIGHT_GRAY_TERRACOTTA_BRICK);
                entries.add(LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
                entries.add(LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
                entries.add(LIGHT_GRAY_TERRACOTTA_BRICK_WALL);

                entries.add(LIME_TERRACOTTA_BRICK);
                entries.add(LIME_TERRACOTTA_BRICK_STAIRS);
                entries.add(LIME_TERRACOTTA_BRICK_SLAB);
                entries.add(LIME_TERRACOTTA_BRICK_WALL);

                entries.add(MAGENTA_TERRACOTTA_BRICK);
                entries.add(MAGENTA_TERRACOTTA_BRICK_STAIRS);
                entries.add(MAGENTA_TERRACOTTA_BRICK_SLAB);
                entries.add(MAGENTA_TERRACOTTA_BRICK_WALL);

                entries.add(ORANGE_TERRACOTTA_BRICK);
                entries.add(ORANGE_TERRACOTTA_BRICK_STAIRS);
                entries.add(ORANGE_TERRACOTTA_BRICK_SLAB);
                entries.add(ORANGE_TERRACOTTA_BRICK_WALL);

                entries.add(PINK_TERRACOTTA_BRICK);
                entries.add(PINK_TERRACOTTA_BRICK_STAIRS);
                entries.add(PINK_TERRACOTTA_BRICK_SLAB);
                entries.add(PINK_TERRACOTTA_BRICK_WALL);

                entries.add(RED_TERRACOTTA_BRICK);
                entries.add(RED_TERRACOTTA_BRICK_STAIRS);
                entries.add(RED_TERRACOTTA_BRICK_SLAB);
                entries.add(RED_TERRACOTTA_BRICK_WALL);

                entries.add(TERRACOTTA_BRICK);
                entries.add(TERRACOTTA_BRICK_STAIRS);
                entries.add(TERRACOTTA_BRICK_SLAB);
                entries.add(TERRACOTTA_BRICK_WALL);

                entries.add(WHITE_TERRACOTTA_BRICK);
                entries.add(WHITE_TERRACOTTA_BRICK_STAIRS);
                entries.add(WHITE_TERRACOTTA_BRICK_SLAB);
                entries.add(WHITE_TERRACOTTA_BRICK_WALL);

                entries.add(YELLOW_TERRACOTTA_BRICK);
                entries.add(YELLOW_TERRACOTTA_BRICK_STAIRS);
                entries.add(YELLOW_TERRACOTTA_BRICK_SLAB);
                entries.add(YELLOW_TERRACOTTA_BRICK_WALL);

                entries.add(SMARAGDANT_CRYSTAL_SHARD);
                entries.add(SMARAGDANT_CRYSTAL);
                entries.add(SMARAGDANT_CRYSTAL_BRICKS);
                entries.add(SMARAGDANT_CRYSTAL_PILLAR);
                entries.add(SMARAGDANT_CRYSTAL_TILES);
                entries.add(BUDDING_SMARAGDANT_CRYSTAL);
                entries.add(POLISHED_SMARAGDANT_CRYSTAL);

                entries.add(ECHO_SOIL);
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

                entries.add(MAGIC_ASSIST);

                entries.add(CONFETTI);
                entries.add(CONFETTI_CARPET);

                entries.add(CONFETTI_CHRISTMAS);
                entries.add(CONFETTI_CHRISTMAS_CARPET);

                entries.add(CONFETTI_EASTER);
                entries.add(CONFETTI_EASTER_CARPET);

                entries.add(CONFETTI_HALLOWEEN);
                entries.add(CONFETTI_HALLOWEEN_CARPET);

                entries.add(CONFETTI_VALENTINES);
                entries.add(CONFETTI_VALENTINES_CARPET);




            })
    );

    private static final ItemGroup GC_ITEMS = register("items", FabricItemGroup.builder()
            .icon(BOSS_KEY::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(SMILER);
                entries.add(LIMBO);
                entries.add(GRIM_LANTERN);
                entries.add(WarriorItems.EARLY_RETIREMENT);
                entries.add(LIMINAL_LANTERN);
                entries.add(GoatHornItem.getStackForInstrument(LIMBY_FLUTE, Registries.INSTRUMENT.entryOf(GCInstruments.LIMBY_TOOT_TOOT)));
                entries.add(GoatHornItem.getStackForInstrument(VIC_FLUTE, Registries.INSTRUMENT.entryOf(GCInstruments.VIC_FLUTE)));
                entries.add(GoatHornItem.getStackForInstrument(MEI_FLUTE, Registries.INSTRUMENT.entryOf(GCInstruments.MEI_FLUTE)));
                entries.add(SENTIENT_SPELLBOOK);
                entries.add(CYAN_MACAW_FEATHER);
                entries.add(CLOSED_ORB);
                entries.add(SICKLE);
                entries.add(GRAPPLING_HOOK);
                entries.addAll(toList(TOOL_SET));
                entries.addAll(toList(HANDHELD_TOOL_SET));
                entries.addAll(toList(BOW_SET));
                entries.addAll(toList(WOODCARVE_SET));
                entries.add(COPPER_COIN);
                entries.add(SILVER_COIN);
                entries.add(GOLD_COIN);
                entries.add(EMBEDDED_GEM);
                entries.add(WARP_GEM);
                entries.add(COMMUNICATOR);
                entries.add(BOSS_KEY);
                entries.add(BROKEN_KEY);
                entries.add(DRACONIC_KEY);
                entries.add(GOLD_KEY);
                entries.add(MUTATED_KEY);
                entries.add(RUSTED_KEY);
                entries.add(SILVER_KEY);
                entries.add(TAINTED_KEY);
                entries.add(BLACK_KEY);
                entries.add(BROWN_KEY);
                entries.add(RED_KEY);
                entries.add(ORANGE_KEY);
                entries.add(YELLOW_KEY);
                entries.add(LIME_KEY);
                entries.add(GREEN_KEY);
                entries.add(CYAN_KEY);
                entries.add(LIGHT_BLUE_KEY);
                entries.add(BLUE_KEY);
                entries.add(PURPLE_KEY);
                entries.add(MAGENTA_KEY);
                entries.add(PINK_KEY);
                entries.addAll(toList(POUCH_SET));
                entries.addAll(toList(SPOOL_SET));
                entries.addAll(toList(MISC_SET));
                entries.addAll(toList(GATHERING_SET));
                entries.addAll(toList(MUSHROOM_SET));
                entries.addAll(toList(ALCHEMY_SET));
                entries.addAll(toList(SPELLCRAFT_SET));
                entries.add(DIRE_CHARGE);
                entries.add(ETHEREAL_CHARGE);
                entries.add(MAGIC_CHARGE);
                entries.add(POTENT_CHARGE);
                entries.addAll(toList(MARBLES_SET));
                entries.addAll(toList(CRITTER_SET));
                entries.addAll(toList(INVMON_SET));
            })
    );

    private static final ItemGroup GC_MOB_DROPS = register("mob_drops", FabricItemGroup.builder()
            .icon(FLESH::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(ARTHROPOD_CHUNK);
                entries.add(ARTHROPOD_CHUNK_COOKED);
                entries.add(COBALT_SCALE);
                entries.add(FLESH);
                entries.add(MUTATION);
                entries.add(GUMMY_SLIME);
                entries.add(SPIDER_SILK);
                entries.add(WING);
                entries.add(WITCH_THUMB);
                entries.add(ZOMBACON);
                entries.add(ZOMBIE_LEG);
                entries.add(FEATHER_FYNYKS);
                entries.add(FEATHER_LINI);
                entries.add(FEATHER_PARROT);
                entries.add(HIDE_BEAR);
                entries.add(HIDE_PANDA);
                entries.add(HIDE_POLAR);
                entries.add(HIDE_CREEPER);
                entries.add(HIDE_CROCODILE);
                entries.add(HIDE_FOX);
                entries.add(HIDE_MONSTER);
                entries.add(HIDE_MOOSHROOM);
                entries.add(HIDE_PHANTOM);
                entries.add(HIDE_PIG);
                entries.add(HIDE_SNIFFER);
                entries.add(HIDE_STRIDER);
                entries.add(HIDE_HOGLIN);
                entries.add(HIDE_RAVAGER);
                entries.add(TENTACLE_PINK);
                entries.add(TENTACLE_SEVERED);
                entries.add(TENDRIL_DARK);
                entries.add(TENDRIL_SCULK);
                entries.add(BRAIN);
                entries.add(HEART);
                entries.add(STOMACH);
                entries.add(EYE);
                entries.add(EYE_INSECTOID);
                entries.add(EYE_STRANGE);
                entries.add(EYE_WATCHFUL);
                entries.add(EYE_WEEPING);
                entries.add(BONE_BITS);
                entries.add(BONE_CARBON);
                entries.add(BONE_DOG);
                entries.add(BONE_RIBS);
                entries.add(BONE_SPINE);
                entries.add(ANIMAL_TEETH);
                entries.add(TOOTH);
                entries.add(FANGS_SHARP);
                entries.add(FANGS_DULL);
                entries.add(UNICORN_HORN);
                entries.add(SKULL_DENTED);
                entries.add(SKULL_EMPTY);
                entries.add(SKULL_GUYS);
                entries.add(SKULL_JAWLESS);
                entries.add(SKULL_JIM);
                entries.add(SKULL_LAUGH);
                entries.add(RAW_SHADOW);
                entries.add(SHADOW_EYE);
                entries.add(SHADOW_TOOTH);
                entries.add(SHADOW_TENDRIL);
            })
    );

    private static final ItemGroup GC_PLACEABLES = register("placeables", FabricItemGroup.builder()
            .icon(LIMBO::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(LIMBO);
                entries.add(SMILER);
                entries.add(OMINOUS_EYES);
                entries.add(FOLLY);
                entries.add(MINK_SWORD);
                entries.addAll(toList(NPC_SET));
                entries.add(NOTES);
                entries.add(NOTICE_BOARD);
                entries.addAll(toList(SIGIL_SET));
                entries.add(GoatHornItem.getStackForInstrument(MARIAH, Registries.INSTRUMENT.entryOf(GCInstruments.MARIAH_ITS_TIME)));
                entries.add(GoatHornItem.getStackForInstrument(MARIAH, Registries.INSTRUMENT.entryOf(GCInstruments.MARIAH_AHH)));
                entries.addAll(toList(WANTED_POSTERS_SET));
                entries.addAll(toList(FLAG_SET));
                entries.addAll(toList(PUMPKIN_SET));
                entries.addAll(toList(SKELETON_SET));
                entries.addAll(toList(COFFIN_SET));
                entries.addAll(toList(TOMBSTONE_SET));
            })
    );

    private static final ItemGroup TWODIMENSION_WEAPONS = register("2d_weapons", FabricItemGroup.builder()
            .icon(INFERNAL_BLADE::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.addAll(toList(TWOD_WARRIOR_ITEMS));

            })
    );

    private static final ItemGroup GC_FOODS = register("foods", FabricItemGroup.builder()
            .icon(ICECREAM_SPRUG::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.addAll(toList(GENERIC_FOODS_SET));
                entries.addAll(toList(BREAD_SET));
                entries.addAll(toList(COOKED_SET));
                entries.addAll(toList(FRUIT_SET));
                entries.addAll(toList(STRANGE_FOODS_SET));
                entries.addAll(toList(GUMMY_SET));
                entries.addAll(toList(CANDY_SET));
                entries.addAll(toList(COOKIE_SET));
                entries.addAll(toList(PIE_SET));
                entries.addAll(toList(ICE_CREAM_SET));
                entries.add(ICECREAM_SPRUG);
                entries.add(ICECREAM_SPURNGE);
            })
    );
    private static final ItemGroup GC_DRINKS = register("drinks", FabricItemGroup.builder()
            .icon(JUICE_APPLE::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.addAll(toList(DRINK_SET));
            })
    );

    private static final ItemGroup GC_FISHING = register("fishing", FabricItemGroup.builder()
            .icon(ANGLER::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.addAll(toList(FISH_SET));
                entries.addAll(toList(ROD_SET));
                entries.addAll(toList(FISHING_SET));
            })
    );

    private static final ItemGroup GC_ACCESSORIES = register("accessories", FabricItemGroup.builder()
            .icon(VERDANT_BRACER::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.addAll(toList(NECKLACE_SET));
                entries.addAll(toList(RING_SET));
                entries.addAll(toList(BRACELET_SET));
            })
    );

    private static final ItemGroup GC_GIZMOS = register("gizmos", FabricItemGroup.builder()
            .icon(GEAR_BRONZE::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(CAMERA);
                entries.add(CANISTER_REINFORCED);
                entries.add(CAPACITOR);
                entries.add(CARD);
                entries.add(CERAMIC_FUSE);
                entries.add(CIRCUIT_BOARD);
                entries.addAll(toList(GIZMOS_SET));
                entries.add(COMPOSITE_PLATING);
                entries.add(DIODE);
                entries.add(ELECTRIC_MOTOR);
                entries.add(ELECTRICAL_CABLES);
                entries.add(GEAR_BUSHING);
                entries.add(GEAR_STEEL);
                entries.add(GEAR_BRONZE);
                entries.add(HEAT_SINK);
                entries.add(INPUT_SELECTOR);
                entries.add(INSULATION_CERAMIC);
                entries.add(LAMINATED_COIL);
                entries.add(LIGHTBULB);
                entries.add(MECHANISM_COMPLEX);
                entries.add(MECHANISM_SIMPLE);
                entries.add(METAL_BAR);
                entries.add(METAL_SCRAP);
                entries.add(MOTOR);
                entries.add(OBSIDIAN_STICK);
                entries.add(OPERATIONAL_AMPLIFIERS);
                entries.add(PIPE_WATERPROOF);
                entries.add(PISTON_CASING);
                entries.add(PISTON_DISK);
                entries.add(PISTON_PARTS);
                entries.add(PISTON_ROD);
                entries.add(PLATE_BRONZE);
                entries.add(PLATE_STEEL);
                entries.add(PLATE_TITANIUM);
                entries.add(RAM_CHIP);
                entries.add(RESISTOR);
                entries.add(RESONATOR);
                entries.add(ROUTING_TICKET);
                entries.add(RUSTED_METAL_SHEET);
                entries.add(SAW_IRON);
                entries.add(SCREW);
                entries.add(SKELETON_KEY);
                entries.add(SMALL_DIODE);
                entries.add(SMALL_SCREW);
                entries.add(SOLDERING_IRON);
                entries.add(SSD);
                entries.add(TITANIUM_HEAT_COIL);
                entries.add(TOOL_SPIKE_MAUL_STEEL);
                entries.add(TOROID_COIL);
                entries.add(TRACK_PARTS);
                entries.add(TRACK_SPIKE);
                entries.add(TRAIN_WHEEL_BIG);
                entries.add(TRAIN_WHEEL_SMALL);
                entries.add(TRANSFORMER);
                entries.add(TUBE_NORMAL);
                entries.add(TUBE_ONE_WAY);
                entries.add(TUBE_VALVE);
                entries.add(VEHICLE_KEY);
                entries.add(WIRES);
                entries.add(WRENCH);
            })
    );

    private static final ItemGroup ROCKS = register("rocks", FabricItemGroup.builder()
            .icon(FIRE_OPAL::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.addAll(toList(GEMSTONE_SET));
                entries.addAll(toList(EVO_SET));
                entries.addAll(toList(BAR_SET));
            })
    );

    private static final ItemGroup GC_MOTH = register("moth", FabricItemGroup.builder()
            .icon(DEATH_MOTH::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(DEATH_MOTH);
            })
    );

    private static final ItemGroup GC_OVERSIZE = register("oversize", FabricItemGroup.builder()
            .icon(POCKET_MINK::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(COELACANTH);
                entries.add(GIANT_RED_JELLY);
                entries.add(MANTA_RAY);
                entries.add(MINITHULHU);
                entries.add(MOLAMOLA);
                entries.add(MORAY_EEL);
                entries.add(CANDY_CARP);
                entries.add(POCKET_MINK);
                entries.add(POCKET_GRIM);
                entries.add(POCKET_LIMBY);
                entries.add(POCKET_RAVNA);
                entries.add(POCKET_SILVER);
                entries.add(POCKET_VIC);

                entries.add(BERT);
                entries.add(CLARENCE);
                entries.add(EDWARD);
                entries.add(ELENA);
                entries.add(HENRY);
                entries.add(LEWIS);
                entries.add(PERCIVAL);
                entries.add(PETUNIA);
                entries.add(STEPHANIE);
                entries.add(STEVEN);
                entries.add(VANESSA);
                entries.add(WESLEY);
                entries.add(SCRUNGLEPOCKETLARGE);

                entries.addAll(toList(TWOD_OVERSIZE_WARRIOR_ITEMS));

            })
    );


    public static void initialize() {
    }

    public static ItemGroup register(String name, ItemGroup.Builder itemGroupBuilder) {
        return Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, name), itemGroupBuilder.displayName(Text.translatable("itemGroup." + MOD_ID + "." + name)).build());
    }

    public static List<ItemStack> toList(HashSet<Item> itemSet) {
        return itemSet.stream().sorted(Comparator.comparing(Item::toString)).map(Item::getDefaultStack).toList();
    }
}
