package org.klepticat.ghostcraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.klepticat.ghostcraft.block.BlockType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCBlocks {
    public static List<Block> ALL = new ArrayList<>();

    public static Block ADENDA_LEAVES = register(
            "adenda_leaves",
            LeavesBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            true
    );
    public static Block ANCIENT_OAK_DOOR = register(
            "ancient_oak_door",
            settings -> new DoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY),
            true
    );
    //TODO  Skyris set here
    public static Block SKYRIS_BOOKSHELF = register(
            "skyris_bookshelf",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()
                    .burnable(),
            true
    );
    public static Block AURITE = register(
            "aurite",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block AURORA_CRYSTAL = register(
            "aurora_crystal",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block BLEEDING_COIL = register(
            "bleeding_coil",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.SHROOMLIGHT)
                    .luminance(state -> 1),
            true
    );
    public static Block BLUE_NETHERRACK = register(
            "blue_netherrack",
            NetherrackBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WATER_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.4F)
                    .sounds(BlockSoundGroup.NETHERRACK),
            true
    );
    public static Block AMETHYST_STAIRS = register("amethyst_stairs", settings -> new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK), true);
    public static Block AMETHYST_SLAB = register("amethyst_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK), true);
    public static Block AMETHYST_WALL = register("amethyst_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK), true);

    public static Block BLUE_NETHERRACK_STAIRS = register("blue_netherrack_stairs", settings -> new StairsBlock(BLUE_NETHERRACK.getDefaultState(), settings), AbstractBlock.Settings.copy(BLUE_NETHERRACK), true);
    public static Block BLUE_NETHERRACK_SLAB = register("blue_netherrack_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLUE_NETHERRACK), true);
    public static Block BLUE_NETHERRACK_WALL = register("blue_netherrack_wall", WallBlock::new, AbstractBlock.Settings.copy(BLUE_NETHERRACK), true);

    public static Block NETHERRACK_STAIRS = register("netherrack_stairs", settings -> new StairsBlock(Blocks.NETHERRACK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.NETHERRACK), true);
    public static Block NETHERRACK_SLAB = register("netherrack_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK), true);
    public static Block NETHERRACK_WALL = register("netherrack_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK), true);
    public static Block NETHERRACK_FENCE = register("netherrack_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.NETHERRACK), true);

    public static Block DRIPSTONE_STAIRS = register("dripstone_stairs", settings -> new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK), true);
    public static Block DRIPSTONE_SLAB = register("dripstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK), true);
    public static Block DRIPSTONE_WALL = register("dripstone_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK), true);

    public static Block SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", settings -> new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT), true);
    public static Block SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT), true);
    public static Block SMOOTH_BASALT_WALL = register("smooth_basalt_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT), true);

    public static Block BOSS_DOOR = register(
            "boss_door",
            settings -> new DoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY),
            true
    );

    public static Block BROWN_GRANITE = register(
            "brown_granite",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F),
            true
    );
    public static Block BROWN_GRANITE_STAIRS = register("brown_granite_stairs", settings -> new StairsBlock(BROWN_GRANITE.getDefaultState(), settings), AbstractBlock.Settings.copy(BROWN_GRANITE), true);
    public static Block BROWN_GRANITE_SLAB = register("brown_granite_slab", SlabBlock::new, AbstractBlock.Settings.copy(BROWN_GRANITE), true);
    public static Block BROWN_GRANITE_WALL = register("brown_granite_wall", WallBlock::new, AbstractBlock.Settings.copy(BROWN_GRANITE), true);

    public static Block POLISHED_BROWN_GRANITE = register(
            "polished_brown_granite",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F),
            true
    );
    public static Block POLISHED_BROWN_GRANITE_STAIRS = register("polished_brown_granite_stairs", settings -> new StairsBlock(POLISHED_BROWN_GRANITE.getDefaultState(), settings), AbstractBlock.Settings.copy(POLISHED_BROWN_GRANITE), true);
    public static Block POLISHED_BROWN_GRANITE_SLAB = register("polished_brown_granite_slab", SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_BROWN_GRANITE), true);
    public static Block POLISHED_BROWN_GRANITE_WALL = register("polished_brown_granite_wall", WallBlock::new, AbstractBlock.Settings.copy(POLISHED_BROWN_GRANITE), true);

    public static Block CANDY_CANE = register(
            "candy_cane_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.XYLOPHONE)
                    .requiresTool()
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.BONE),
            true
    );


    public static Block CABBAGE_BLOCK = register(
            "cabbage_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIME)
                    .instrument(NoteBlockInstrument.BANJO)
                    .requiresTool()
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.WET_GRASS),
            true
    );

    public static Block CHOGGY_BLOGGY = register(
            "choggy_bloggy",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.FROGLIGHT),
            true
    );
    public static Block DARK_CHERRY_LOG = register(
            "dark_cherry_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block DARK_CHERRY_WOOD = register(
            "dark_cherry_wood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block STRIPPED_DARK_CHERRY_LOG = register(
            "stripped_dark_cherry_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block STRIPPED_DARK_CHERRY_WOOD = register(
            "stripped_dark_cherry_wood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );

    public static ImmutableMap<BlockType, Block> DARK_CHERRY_SET = registerWoodSet(
            "dark_cherry",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            GCWoodTypes.DARK_CHERRY
    );

    public static Block DARK_CHERRY_SIGN = register(
            "dark_cherry_sign",
            settings -> new SignBlock(GCWoodTypes.DARK_CHERRY, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .burnable(),
            false
    );
    public static final Block DARK_CHERRY_WALL_SIGN = register(
            "dark_cherry_wall_sign",
            settings -> new WallSignBlock(GCWoodTypes.DARK_CHERRY, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .dropsLike(DARK_CHERRY_SIGN)
                    .burnable(),
            false
    );
    public static Block DARK_CHERRY_HANGING_SIGN = register(
            "dark_cherry_hanging_sign",
            settings -> new HangingSignBlock(GCWoodTypes.DARK_CHERRY, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable(),
            false
    );
    public static Block DARK_CHERRY_WALL_HANGING_SIGN = register(
            "dark_cherry_wall_hanging_sign",
            settings -> new WallHangingSignBlock(GCWoodTypes.DARK_CHERRY, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .dropsLike(DARK_CHERRY_HANGING_SIGN)
                    .burnable(),
            false
    );

    public static Block GRATED_SPRUCE_TRAPDOOR = register(
            "grated_spruce_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            true
    );
    public static Block GRATED_IRON_TRAPDOOR = register(
            "grated_iron_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.IRON, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.IRON_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            true
    );
    public static Block DREADWOOD_TRAPDOOR = register(
            "dreadwood_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .solidBlock(Blocks::never)
                    .blockVision(Blocks::never)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY),
            true
    );

    public static Block LIGHT_COBBLED_DREADSTONE = register(
            "cobbled_light_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block LIGHT_COBBLED_DREADSTONE_STAIRS = register("cobbled_light_dreadstone_stairs", settings -> new StairsBlock(LIGHT_COBBLED_DREADSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(LIGHT_COBBLED_DREADSTONE), true);
    public static Block LIGHT_COBBLED_DREADSTONE_SLAB = register("cobbled_light_dreadstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIGHT_COBBLED_DREADSTONE), true);
    public static Block LIGHT_COBBLED_DREADSTONE_WALL = register("cobbled_light_dreadstone_wall", WallBlock::new, AbstractBlock.Settings.copy(LIGHT_COBBLED_DREADSTONE), true);

    public static Block TILED_LIGHT_DREADSTONE = register(
            "tiled_light_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block POLISHED_LIGHT_DREADSTONE = register(
            "polished_light_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block POLISHED_LIGHT_DREADSTONE_STAIRS = register("polished_light_dreadstone_stairs", settings -> new StairsBlock(POLISHED_LIGHT_DREADSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(POLISHED_LIGHT_DREADSTONE), true);
    public static Block POLISHED_LIGHT_DREADSTONE_SLAB = register("polished_light_dreadstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_LIGHT_DREADSTONE), true);
    public static Block POLISHED_LIGHT_DREADSTONE_WALL = register("polished_light_dreadstone_wall", WallBlock::new, AbstractBlock.Settings.copy(POLISHED_LIGHT_DREADSTONE), true);

    public static Block RIVETED_LIGHT_DREADSTONE = register(
            "riveted_light_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block RIVETED_LIGHT_DREADSTONE_STAIRS = register("riveted_light_dreadstone_stairs", settings -> new StairsBlock(RIVETED_LIGHT_DREADSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(RIVETED_LIGHT_DREADSTONE), true);
    public static Block RIVETED_LIGHT_DREADSTONE_SLAB = register("riveted_light_dreadstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(RIVETED_LIGHT_DREADSTONE), true);
    public static Block RIVETED_LIGHT_DREADSTONE_WALL = register("riveted_light_dreadstone_wall", WallBlock::new, AbstractBlock.Settings.copy(RIVETED_LIGHT_DREADSTONE), true);

    public static Block BLOODY_LIGHT_DREADSTONE = register(
            "bloody_light_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block BLOODY_LIGHT_DREADSTONE_STAIRS = register("bloody_light_dreadstone_stairs", settings -> new StairsBlock(BLOODY_LIGHT_DREADSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(BLOODY_LIGHT_DREADSTONE), true);
    public static Block BLOODY_LIGHT_DREADSTONE_SLAB = register("bloody_light_dreadstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLOODY_LIGHT_DREADSTONE), true);
    public static Block BLOODY_LIGHT_DREADSTONE_WALL = register("bloody_light_dreadstone_wall", WallBlock::new, AbstractBlock.Settings.copy(BLOODY_LIGHT_DREADSTONE), true);

    public static Block BLOODY_LIGHT_DREADSTONE_BRICKS = register(
            "bloody_light_dreadstone_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block BLOODY_LIGHT_DREADSTONE_BRICKS_STAIRS = register("bloody_light_dreadstone_bricks_stairs", settings -> new StairsBlock(BLOODY_LIGHT_DREADSTONE_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(BLOODY_LIGHT_DREADSTONE_BRICKS), true);
    public static Block BLOODY_LIGHT_DREADSTONE_BRICKS_SLAB = register("bloody_light_dreadstone_bricks_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLOODY_LIGHT_DREADSTONE_BRICKS), true);
    public static Block BLOODY_LIGHT_DREADSTONE_BRICKS_WALL = register("bloody_light_dreadstone_bricks_wall", WallBlock::new, AbstractBlock.Settings.copy(BLOODY_LIGHT_DREADSTONE_BRICKS), true);


    public static Block DREADSTONE_BLOCK = register(
            "dreadstone_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block DREADSTONE_BLOCK_STAIRS = register("dreadstone_block_stairs", settings -> new StairsBlock(DREADSTONE_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(DREADSTONE_BLOCK), true);
    public static Block DREADSTONE_BLOCK_SLAB = register("dreadstone_block_slab", SlabBlock::new, AbstractBlock.Settings.copy(DREADSTONE_BLOCK), true);
    public static Block DREADSTONE_BLOCK_WALL = register("dreadstone_block_wall", WallBlock::new, AbstractBlock.Settings.copy(DREADSTONE_BLOCK), true);

    public static Block DREADSTONE_GLASS_BLACK = register(
            "dreadstone_glass_black",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_BLUE = register(
            "dreadstone_glass_blue",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_BROWN = register(
            "dreadstone_glass_brown",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_CYAN = register(
            "dreadstone_glass_cyan",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.CYAN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_GREEN = register(
            "dreadstone_glass_green",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_LIGHT = register(
            "dreadstone_glass_light",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_LIGHT_BLUE = register(
            "dreadstone_glass_light_blue",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_LIME = register(
            "dreadstone_glass_lime",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIME)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_ORANGE = register(
            "dreadstone_glass_orange",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_PINK = register(
            "dreadstone_glass_pink",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_PURPLE = register(
            "dreadstone_glass_purple",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_RED = register(
            "dreadstone_glass_red",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_SOUL = register(
            "dreadstone_glass_soul",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.CYAN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_WHITE = register(
            "dreadstone_glass_white",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS_YELLOW = register(
            "dreadstone_glass_yellow",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block DREADSTONE_GLASS = register(
            "dreadstone_glass",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );
    public static Block DREADSTONE_GRATE = register(
            "dreadstone_grate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .solidBlock(Blocks::never)
                    .blockVision(Blocks::never)
                    .nonOpaque()
                    .strength(1.0F)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .sounds(BlockSoundGroup.METAL),
            true
    );
    public static Block DREADSTONE_LAMP = register(
            "dreadstone_lamp",
            RedstoneLampBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)),
            true
    );
    public static Block DREADSTONE_BARS = register(
            "dreadstone_bars",
            PaneBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.METAL),
            true
    );
    public static Block DREADSTONE_BRICKS = register(
            "dreadstone_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block DREADSTONE_BRICKS_STAIRS = register("dreadstone_bricks_stairs", settings -> new StairsBlock(DREADSTONE_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(DREADSTONE_BRICKS), true);
    public static Block DREADSTONE_BRICKS_SLAB = register("dreadstone_bricks_slab", SlabBlock::new, AbstractBlock.Settings.copy(DREADSTONE_BRICKS), true);
    public static Block DREADSTONE_BRICKS_WALL = register("dreadstone_bricks_wall", WallBlock::new, AbstractBlock.Settings.copy(DREADSTONE_BRICKS), true);

    public static Block GRATED_DREADSTONE = register(
            "grated_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block GRATED_DREADSTONE_STAIRS = register("grated_dreadstone_stairs", settings -> new StairsBlock(GRATED_DREADSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(GRATED_DREADSTONE), true);
    public static Block GRATED_DREADSTONE_SLAB = register("grated_dreadstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(GRATED_DREADSTONE), true);
    public static Block GRATED_DREADSTONE_WALL = register("grated_dreadstone_wall", WallBlock::new, AbstractBlock.Settings.copy(GRATED_DREADSTONE), true);

    public static Block DREADSTONE_WINDOW = register(
            "dreadstone_window",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block POLISHED_CHISELED_DREADSTONE = register(
            "polished_chiseled_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block POLISHED_CHISELED_DREADSTONE_STAIRS = register("polished_chiseled_dreadstone_stairs", settings -> new StairsBlock(POLISHED_CHISELED_DREADSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(POLISHED_CHISELED_DREADSTONE), true);
    public static Block POLISHED_CHISELED_DREADSTONE_SLAB = register("polished_chiseled_dreadstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_CHISELED_DREADSTONE), true);
    public static Block POLISHED_CHISELED_DREADSTONE_WALL = register("polished_chiseled_dreadstone_wall", WallBlock::new, AbstractBlock.Settings.copy(POLISHED_CHISELED_DREADSTONE), true);

    public static Block POLISHED_DREADSTONE = register(
            "polished_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block COBBLED_DREADSTONE = register(
            "cobbled_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block COBBLED_DREADSTONE_STAIRS = register("cobbled_dreadstone_stairs", settings -> new StairsBlock(COBBLED_DREADSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(COBBLED_DREADSTONE), true);
    public static Block COBBLED_DREADSTONE_SLAB = register("cobbled_dreadstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(COBBLED_DREADSTONE), true);
    public static Block COBBLED_DREADSTONE_WALL = register("cobbled_dreadstone_wall", WallBlock::new, AbstractBlock.Settings.copy(COBBLED_DREADSTONE), true);

    public static Block TILED_COBBLED_DREADSTONE = register(
            "tiled_cobbled_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block TILED_COBBLED_DREADSTONE_STAIRS = register("tiled_cobbled_dreadstone_stairs", settings -> new StairsBlock(TILED_COBBLED_DREADSTONE.getDefaultState(), settings), AbstractBlock.Settings.copy(TILED_COBBLED_DREADSTONE), true);
    public static Block TILED_COBBLED_DREADSTONE_SLAB = register("tiled_cobbled_dreadstone_slab", SlabBlock::new, AbstractBlock.Settings.copy(TILED_COBBLED_DREADSTONE), true);
    public static Block TILED_COBBLED_DREADSTONE_WALL = register("tiled_cobbled_dreadstone_wall", WallBlock::new, AbstractBlock.Settings.copy(TILED_COBBLED_DREADSTONE), true);

    public static Block CHISELED_DREADSTONE = register(
            "chiseled_dreadstone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );

    public static Block DREADSTONE_PILLAR = register(
            "dreadstone_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block LIGHT_DREADSTONE_DOOR = register(
            "light_dreadstone_door",
            settings -> new DoorBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            true
    );
    public static Block LIGHT_DREADSTONE_TRAPDOOR = register(
            "light_dreadstone_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            true
    );
    public static Block DREADSTONE_DOOR = register(
            "dreadstone_door",
            settings -> new DoorBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            true
    );
    public static Block DREADSTONE_TRAPDOOR = register(
            "dreadstone_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never),
            true
    );
    public static Block LOCKED_DREADSTONE_DOOR = register(
            "locked_dreadstone_door",
            settings -> new DoorBlock(BlockSetType.IRON, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .solidBlock(Blocks::never)
                    .blockVision(Blocks::never)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY),
            true
    );



    public static Block SOUL_QUARTZ_PILLAR = register(
            "soul_quartz_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .burnable(),
            true
    );

    public static Block SOUL_QUARTZ_BLOCK = register(
            "soul_quartz_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block SMOOTH_SOUL_QUARTZ = register(
            "smooth_soul_quartz",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block SOUL_QUARTZ_BRICKS = register(
            "soul_quartz_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block CRACKED_SOUL_QUARTZ_BRICKS = register(
            "cracked_soul_quartz_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );

    public static Block LAPIS_PILLAR = register(
            "lapis_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .burnable(),
            true
    );
    public static Block SMOOTH_LAPIS_BLOCK = register(
            "smooth_lapis_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block CHISELED_LAPIS = register(
            "chiseled_lapis",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block LAPIS_TILES = register(
            "lapis_tiles",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block LAPIS_BRICKS = register(
            "lapis_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );

    public static Block GILDED_LAPIS_PILLAR = register(
            "gilded_lapis_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .burnable(),
            true
    );
    public static Block GILDED_LAPIS_BLOCK = register(
            "gilded_lapis_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block GILDED_FANCY_LAPIS = register(
            "gilded_fancy_lapis",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block GILDED_LAPIS_TILES= register(
            "gilded_lapis_tiles",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block GILDED_LAPIS_BRICKS = register(
            "gilded_lapis_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block ITERATOR_PROJECTION_TILE = register(
            "iterator_projection_tile",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.NETHER_STEM)
                    .burnable(),
            true
    );
    public static Block ITERATOR_PULSE = register(
            "iterator_pulse",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.NETHER_STEM)
                    .burnable(),
            true
    );
    public static Block ITERATOR_PROCESSING_SCREEN = register(
            "iterator_processing_screen",
            RedstoneLampBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)),
            true
    );


    public static Block MARBLED_FLESH = register(
            "marbled_flesh",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.FROGLIGHT),
            true
    );
    public static Block MARBLED_FLESH_CARPET = register(
            "marbled_flesh_carpet",
            CarpetBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY),
            true
    );
    public static Block MARBLED_FLESH_STAIRS = register("marbled_flesh_stairs", settings -> new StairsBlock(MARBLED_FLESH.getDefaultState(), settings), AbstractBlock.Settings.copy(MARBLED_FLESH), true);
    public static Block MARBLED_FLESH_SLAB = register("marbled_flesh_slab", SlabBlock::new, AbstractBlock.Settings.copy(MARBLED_FLESH), true);
    public static Block MARBLED_FLESH_FENCE = register("marbled_flesh_fence", WallBlock::new, AbstractBlock.Settings.copy(MARBLED_FLESH), true);

    public static Block SCALED_FLESH = register(
            "scaled_flesh",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.NYLIUM),
            true
    );
    public static Block SCALED_FLESH_STAIRS = register("scaled_flesh_stairs", settings -> new StairsBlock(SCALED_FLESH.getDefaultState(), settings), AbstractBlock.Settings.copy(SCALED_FLESH), true);
    public static Block SCALED_FLESH_SLAB = register("scaled_flesh_slab", SlabBlock::new, AbstractBlock.Settings.copy(SCALED_FLESH), true);
    public static Block SCALED_FLESH_WALL = register("scaled_flesh_wall", WallBlock::new, AbstractBlock.Settings.copy(SCALED_FLESH), true);


    public static Block MAGIC_ASSIST = register(
            "magic_assist",
            TransparentBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true
    );

    public static Block CRIMSON_WOOL = register(
            "crimson_wool",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.WOOL),
            true
    );
    public static Block CRIMSON_CARPET = register(
            "crimson_carpet",
            CarpetBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY),
            true
    );




    public static Block CONFETTI = register(
            "confetti",
            Block::new,
            Block.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .noCollision(),
            true
    );
    public static Block CONFETTI_CHRISTMAS = register(
            "confetti_christmas",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIME)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .noCollision(),
            true
    );

    public static Block CONFETTI_EASTER = register(
            "confetti_easter",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .noCollision(),
            true
    );
    public static Block CONFETTI_HALLOWEEN = register(
            "confetti_halloween",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .noCollision(),
            true
    );
    public static Block CONFETTI_VALENTINES = register(
            "confetti_valentines",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .noCollision(),
            true
    );


    public static Block CONFETTI_CARPET = register(
            "confetti_carpet",
            CarpetBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .noCollision(),
            true
    );
    public static Block CONFETTI_CHRISTMAS_CARPET = register(
            "confetti_christmas_carpet",
            CarpetBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIME)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .noCollision(),
            true
    );

    public static Block CONFETTI_EASTER_CARPET = register(
            "confetti_easter_carpet",
            CarpetBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .noCollision(),
            true
    );
    public static Block CONFETTI_HALLOWEEN_CARPET = register(
            "confetti_halloween_carpet",
            CarpetBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .noCollision(),
            true
    );
    public static Block CONFETTI_VALENTINES_CARPET = register(
            "confetti_valentines_carpet",
            CarpetBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque()
                    .allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .noCollision(),
            true
    );







    public static Block EBONY_LOG = register(
            "ebony_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block EBONY_WOOD = register(
            "ebony_wood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block STRIPPED_EBONY_LOG = register(
            "stripped_ebony_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block STRIPPED_EBONY_WOOD = register(
            "stripped_ebony_wood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );

    public static ImmutableMap<BlockType, Block> EBONY_SET = registerWoodSet(
            "ebony",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            GCWoodTypes.EBONY
    );

    public static Block ANCHOR_LOG = register(
            "anchor_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block ANCHOR_WOOD = register(
            "anchor_wood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block STRIPPED_ANCHOR_LOG = register(
            "stripped_anchor_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block STRIPPED_ANCHOR_WOOD = register(
            "stripped_anchor_wood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );

    public static ImmutableMap<BlockType, Block> ANCHOR_SET = registerWoodSet(
            "anchor",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            GCWoodTypes.ANCHOR
    );

    public static Block EBONY_SIGN = register(
            "ebony_sign",
            settings -> new SignBlock(GCWoodTypes.EBONY, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .burnable(),
            false
    );
    public static final Block EBONY_WALL_SIGN = register(
            "ebony_wall_sign",
            settings -> new WallSignBlock(GCWoodTypes.EBONY, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .dropsLike(EBONY_SIGN)
                    .burnable(),
            false
    );
    public static Block EBONY_HANGING_SIGN = register(
            "ebony_hanging_sign",
            settings -> new HangingSignBlock(GCWoodTypes.EBONY, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable(),
            false
    );
    public static Block EBONY_WALL_HANGING_SIGN = register(
            "ebony_wall_hanging_sign",
            settings -> new WallHangingSignBlock(GCWoodTypes.EBONY, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .dropsLike(EBONY_HANGING_SIGN)
                    .burnable(),
            false
    );
    public static Block CHECK_MARK = register(
            "check_mark",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.4F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );
    public static Block X_MARK = register(
            "x_mark",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(0.4F)
                    .sounds(BlockSoundGroup.STONE),
            true
    );

    public static Block WEEPING_BARK = register(
            "weeping_bark",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.NETHER_STEM)
                    .burnable(),
            true
    );
    public static Block WATCHFUL_ASPEN = register(
            "watchful_aspen",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.NETHER_STEM)
                    .burnable(),
            true
    );
//TODO Blue Enchanted DOOR/TRAPDOOR block textures
    public static Block BLUE_ENCHANTED_LOG = register(
            "blue_enchanted_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.NETHER_STEM)
                    .burnable(),
            true
    );
    public static Block BLUE_ENCHANTED = register(
            "blue_enchanted",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.NETHER_STEM)
                    .burnable(),
            true
    );
    public static Block STRIPPED_BLUE_ENCHANTED_LOG = register(
            "stripped_blue_enchanted_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static ImmutableMap<BlockType, Block> BLUE_ENCHANTED_SET = registerWoodSet(
            "blue_enchanted",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            GCWoodTypes.BLUE_ENCHANTED,
            true
    );

    public static Block TANGLEWOOD_LOG = register(
            "tanglewood_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.NETHER_STEM)
                    .burnable(),
            true
    );
    public static Block TANGLEWOOD = register(
            "tanglewood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.NETHER_STEM)
                    .burnable(),
            true
    );
    public static ImmutableMap<BlockType, Block> TANGLEWOOD_SET = registerWoodSet(
            "tanglewood",
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            GCWoodTypes.TANGLEWOOD,
            true
    );

    public static Block ENCHANTED_LEAVES = register(
            "enchanted_leaves",
            LeavesBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)
                    .luminance(value -> 15),
            true
    );
    public static Block END_MOSS = register(
            "end_moss",
            MossBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .pistonBehavior(PistonBehavior.DESTROY),
            true
    );
    public static Block NOISE = register(
            "noise",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never),
            true
    );

    public static Block SLATE = register(
            "slate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F),
            true
    );
    public static Block SLATE_STAIRS = register("slate_stairs", settings -> new StairsBlock(SLATE.getDefaultState(), settings), AbstractBlock.Settings.copy(SLATE), true);
    public static Block SLATE_SLAB = register("slate_slab", SlabBlock::new, AbstractBlock.Settings.copy(SLATE), true);
    public static Block SLATE_WALL = register("slate_wall", WallBlock::new, AbstractBlock.Settings.copy(SLATE), true);

    public static Block TEMPLE_BRICKS = register(
            "temple_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 9.0F),
            true
    );
    public static Block TEMPLE_BRICKS_STAIRS = register("temple_bricks_stairs", settings -> new StairsBlock(TEMPLE_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(TEMPLE_BRICKS), true);
    public static Block TEMPLE_BRICKS_SLAB = register("temple_bricks_slab", SlabBlock::new, AbstractBlock.Settings.copy(TEMPLE_BRICKS), true);
    public static Block TEMPLE_BRICKS_WALL = register("temple_bricks_wall", WallBlock::new, AbstractBlock.Settings.copy(TEMPLE_BRICKS), true);

    public static Block VOID = register(
            "void",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .luminance(value -> 15)
                    .emissiveLighting((state, world, pos) -> true),
            true
    );

    public static Block COOKING_POT = register(
            "cooking_pot",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.METAL)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block COOKING_POT_HANDLE = register(
            "cooking_pot_handle",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.METAL)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block COOKING_POT_TRAY = register(
            "cooking_pot_tray",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .nonOpaque()
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .solidBlock(Blocks::never)
                    .sounds(BlockSoundGroup.METAL)
                    .strength(2.0F, 3.0F),
            true
    );

    public static Block APPLE_CRATE = register(
            "apple_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block BEETROOT_CRATE = register(
            "beetroot_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block CABBAGE_CRATE = register(
            "cabbage_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIME)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block CARROT_CRATE_SPRUCE = register(
            "carrot_crate_spruce",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block GOLDEN_APPLE_CRATE = register(
            "golden_apple_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block GOLDEN_CARROT_CRATE = register(
            "golden_carrot_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block CARROT_CRATE = register(
            "carrot_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block ONION_CRATE = register(
            "onion_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block POTATO_CRATE = register(
            "potato_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block POTATO_CRATE_SPRUCE = register(
            "potato_crate_spruce",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block TOMATO_CRATE = register(
            "tomato_crate",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block BERRY_SACK = register(
            "berry_sack",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block COCOA_BEANS_SACK = register(
            "cocoa_beans_sack",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block GLOWBERRY_SACK = register(
            "glowberry_sack",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block GUNPOWDER_SACK = register(
            "gunpowder_sack",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block RICE_BAG = register(
            "rice_bag",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block RICE_BALE = register(
            "rice_bale",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.GRASS)
                    .strength(2.0F, 3.0F),
            true
    );
    public static Block STRAW_BALE = register(
            "straw_bale",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.GRASS),
            true
    );
    public static Block NETHER_WART_SACK = register(
            "nether_wart_sack",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOL)
                    .strength(2.0F, 3.0F),
            true
    );

    public static Block BLACK_CORUNDUM = register(
            "black_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block BLACK_CORUNDUM_CLUSTER = register(
            "black_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block BLUE_CORUNDUM = register(
            "blue_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block BLUE_CORUNDUM_CLUSTER = register(
            "blue_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block GREEN_CORUNDUM = register(
            "green_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.EMERALD_GREEN)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block GREEN_CORUNDUM_CLUSTER = register(
            "green_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.EMERALD_GREEN)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block INDIGO_CORUNDUM = register(
            "indigo_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block INDIGO_CORUNDUM_CLUSTER = register(
            "indigo_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block ORANGE_CORUNDUM = register(
            "orange_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block ORANGE_CORUNDUM_CLUSTER = register(
            "orange_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block RED_CORUNDUM = register(
            "red_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block RED_CORUNDUM_CLUSTER = register(
            "red_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block VIOLET_CORUNDUM = register(
            "violet_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block VIOLET_CORUNDUM_CLUSTER = register(
            "violet_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block WHITE_CORUNDUM = register(
            "white_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE_GRAY)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block WHITE_CORUNDUM_CLUSTER = register(
            "white_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE_GRAY)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block YELLOW_CORUNDUM = register(
            "yellow_corundum",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW)
                    .solid()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );
    public static Block YELLOW_CORUNDUM_CLUSTER = register(
            "yellow_corundum_cluster",
            settings -> new AmethystClusterBlock(8, 3, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(1.5F)
                    .luminance(state -> 5),
            true
    );

    public static Block BLACK_TERRACOTTA_BRICK = register(
            "black_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block BLACK_TERRACOTTA_BRICK_STAIRS = register("black_terracotta_brick_stairs", settings -> new StairsBlock(BLACK_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(BLACK_TERRACOTTA_BRICK), true);
    public static Block BLACK_TERRACOTTA_BRICK_SLAB = register("black_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLACK_TERRACOTTA_BRICK), true);
    public static Block BLACK_TERRACOTTA_BRICK_WALL = register("black_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(BLACK_TERRACOTTA_BRICK), true);

    public static Block BLUE_TERRACOTTA_BRICK = register(
            "blue_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block BLUE_TERRACOTTA_BRICK_STAIRS = register("blue_terracotta_brick_stairs", settings -> new StairsBlock(BLUE_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(BLUE_TERRACOTTA_BRICK), true);
    public static Block BLUE_TERRACOTTA_BRICK_SLAB = register("blue_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(BLUE_TERRACOTTA_BRICK), true);
    public static Block BLUE_TERRACOTTA_BRICK_WALL = register("blue_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(BLUE_TERRACOTTA_BRICK), true);

    public static Block BROWN_TERRACOTTA_BRICK = register(
            "brown_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );
    public static Block BROWN_TERRACOTTA_BRICK_STAIRS = register("brown_terracotta_brick_stairs", settings -> new StairsBlock(BROWN_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(BROWN_TERRACOTTA_BRICK), true);
    public static Block BROWN_TERRACOTTA_BRICK_SLAB = register("brown_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(BROWN_TERRACOTTA_BRICK), true);
    public static Block BROWN_TERRACOTTA_BRICK_WALL = register("brown_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(BROWN_TERRACOTTA_BRICK), true);


    public static Block CYAN_TERRACOTTA_BRICK = register(
            "cyan_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block CYAN_TERRACOTTA_BRICK_STAIRS = register("cyan_terracotta_brick_stairs", settings -> new StairsBlock(CYAN_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(CYAN_TERRACOTTA_BRICK), true);
    public static Block CYAN_TERRACOTTA_BRICK_SLAB = register("cyan_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(CYAN_TERRACOTTA_BRICK), true);
    public static Block CYAN_TERRACOTTA_BRICK_WALL = register("cyan_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(CYAN_TERRACOTTA_BRICK), true);

    public static Block GRAY_TERRACOTTA_BRICK = register(
            "gray_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );
    public static Block GRAY_TERRACOTTA_BRICK_STAIRS = register("gray_terracotta_brick_stairs", settings -> new StairsBlock(GRAY_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(GRAY_TERRACOTTA_BRICK), true);
    public static Block GRAY_TERRACOTTA_BRICK_SLAB = register("gray_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(GRAY_TERRACOTTA_BRICK), true);
    public static Block GRAY_TERRACOTTA_BRICK_WALL = register("gray_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(GRAY_TERRACOTTA_BRICK), true);


    public static Block GREEN_TERRACOTTA_BRICK = register(
            "green_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block GREEN_TERRACOTTA_BRICK_STAIRS = register("green_terracotta_brick_stairs", settings -> new StairsBlock(GREEN_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(GREEN_TERRACOTTA_BRICK), true);
    public static Block GREEN_TERRACOTTA_BRICK_SLAB = register("green_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(GREEN_TERRACOTTA_BRICK), true);
    public static Block GREEN_TERRACOTTA_BRICK_WALL = register("green_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(GREEN_TERRACOTTA_BRICK), true);


    public static Block LIGHT_BLUE_TERRACOTTA_BRICK = register(
            "light_blue_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );
    public static Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = register("light_blue_terracotta_brick_stairs", settings -> new StairsBlock(LIGHT_BLUE_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(LIGHT_BLUE_TERRACOTTA_BRICK), true);
    public static Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = register("light_blue_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIGHT_BLUE_TERRACOTTA_BRICK), true);
    public static Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = register("light_blue_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(LIGHT_BLUE_TERRACOTTA_BRICK), true);


    public static Block LIGHT_GRAY_TERRACOTTA_BRICK = register(
            "light_gray_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = register("light_gray_terracotta_brick_stairs", settings -> new StairsBlock(LIGHT_GRAY_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(LIGHT_GRAY_TERRACOTTA_BRICK), true);
    public static Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = register("light_gray_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIGHT_GRAY_TERRACOTTA_BRICK), true);
    public static Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = register("light_gray_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(LIGHT_GRAY_TERRACOTTA_BRICK), true);


    public static Block LIME_TERRACOTTA_BRICK = register(
            "lime_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block LIME_TERRACOTTA_BRICK_STAIRS = register("lime_terracotta_brick_stairs", settings -> new StairsBlock(LIME_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(LIME_TERRACOTTA_BRICK), true);
    public static Block LIME_TERRACOTTA_BRICK_SLAB = register("lime_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(LIME_TERRACOTTA_BRICK), true);
    public static Block LIME_TERRACOTTA_BRICK_WALL = register("lime_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(LIME_TERRACOTTA_BRICK), true);


    public static Block MAGENTA_TERRACOTTA_BRICK = register(
            "magenta_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );
    public static Block MAGENTA_TERRACOTTA_BRICK_STAIRS = register("magenta_terracotta_brick_stairs", settings -> new StairsBlock(MAGENTA_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(MAGENTA_TERRACOTTA_BRICK), true);
    public static Block MAGENTA_TERRACOTTA_BRICK_SLAB = register("magenta_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(MAGENTA_TERRACOTTA_BRICK), true);
    public static Block MAGENTA_TERRACOTTA_BRICK_WALL = register("magenta_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(MAGENTA_TERRACOTTA_BRICK), true);


    public static Block ORANGE_TERRACOTTA_BRICK = register(
            "orange_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block ORANGE_TERRACOTTA_BRICK_STAIRS = register("orange_terracotta_brick_stairs", settings -> new StairsBlock(ORANGE_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(ORANGE_TERRACOTTA_BRICK), true);
    public static Block ORANGE_TERRACOTTA_BRICK_SLAB = register("orange_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(ORANGE_TERRACOTTA_BRICK), true);
    public static Block ORANGE_TERRACOTTA_BRICK_WALL = register("orange_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(ORANGE_TERRACOTTA_BRICK), true);


    public static Block PINK_TERRACOTTA_BRICK = register(
            "pink_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block PINK_TERRACOTTA_BRICK_STAIRS = register("pink_terracotta_brick_stairs", settings -> new StairsBlock(PINK_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(PINK_TERRACOTTA_BRICK), true);
    public static Block PINK_TERRACOTTA_BRICK_SLAB = register("pink_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(PINK_TERRACOTTA_BRICK), true);
    public static Block PINK_TERRACOTTA_BRICK_WALL = register("pink_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(PINK_TERRACOTTA_BRICK), true);


    public static Block PURPLE_TERRACOTTA_BRICK = register(
            "purple_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );
    public static Block PURPLE_TERRACOTTA_BRICK_STAIRS = register("purple_terracotta_brick_stairs", settings -> new StairsBlock(PURPLE_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(PURPLE_TERRACOTTA_BRICK), true);
    public static Block PURPLE_TERRACOTTA_BRICK_SLAB = register("purple_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(PURPLE_TERRACOTTA_BRICK), true);
    public static Block PURPLE_TERRACOTTA_BRICK_WALL = register("purple_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(PURPLE_TERRACOTTA_BRICK), true);

    public static Block RED_TERRACOTTA_BRICK = register(
            "red_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block RED_TERRACOTTA_BRICK_STAIRS = register("red_terracotta_brick_stairs", settings -> new StairsBlock(RED_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(RED_TERRACOTTA_BRICK), true);
    public static Block RED_TERRACOTTA_BRICK_SLAB = register("red_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(RED_TERRACOTTA_BRICK), true);
    public static Block RED_TERRACOTTA_BRICK_WALL = register("red_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(RED_TERRACOTTA_BRICK), true);


    public static Block TERRACOTTA_BRICK = register(
            "terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block TERRACOTTA_BRICK_STAIRS = register("terracotta_brick_stairs", settings -> new StairsBlock(TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(TERRACOTTA_BRICK), true);
    public static Block TERRACOTTA_BRICK_SLAB = register("terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(TERRACOTTA_BRICK), true);
    public static Block TERRACOTTA_BRICK_WALL = register("terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(TERRACOTTA_BRICK), true);


    public static Block WHITE_TERRACOTTA_BRICK = register(
            "white_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block WHITE_TERRACOTTA_BRICK_STAIRS = register("white_terracotta_brick_stairs", settings -> new StairsBlock(WHITE_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(WHITE_TERRACOTTA_BRICK), true);
    public static Block WHITE_TERRACOTTA_BRICK_SLAB = register("white_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(WHITE_TERRACOTTA_BRICK), true);
    public static Block WHITE_TERRACOTTA_BRICK_WALL = register("white_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(WHITE_TERRACOTTA_BRICK), true);


    public static Block YELLOW_TERRACOTTA_BRICK = register(
            "yellow_terracotta_brick",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.25F, 4.2F),
            true
    );

    public static Block YELLOW_TERRACOTTA_BRICK_STAIRS = register("yellow_terracotta_brick_stairs", settings -> new StairsBlock(YELLOW_TERRACOTTA_BRICK.getDefaultState(), settings), AbstractBlock.Settings.copy(YELLOW_TERRACOTTA_BRICK), true);
    public static Block YELLOW_TERRACOTTA_BRICK_SLAB = register("yellow_terracotta_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(YELLOW_TERRACOTTA_BRICK), true);
    public static Block YELLOW_TERRACOTTA_BRICK_WALL = register("yellow_terracotta_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(YELLOW_TERRACOTTA_BRICK), true);


    public static Block ECHO_SOIL = register(
            "echo_soil",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.MOSS_BLOCK),
            true
    );

    public static Block CHISELED_SCULK_STONE = register(
            "chiseled_sculk_stone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS),
            true
    );

    public static Block COBBLED_SCULK_STONE = register(
            "cobbled_sculk_stone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block COBBLED_SCULK_STONE_STAIRS = register(
            "cobbled_sculk_stone_stairs",
            settings -> new StairsBlock(COBBLED_SCULK_STONE.getDefaultState(), settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block COBBLED_SCULK_STONE_SLAB = register(
            "cobbled_sculk_stone_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block COBBLED_SCULK_STONE_WALL = register(
            "cobbled_sculk_stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );

    public static Block CUT_SCULK_STONE = register(
            "cut_sculk_stone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES),
            true
    );
    public static Block CUT_SCULK_STONE_STAIRS = register(
            "cut_sculk_stone_stairs",
            settings -> new StairsBlock(CUT_SCULK_STONE.getDefaultState(), settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES),
            true
    );
    public static Block CUT_SCULK_STONE_SLAB = register(
            "cut_sculk_stone_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES),
            true
    );

    public static Block POLISHED_SCULK_STONE = register(
            "polished_sculk_stone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block POLISHED_SCULK_STONE_STAIRS = register(
            "polished_sculk_stone_stairs",
            settings -> new StairsBlock(POLISHED_SCULK_STONE.getDefaultState(), settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block POLISHED_SCULK_STONE_SLAB = register(
            "polished_sculk_stone_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block POLISHED_SCULK_STONE_WALL = register(
            "polished_sculk_stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );

    public static Block SCULK_STONE = register(
            "sculk_stone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block SCULK_STONE_STAIRS = register(
            "sculk_stone_stairs",
            settings -> new StairsBlock(SCULK_STONE.getDefaultState(), settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block SCULK_STONE_SLAB = register(
            "sculk_stone_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block SCULK_STONE_WALL = register(
            "sculk_stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );

    public static Block SCULK_STONE_BRICKS = register(
            "sculk_stone_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS),
            true
    );
    public static Block SCULK_STONE_BRICKS_STAIRS = register(
            "sculk_stone_bricks_stairs",
            settings -> new StairsBlock(SCULK_STONE_BRICKS.getDefaultState(), settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS),
            true
    );
    public static Block SCULK_STONE_BRICKS_SLAB = register(
            "sculk_stone_bricks_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS),
            true
    );
    public static Block SCULK_STONE_BRICKS_WALL = register(
            "sculk_stone_bricks_wall",
            WallBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS),
            true
    );

    public static Block SCULK_STONE_TILES = register(
            "sculk_stone_tiles",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES),
            true
    );
    public static Block SCULK_STONE_TILES_SLAB = register(
            "sculk_stone_tiles_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES),
            true
    );

    public static Block SMOOTH_SCULK_STONE = register(
            "smooth_sculk_stone",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block SMOOTH_SCULK_STONE_STAIRS = register(
            "smooth_sculk_stone_stairs",
            settings -> new StairsBlock(SMOOTH_SCULK_STONE.getDefaultState(), settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block SMOOTH_SCULK_STONE_SLAB = register(
            "smooth_sculk_stone_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block SMOOTH_SCULK_STONE_WALL = register(
            "smooth_sculk_stone_wall",
            WallBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE),
            true
    );
    public static Block BUDDING_SMARAGDANT_CRYSTAL = register(
            "budding_smaragdant_crystal",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block SMARAGDANT_CRYSTAL = register(
            "smaragdant_crystal",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block SMARAGDANT_CRYSTAL_BRICKS = register(
            "smaragdant_crystal_bricks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block POLISHED_SMARAGDANT_CRYSTAL = register(
            "polished_smaragdant_crystal",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block SMARAGDANT_CRYSTAL_TILES = register(
            "smaragdant_crystal_tiles",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block SMARAGDANT_CRYSTAL_PILLAR = register(
            "smaragdant_crystal_pillar",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );
    public static Block SMARAGDANT_CRYSTAL_SHARD = register(
            "smaragdant_crystal_shard",
            settings -> new AmethystClusterBlock(6, 4, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true
    );

    public static ImmutableMap<BlockType, Block> GLOWSHROOM_SET = registerWoodSet("mossy_glowshroom", AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK), WoodType.WARPED);
    public static Block GLOWSHROOM_LOG = register(
            "mossy_glowshroom_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block GLOWSHROOM_WOOD = register(
            "mossy_glowshroom_wood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block STRIPPED_GLOWSHROOM_LOG = register(
            "stripped_mossy_glowshroom_log",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block STRIPPED_GLOWSHROOM_WOOD = register(
            "stripped_mossy_glowshroom_wood",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block GLOWSHROOM_HYMENOPHORE = register(
            "mossy_glowshroom_hymenophore",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );

    public static ImmutableSet<ImmutableMap<BlockType, Block>> BLOCK_SETS = ImmutableSet.of(EBONY_SET, DARK_CHERRY_SET, GLOWSHROOM_SET, TANGLEWOOD_SET, ANCHOR_SET);

    public static void initialize() {
    }

    private static <T extends BlockItem> Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings blockSettings, @Nullable BiFunction<Block, Item.Settings, T> itemFactory) {
        Identifier identifier = Identifier.of(MOD_ID, name);

        Block block = blockFactory.apply(blockSettings);

        if (itemFactory != null) {
            T item = itemFactory.apply(block, new Item.Settings());

            Registry.register(Registries.ITEM, identifier, item);
        }

        ALL.add(block);

        return Registry.register(Registries.BLOCK, identifier, block);
    }

    private static Block register(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings blockSettings, boolean registerItem) {
        return register(name, factory, blockSettings, registerItem ? BlockItem::new : null);
    }

    private static <T extends BlockItem> ImmutableMap<BlockType, Block> registerWoodSet(String name, AbstractBlock.Settings blockSettings, WoodType woodType) {
        return registerWoodSet(name, blockSettings, woodType, false);
    }

    private static <T extends BlockItem> ImmutableMap<BlockType, Block> registerWoodSet(String name, AbstractBlock.Settings blockSettings, WoodType woodType, boolean registerWall) {
        Block planks = register(name.concat("_planks"), Block::new, blockSettings, true);

        Block stairs = register(
                name.concat("_stairs"),
                settings -> new StairsBlock(planks.getDefaultState(), settings),
                AbstractBlock.Settings.copy(planks),
                true
        );
        Block slab = register(
                name.concat("_slab"),
                SlabBlock::new,
                AbstractBlock.Settings.copy(planks),
                true
        );

        Block fence = register(
                name.concat("_fence"),
                FenceBlock::new,
                AbstractBlock.Settings.copy(planks)
                        .solid(),
                true
        );
        Block fenceGate = register(
                name.concat("_fence_gate"),
                settings -> new FenceGateBlock(woodType, settings),
                AbstractBlock.Settings.copy(planks)
                        .solid(),
                true
        );

        Block door = register(
                name.concat("_door"),
                settings -> new DoorBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.copy(planks)
                        .strength(3.0f)
                        .nonOpaque()
                        .pistonBehavior(PistonBehavior.DESTROY),
                true
        );
        Block trapdoor = register(
                name.concat("_trapdoor"),
                settings -> new TrapdoorBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.copy(planks)
                        .strength(3.0f)
                        .nonOpaque(),
                true
        );

        Block pressure_plate = register(
                name.concat("_pressure_plate"),
                settings -> new PressurePlateBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.copy(planks)
                        .solid()
                        .noCollision()
                        .strength(0.5f)
                        .pistonBehavior(PistonBehavior.DESTROY),
                true
        );
        Block button = register(
                name.concat("_button"),
                settings -> new ButtonBlock(BlockSetType.OAK, 30, settings),
                AbstractBlock.Settings.copy(planks)
                        .noCollision()
                        .strength(0.5f)
                        .pistonBehavior(PistonBehavior.DESTROY),
                true
        );

        if (registerWall) {
            Block wall = register(name.concat("_wall"), WallBlock::new, AbstractBlock.Settings.copy(planks), true);

            return ImmutableMap.of(
                    BlockType.CUBE, planks,
                    BlockType.STAIRS, stairs,
                    BlockType.SLAB, slab,
                    BlockType.FENCE, fence,
                    BlockType.GATE, fenceGate,
                    BlockType.PRESSURE_PLATE, pressure_plate,
                    BlockType.BUTTON, button,
                    BlockType.TRAPDOOR, trapdoor,
                    BlockType.DOOR, door,
                    BlockType.WALL, wall
            );
        } else {
            return ImmutableMap.of(
                    BlockType.CUBE, planks,
                    BlockType.STAIRS, stairs,
                    BlockType.SLAB, slab,
                    BlockType.FENCE, fence,
                    BlockType.GATE, fenceGate,
                    BlockType.PRESSURE_PLATE, pressure_plate,
                    BlockType.BUTTON, button,
                    BlockType.TRAPDOOR, trapdoor,
                    BlockType.DOOR, door
            );
        }
    }
}
