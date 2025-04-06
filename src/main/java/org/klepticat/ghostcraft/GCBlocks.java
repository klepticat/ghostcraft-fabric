package org.klepticat.ghostcraft;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.block.GCSignBlock;
import org.klepticat.ghostcraft.block.GCWallSignBlock;

import java.util.function.Function;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCBlocks {
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
    public static Block AURITE = register(
            "aurite",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .solid()
                    .sounds(BlockSoundGroup.SHROOMLIGHT)
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
                    .sounds(BlockSoundGroup.SHROOMLIGHT),
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
    public static Block DARK_CHERRY_PLANKS = register(
            "dark_cherry_planks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block DARK_CHERRY_DOOR = register(
            "dark_cherry_door",
            settings -> new DoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY),
            true
    );
    public static Block DARK_CHERRY_TRAPDOOR = register(
            "dark_cherry_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.MANGROVE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable(),
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
    public static Block EBONY_PLANKS = register(
            "ebony_planks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable(),
            true
    );
    public static Block EBONY_DOOR = register(
            "ebony_door",
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
    public static Block EBONY_TRAPDOOR = register(
            "ebony_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable(),
            true
    );
    public static Block EBONY_SIGN = register(
            "ebony_sign",
            settings -> new GCSignBlock(WoodType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .solid()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(1.0F)
                    .burnable(),
            true
    );
    public static final Block EBONY_WALL_SIGN = register(
            "ebony_wall_sign",
            settings -> new GCWallSignBlock(WoodType.OAK, settings),
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
            settings -> new HangingSignBlock(WoodType.OAK, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .nonOpaque()
                    .burnable(),
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
                    .solidBlock(Blocks::never),
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
    public static Block TANGLEWOOD_PLANKS = register(
            "tanglewood_planks",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LAPIS_BLUE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)
                    .burnable(),
            true
    );
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
    public static Block VOID = register(
            "void",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never),
            true
    );

    public static void initialize() {
    }

    private static Block register(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings blockSettings, boolean registerItem) {
        Identifier identifier = Identifier.of(MOD_ID, name);

        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        Block block = factory.apply(blockSettings);

        if (registerItem) {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, identifier);

            BlockItem item = new BlockItem(block, new Item.Settings());

            Registry.register(Registries.ITEM, identifier, item);
        }

        return Registry.register(Registries.BLOCK, identifier, block);
    }
}
