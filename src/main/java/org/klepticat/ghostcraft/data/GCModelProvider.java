package org.klepticat.ghostcraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import org.klepticat.ghostcraft.GCItems;
import org.klepticat.ghostcraft.block.BlockType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

import static org.klepticat.ghostcraft.GCBlocks.*;
import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCModelProvider extends FabricModelProvider {
    public GCModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ADENDA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(AURITE);
        blockStateModelGenerator.registerSimpleCubeAll(AURORA_CRYSTAL);
        blockStateModelGenerator.registerSimpleCubeAll(BLEEDING_COIL);
        blockStateModelGenerator.registerSimpleCubeAll(CANDY_CANE);
        blockStateModelGenerator.registerSimpleCubeAll(CABBAGE);
        blockStateModelGenerator.registerSimpleCubeAll(CHOGGY_BLOGGY);
        blockStateModelGenerator.registerSimpleCubeAll(ENCHANTED_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(END_MOSS);
        blockStateModelGenerator.registerSimpleCubeAll(NOISE);
        blockStateModelGenerator.registerSimpleCubeAll(VOID);
        blockStateModelGenerator.registerSimpleCubeAll(CHECK_MARK);
        blockStateModelGenerator.registerSimpleCubeAll(X_MARK);


        blockStateModelGenerator.registerSimpleCubeAll(BLACK_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BLUE_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BROWN_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(CYAN_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(GRAY_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(GREEN_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(LIGHT_BLUE_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(LIGHT_GRAY_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(LIME_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(MAGENTA_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ORANGE_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(PINK_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(PURPLE_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(RED_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(WHITE_TERRACOTTA_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(YELLOW_TERRACOTTA_BRICK);


        blockStateModelGenerator.registerSimpleCubeAll(BLACK_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(BLACK_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );
        blockStateModelGenerator.registerSimpleCubeAll(BLUE_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(BLUE_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );
        blockStateModelGenerator.registerSimpleCubeAll(GREEN_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(GREEN_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );
        blockStateModelGenerator.registerSimpleCubeAll(INDIGO_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(INDIGO_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );
        blockStateModelGenerator.registerSimpleCubeAll(ORANGE_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(ORANGE_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );
        blockStateModelGenerator.registerSimpleCubeAll(RED_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(RED_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );
        blockStateModelGenerator.registerSimpleCubeAll(VIOLET_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(VIOLET_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );
        blockStateModelGenerator.registerSimpleCubeAll(WHITE_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(WHITE_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );
        blockStateModelGenerator.registerSimpleCubeAll(YELLOW_CORUNDUM);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(YELLOW_CORUNDUM_CLUSTER, blockStateModelGenerator)
        );


        blockStateModelGenerator.registerSingleton(APPLE_CRATE, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(GOLDEN_APPLE_CRATE, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(GOLDEN_CARROT_CRATE, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(BEETROOT_CRATE, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(CARROT_CRATE, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(POTATO_CRATE, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(BERRY_SACK, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(GLOWBERRY_SACK, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(COCOA_BEANS_SACK, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(GUNPOWDER_SACK, TexturedModel.SIDE_TOP_BOTTOM_WALL);
        blockStateModelGenerator.registerSingleton(NETHER_WART_SACK, TexturedModel.SIDE_TOP_BOTTOM_WALL);


        blockStateModelGenerator.registerDoor(ANCIENT_OAK_DOOR);
        blockStateModelGenerator.registerDoor(BOSS_DOOR);
        blockStateModelGenerator.registerTrapdoor(GRATED_IRON_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(GRATED_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(DREADWOOD_TRAPDOOR);


        blockStateModelGenerator.registerSimpleCubeAll(COBBLED_LIGHT_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(TILED_LIGHT_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(POLISHED_LIGHT_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(RIVETED_LIGHT_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(BLOODY_LIGHT_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(BLOODY_LIGHT_DREADSTONE_BRICKS);
        blockStateModelGenerator.registerDoor(LIGHT_DREADSTONE_DOOR);


        blockStateModelGenerator.registerSimpleCubeAll(COBBLED_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(TILED_COBBLED_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(DREADSTONE_BLOCK);
       // blockStateModelGenerator.registerRedstoneLamp(DREADSTONE_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(DREADSTONE_GRATE);
        //blockStateModelGenerator.registerIronBars(DREADSTONE_BARS);
        blockStateModelGenerator.registerSimpleCubeAll(DREADSTONE_GLASS);
        blockStateModelGenerator.registerSimpleCubeAll(DREADSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(GRATED_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(DREADSTONE_WINDOW);
        blockStateModelGenerator.registerSimpleCubeAll(POLISHED_CHISELED_DREADSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(POLISHED_DREADSTONE);
        blockStateModelGenerator.registerSingleton(DREADSTONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(CHISELED_DREADSTONE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerDoor(DREADSTONE_DOOR);
        blockStateModelGenerator.registerTrapdoor(DREADSTONE_TRAPDOOR);
        blockStateModelGenerator.registerDoor(LOCKED_DREADSTONE_DOOR);

        blockStateModelGenerator.registerSimpleCubeAll(MARBLED_FLESH);
        blockStateModelGenerator.registerSimpleCubeAll(SCALED_FLESH);
        blockStateModelGenerator.registerSimpleCubeAll(CRIMSON_WOOL);

        createLogWithVariants(GLOWSHROOM_LOG, 4, blockStateModelGenerator);
        createWoodWithVariants(GLOWSHROOM_WOOD, GLOWSHROOM_LOG, 4, blockStateModelGenerator);
        createLogWithVariants(STRIPPED_GLOWSHROOM_LOG, 4, blockStateModelGenerator);
        createWoodWithVariants(STRIPPED_GLOWSHROOM_WOOD, STRIPPED_GLOWSHROOM_LOG, 4, blockStateModelGenerator);
        createCubeWithVariants(GLOWSHROOM_HYMENOPHORE, 3, blockStateModelGenerator);

        createLogWithVariants(ANCHOR_LOG, 2, blockStateModelGenerator);
        createWoodWithVariants(ANCHOR_WOOD, ANCHOR_LOG, 2, blockStateModelGenerator);
        createLogWithVariants(STRIPPED_ANCHOR_LOG, 2, blockStateModelGenerator);
        createWoodWithVariants(STRIPPED_ANCHOR_WOOD, STRIPPED_ANCHOR_LOG, 2, blockStateModelGenerator);

        blockStateModelGenerator.registerLog(EBONY_LOG).log(EBONY_LOG).wood(EBONY_WOOD);
        blockStateModelGenerator.registerLog(STRIPPED_EBONY_LOG).log(STRIPPED_EBONY_LOG).wood(STRIPPED_EBONY_WOOD);

        blockStateModelGenerator.registerHangingSign(EBONY_LOG, EBONY_HANGING_SIGN, EBONY_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerLog(TANGLEWOOD_LOG).log(TANGLEWOOD_LOG).wood(TANGLEWOOD);

        blockStateModelGenerator.registerLog(DARK_CHERRY_LOG).log(DARK_CHERRY_LOG).wood(DARK_CHERRY_WOOD);
        blockStateModelGenerator.registerLog(STRIPPED_DARK_CHERRY_LOG).log(STRIPPED_DARK_CHERRY_LOG).wood(STRIPPED_DARK_CHERRY_WOOD);

        blockStateModelGenerator.registerHangingSign(STRIPPED_DARK_CHERRY_LOG, DARK_CHERRY_HANGING_SIGN, DARK_CHERRY_WALL_HANGING_SIGN);

        BlockStateModelGenerator.BlockTexturePool amethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);

        amethystPool.stairs(AMETHYST_STAIRS);
        amethystPool.slab(AMETHYST_SLAB);
        amethystPool.wall(AMETHYST_WALL);

        BlockStateModelGenerator.BlockTexturePool blueNetherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BLUE_NETHERRACK);

        blueNetherrackPool.stairs(BLUE_NETHERRACK_STAIRS);
        blueNetherrackPool.slab(BLUE_NETHERRACK_SLAB);
        blueNetherrackPool.wall(BLUE_NETHERRACK_WALL);

        BlockStateModelGenerator.BlockTexturePool netherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERRACK);

        netherrackPool.stairs(NETHERRACK_STAIRS);
        netherrackPool.slab(NETHERRACK_SLAB);
        netherrackPool.wall(NETHERRACK_WALL);
        netherrackPool.fence(NETHERRACK_FENCE);

        BlockStateModelGenerator.BlockTexturePool templeBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TEMPLE_BRICKS);

        templeBrickPool.stairs(TEMPLE_BRICKS_STAIRS);
        templeBrickPool.slab(TEMPLE_BRICKS_SLAB);
        templeBrickPool.wall(TEMPLE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool dripstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DRIPSTONE_BLOCK);

        dripstonePool.stairs(DRIPSTONE_STAIRS);
        dripstonePool.slab(DRIPSTONE_SLAB);
        dripstonePool.wall(DRIPSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothBasaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);

        smoothBasaltPool.stairs(SMOOTH_BASALT_STAIRS);
        smoothBasaltPool.slab(SMOOTH_BASALT_SLAB);
        smoothBasaltPool.wall(SMOOTH_BASALT_WALL);

        BlockStateModelGenerator.BlockTexturePool brownGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BROWN_GRANITE);

        brownGranitePool.stairs(BROWN_GRANITE_STAIRS);
        brownGranitePool.slab(BROWN_GRANITE_SLAB);
        brownGranitePool.wall(BROWN_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedBrownGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_BROWN_GRANITE);

        polishedBrownGranitePool.stairs(POLISHED_BROWN_GRANITE_STAIRS);
        polishedBrownGranitePool.slab(POLISHED_BROWN_GRANITE_SLAB);
        polishedBrownGranitePool.wall(POLISHED_BROWN_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool slatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SLATE);

        slatePool.stairs(SLATE_STAIRS);
        slatePool.slab(SLATE_SLAB);
        slatePool.wall(SLATE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(CHISELED_SCULK_STONE);

        BlockStateModelGenerator.BlockTexturePool cobbledSculkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(COBBLED_SCULK_STONE);

        cobbledSculkPool.stairs(COBBLED_SCULK_STONE_STAIRS);
        cobbledSculkPool.slab(COBBLED_SCULK_STONE_SLAB);
        cobbledSculkPool.wall(COBBLED_SCULK_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool cutSculkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(CUT_SCULK_STONE);

        cutSculkPool.stairs(CUT_SCULK_STONE_STAIRS);
        cutSculkPool.slab(CUT_SCULK_STONE_SLAB);

        BlockStateModelGenerator.BlockTexturePool polishedSculkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_SCULK_STONE);

        polishedSculkPool.stairs(POLISHED_SCULK_STONE_STAIRS);
        polishedSculkPool.slab(POLISHED_SCULK_STONE_SLAB);
        polishedSculkPool.wall(POLISHED_SCULK_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool sculkStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SCULK_STONE);

        sculkStonePool.stairs(SCULK_STONE_STAIRS);
        sculkStonePool.slab(SCULK_STONE_SLAB);
        sculkStonePool.wall(SCULK_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool sculkStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SCULK_STONE_BRICKS);

        sculkStoneBricksPool.stairs(SCULK_STONE_BRICKS_STAIRS);
        sculkStoneBricksPool.slab(SCULK_STONE_BRICKS_SLAB);
        sculkStoneBricksPool.wall(SCULK_STONE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool sculkStoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SCULK_STONE_TILES);

        sculkStoneTilesPool.slab(SCULK_STONE_TILES_SLAB);

        BlockStateModelGenerator.BlockTexturePool smoothSculkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_SCULK_STONE);

        smoothSculkPool.stairs(SMOOTH_SCULK_STONE_STAIRS);
        smoothSculkPool.slab(SMOOTH_SCULK_STONE_SLAB);
        smoothSculkPool.wall(SMOOTH_SCULK_STONE_WALL);


        blockStateModelGenerator.registerSimpleCubeAll(SMARAGDANT_CRYSTAL);
        blockStateModelGenerator.blockStateCollector.accept(
                crystalCluster(SMARAGDANT_CRYSTAL_SHARD, blockStateModelGenerator)
        );

        BLOCK_SETS.forEach(blockSet -> {
            blockStateModelGenerator.registerDoor(blockSet.get(BlockType.DOOR));
            blockStateModelGenerator.registerTrapdoor(blockSet.get(BlockType.TRAPDOOR));

            BlockStateModelGenerator.BlockTexturePool blockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(blockSet.get(BlockType.CUBE));

            blockTexturePool.stairs(blockSet.get(BlockType.STAIRS));
            blockTexturePool.slab(blockSet.get(BlockType.SLAB));

            blockTexturePool.button(blockSet.get(BlockType.BUTTON));
            blockTexturePool.pressurePlate(blockSet.get(BlockType.PRESSURE_PLATE));

            blockTexturePool.fence(blockSet.get(BlockType.FENCE));
            blockTexturePool.fenceGate(blockSet.get(BlockType.GATE));

            if (blockSet.containsKey(BlockType.WALL)) {
                blockTexturePool.wall(blockSet.get(BlockType.WALL));
            }
        });
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        registerGeneratedItem(GCItems.RAW_SHADOW, "loot/mob_drops/shadow/", itemModelGenerator);
        registerGeneratedItem(GCItems.SHADOW_TENDRIL, "loot/mob_drops/shadow/", itemModelGenerator);
        registerGeneratedItem(GCItems.SHADOW_EYE, "loot/mob_drops/shadow/", itemModelGenerator);
        registerGeneratedItem(GCItems.SHADOW_TOOTH, "loot/mob_drops/shadow/", itemModelGenerator);
        registerGeneratedItem(GCItems.ARCANE_POWDER, "loot/", itemModelGenerator);
        registerGeneratedItem(GCItems.TREE_RESIN, "loot/", itemModelGenerator);
        registerHandheldItem(GCItems.HAMMER, "util/", itemModelGenerator);
        registerHandheldItem(GCItems.CROWBAR, "util/", itemModelGenerator);
        registerHandheldItem(GCItems.SPELL_SCROLL, "util/", itemModelGenerator);
        registerPlaceableItem(GCItems.MARIAH, "placeables/", itemModelGenerator);

        GCItems.GENERIC_FOODS_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/", itemModelGenerator);
        });

        GCItems.BREAD_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/", itemModelGenerator);
        });

        GCItems.GUMMY_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/gummies/", itemModelGenerator);
        });

        GCItems.FISH_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/fish/", itemModelGenerator);
        });

        GCItems.POUCH_SET.forEach(item -> {
            registerGeneratedItem(item, "pouches/", itemModelGenerator);
        });

        GCItems.EVO_SET.forEach(item -> {
            registerGeneratedItem(item, "evo_stones/", itemModelGenerator);
        });

        GCItems.FLAG_SET.forEach(item -> {
            registerPlaceableItem(item, "placeables/flags/", itemModelGenerator);
        });

        GCItems.PUMPKIN_SET.forEach(item -> {
            registerTileItem(item, "placeables/decorations/pumpkins/", itemModelGenerator);
        });

        GCItems.ElytraItems.ELYTRA_SET.forEach(item -> {
            registerGeneratedItem(item, "elytra/", itemModelGenerator);
        });
    }

    public static VariantsBlockStateSupplier crystalCluster(Block block, BlockStateModelGenerator generator) {
        return VariantsBlockStateSupplier.create(
                block,
                BlockStateVariant.create().put(
                        VariantSettings.MODEL,
                        Models.CROSS.upload(
                                block,
                                TextureMap.cross(block),
                                generator.modelCollector
                        )
                )
        ).coordinate(generator.createUpDefaultFacingVariantMap());
    }

    public static void createCubeWithVariants(Block block, int variants, BlockStateModelGenerator generator) {
        HashSet<BlockStateVariant> blockStateVariants = new HashSet<>();

        blockStateVariants.add(BlockStateVariant.create().put(VariantSettings.MODEL, TexturedModel.CUBE_ALL.upload(block, generator.modelCollector)));

        for (int i = 0; i < variants; i++) {
            int finalI = i;

            TexturedModel texturedModel = TexturedModel.getCubeAll(Registries.BLOCK.getId(block).withPath(path -> "block/" + path + "_" + (finalI + 2)));
            Identifier identifier = texturedModel.upload(block, "_" + (i + 2), generator.modelCollector);
            blockStateVariants.add(BlockStateVariant.create().put(VariantSettings.MODEL, identifier));
        }

        generator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(
                        block,
                        blockStateVariants.toArray(new BlockStateVariant[0])
                )
        );
    }

    public static void createLogWithVariants(Block block, int variants, BlockStateModelGenerator generator) {
        HashSet<BlockStateVariant> xBlockStateVariants = new HashSet<>();
        HashSet<BlockStateVariant> yBlockStateVariants = new HashSet<>();
        HashSet<BlockStateVariant> zBlockStateVariants = new HashSet<>();

        TextureMap textureMap = TextureMap.sideEnd(Registries.BLOCK.getId(block).withPath(path -> "block/" + path + "_side"), Registries.BLOCK.getId(block).withPath(path -> "block/" + path + "_top"));

        TexturedModel texturedModel = new TexturedModel(textureMap, Models.CUBE_COLUMN);
        //TexturedModel texturedModel2 = new TexturedModel(textureMap, Models.CUBE_COLUMN_HORIZONTAL);

        Identifier identifier = texturedModel.upload(block, generator.modelCollector);
        //Identifier identifier2 = texturedModel2.upload(block, generator.modelCollector);

        xBlockStateVariants.add(createAxisVariantX(identifier));
        yBlockStateVariants.add(createAxisVariantY(identifier));
        zBlockStateVariants.add(createAxisVariantZ(identifier));

        for (int i = 0; i < variants; i++) {
            int finalI = i;

            TextureMap variantTextureMap = TextureMap.sideEnd(
                    Registries.BLOCK.getId(block).withPath(path -> "block/" + path + "_side" + "_" + (finalI + 2)),
                    Registries.BLOCK.getId(block).withPath(path -> "block/" + path + "_top")
            );
            TexturedModel variantTexturedModel = new TexturedModel(variantTextureMap, Models.CUBE_COLUMN);
            Identifier variantIdentifier = variantTexturedModel.upload(block, "_" + (i + 2), generator.modelCollector);

            xBlockStateVariants.add(createAxisVariantX(variantIdentifier));
            yBlockStateVariants.add(createAxisVariantY(variantIdentifier));
            zBlockStateVariants.add(createAxisVariantZ(variantIdentifier));
        }

        generator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block)
                        .coordinate(
                                BlockStateVariantMap.create(Properties.AXIS)
                                        .register(Direction.Axis.X, new ArrayList<>(xBlockStateVariants))
                                        .register(Direction.Axis.Y, new ArrayList<>(yBlockStateVariants))
                                        .register(Direction.Axis.Z, new ArrayList<>(zBlockStateVariants))
                        )
        );
    }

    public static void createWoodWithVariants(Block block, Block logBlock, int variants, BlockStateModelGenerator generator) {
        HashSet<BlockStateVariant> xBlockStateVariants = new HashSet<>();
        HashSet<BlockStateVariant> yBlockStateVariants = new HashSet<>();
        HashSet<BlockStateVariant> zBlockStateVariants = new HashSet<>();

        TextureMap textureMap = TextureMap.sideEnd(Registries.BLOCK.getId(logBlock).withPath(path -> "block/" + path + "_side"), Registries.BLOCK.getId(logBlock).withPath(path -> "block/" + path + "_side"));

        TexturedModel texturedModel = new TexturedModel(textureMap, Models.CUBE_COLUMN);
        //TexturedModel texturedModel2 = new TexturedModel(textureMap, Models.CUBE_COLUMN_HORIZONTAL);

        Identifier identifier = texturedModel.upload(block, generator.modelCollector);
        //Identifier identifier2 = texturedModel2.upload(block, generator.modelCollector);

        xBlockStateVariants.add(createAxisVariantX(identifier));
        yBlockStateVariants.add(createAxisVariantY(identifier));
        zBlockStateVariants.add(createAxisVariantZ(identifier));

        for (int i = 0; i < variants; i++) {
            int finalI = i;

            TextureMap variantTextureMap = TextureMap.sideEnd(
                    Registries.BLOCK.getId(logBlock).withPath(path -> "block/" + path + "_side" + "_" + (finalI + 2)),
                    Registries.BLOCK.getId(logBlock).withPath(path -> "block/" + path + "_side" + "_" + (finalI + 2))
            );
            TexturedModel variantTexturedModel = new TexturedModel(variantTextureMap, Models.CUBE_COLUMN);
            Identifier variantIdentifier = variantTexturedModel.upload(block, "_" + (i + 2), generator.modelCollector);

            xBlockStateVariants.add(createAxisVariantX(variantIdentifier));
            yBlockStateVariants.add(createAxisVariantY(variantIdentifier));
            zBlockStateVariants.add(createAxisVariantZ(variantIdentifier));
        }

        generator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block)
                        .coordinate(
                                BlockStateVariantMap.create(Properties.AXIS)
                                        .register(Direction.Axis.X, new ArrayList<>(xBlockStateVariants))
                                        .register(Direction.Axis.Y, new ArrayList<>(yBlockStateVariants))
                                        .register(Direction.Axis.Z, new ArrayList<>(zBlockStateVariants))
                        )
        );
    }

    public static BlockStateVariant createAxisVariantX(Identifier identifier) {
        return BlockStateVariant.create()
                .put(VariantSettings.MODEL, identifier)
                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                .put(VariantSettings.Y, VariantSettings.Rotation.R90);
    }

    public static BlockStateVariant createAxisVariantY(Identifier identifier) {
        return BlockStateVariant.create()
                .put(VariantSettings.MODEL, identifier);
    }

    public static BlockStateVariant createAxisVariantZ(Identifier identifier) {
        return BlockStateVariant.create()
                .put(VariantSettings.MODEL, identifier)
                .put(VariantSettings.X, VariantSettings.Rotation.R90);
    }

    public static void registerGeneratedItem(Item item, String prefix, ItemModelGenerator generator) {
        Identifier itemId = Registries.ITEM.getId(item);
        Models.GENERATED.upload(ModelIds.getItemModelId(item), TextureMap.layer0(itemId.withPrefixedPath(prefix).withPrefixedPath("item/")), generator.writer);
    }

    public static void registerHandheldItem(Item item, String prefix, ItemModelGenerator generator) {
        Identifier itemId = Registries.ITEM.getId(item);
        Models.HANDHELD.upload(ModelIds.getItemModelId(item), TextureMap.layer0(itemId.withPrefixedPath(prefix).withPrefixedPath("item/")), generator.writer);
    }

    public static void registerPlaceableItem(Item item, String prefix, ItemModelGenerator generator) {
        Identifier itemId = Registries.ITEM.getId(item);
        Model model = new Model(Optional.of(Identifier.of(MOD_ID, "sources/4x_placeable")), Optional.empty(), TextureKey.LAYER0);

        model.upload(ModelIds.getItemModelId(item), TextureMap.layer0(itemId.withPrefixedPath(prefix).withPrefixedPath("item/")), generator.writer);
    }

    public static void registerTileItem(Item item, String prefix, ItemModelGenerator generator) {
        Identifier itemId = Registries.ITEM.getId(item);
        Model model = new Model(Optional.of(Identifier.of(MOD_ID, "sources/16x_tile")), Optional.empty(), TextureKey.LAYER0);

        model.upload(ModelIds.getItemModelId(item), TextureMap.layer0(itemId.withPrefixedPath(prefix).withPrefixedPath("item/")), generator.writer);
    }
}
