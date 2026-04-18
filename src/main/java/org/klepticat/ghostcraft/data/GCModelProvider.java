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

        blockStateModelGenerator.registerSimpleCubeAll(SKYRIS_BOOKSHELF);

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



        BlockStateModelGenerator.BlockTexturePool BLACKTerraBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BLACK_TERRACOTTA_BRICK);
        BLACKTerraBrickPool.stairs(BLACK_TERRACOTTA_BRICK_STAIRS);
        BLACKTerraBrickPool.slab(BLACK_TERRACOTTA_BRICK_SLAB);
        BLACKTerraBrickPool.wall(BLACK_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool BLUETerraBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BLUE_TERRACOTTA_BRICK);
        BLUETerraBrickPool.stairs(BLUE_TERRACOTTA_BRICK_STAIRS);
        BLUETerraBrickPool.slab(BLUE_TERRACOTTA_BRICK_SLAB);
        BLUETerraBrickPool.wall(BLUE_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool BRTerraBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BROWN_TERRACOTTA_BRICK);
        BRTerraBrickPool.stairs(BROWN_TERRACOTTA_BRICK_STAIRS);
        BRTerraBrickPool.slab(BROWN_TERRACOTTA_BRICK_SLAB);
        BRTerraBrickPool.wall(BROWN_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool CTerraBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(CYAN_TERRACOTTA_BRICK);
        CTerraBrickPool.stairs(CYAN_TERRACOTTA_BRICK_STAIRS);
        CTerraBrickPool.slab(CYAN_TERRACOTTA_BRICK_SLAB);
        CTerraBrickPool.wall(CYAN_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool GRATerraBrickPool =  blockStateModelGenerator.registerCubeAllModelTexturePool(GRAY_TERRACOTTA_BRICK);
        GRATerraBrickPool.stairs(GRAY_TERRACOTTA_BRICK_STAIRS);
        GRATerraBrickPool.slab(GRAY_TERRACOTTA_BRICK_SLAB);
        GRATerraBrickPool.wall(GRAY_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool GRETerraBrickPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(GREEN_TERRACOTTA_BRICK);
        GRETerraBrickPool.stairs(GREEN_TERRACOTTA_BRICK_STAIRS);
        GRETerraBrickPool.slab(GREEN_TERRACOTTA_BRICK_SLAB);
        GRETerraBrickPool.wall(GREEN_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool LIBTerraBrickPool =  blockStateModelGenerator.registerCubeAllModelTexturePool(LIGHT_BLUE_TERRACOTTA_BRICK);
        LIBTerraBrickPool.stairs(LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
        LIBTerraBrickPool.slab(LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
        LIBTerraBrickPool.wall(LIGHT_BLUE_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool LIGTerraBrickPool =  blockStateModelGenerator.registerCubeAllModelTexturePool(LIGHT_GRAY_TERRACOTTA_BRICK);
        LIGTerraBrickPool.stairs(LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
        LIGTerraBrickPool.slab(LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
        LIGTerraBrickPool.wall(LIGHT_GRAY_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool LIMTerraBrickPool =    blockStateModelGenerator.registerCubeAllModelTexturePool(LIME_TERRACOTTA_BRICK);
        LIMTerraBrickPool.stairs(LIME_TERRACOTTA_BRICK_STAIRS);
        LIMTerraBrickPool.slab(LIME_TERRACOTTA_BRICK_SLAB);
        LIMTerraBrickPool.wall(LIME_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool MAGTerraBrickPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(MAGENTA_TERRACOTTA_BRICK);
        MAGTerraBrickPool.stairs(MAGENTA_TERRACOTTA_BRICK_STAIRS);
        MAGTerraBrickPool.slab(MAGENTA_TERRACOTTA_BRICK_SLAB);
        MAGTerraBrickPool.wall(MAGENTA_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool ORTerraBrickPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(ORANGE_TERRACOTTA_BRICK);
        ORTerraBrickPool.stairs(ORANGE_TERRACOTTA_BRICK_STAIRS);
        ORTerraBrickPool.slab(ORANGE_TERRACOTTA_BRICK_SLAB);
        ORTerraBrickPool.wall(ORANGE_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool PITerraBrickPool =  blockStateModelGenerator.registerCubeAllModelTexturePool(PINK_TERRACOTTA_BRICK);
        PITerraBrickPool.stairs(PINK_TERRACOTTA_BRICK_STAIRS);
        PITerraBrickPool.slab(PINK_TERRACOTTA_BRICK_SLAB);
        PITerraBrickPool.wall(PINK_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool PUTerraBrickPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(PURPLE_TERRACOTTA_BRICK);
        PUTerraBrickPool.stairs(PURPLE_TERRACOTTA_BRICK_STAIRS);
        PUTerraBrickPool.slab(PURPLE_TERRACOTTA_BRICK_SLAB);
        PUTerraBrickPool.wall(PURPLE_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool RETerraBrickPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(RED_TERRACOTTA_BRICK);
        RETerraBrickPool.stairs(RED_TERRACOTTA_BRICK_STAIRS);
        RETerraBrickPool.slab(RED_TERRACOTTA_BRICK_SLAB);
        RETerraBrickPool.wall(RED_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool TerraBrickPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(TERRACOTTA_BRICK);
        TerraBrickPool.stairs(TERRACOTTA_BRICK_STAIRS);
        TerraBrickPool.slab(TERRACOTTA_BRICK_SLAB);
        TerraBrickPool.wall(TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool WHITerraBrickPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(WHITE_TERRACOTTA_BRICK);
        WHITerraBrickPool.stairs(WHITE_TERRACOTTA_BRICK_STAIRS);
        WHITerraBrickPool.slab(WHITE_TERRACOTTA_BRICK_SLAB);
        WHITerraBrickPool.wall(WHITE_TERRACOTTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool YETerraBrickPool =   blockStateModelGenerator.registerCubeAllModelTexturePool(YELLOW_TERRACOTTA_BRICK);
        YETerraBrickPool.stairs(YELLOW_TERRACOTTA_BRICK_STAIRS);
        YETerraBrickPool.slab(YELLOW_TERRACOTTA_BRICK_SLAB);
        YETerraBrickPool.wall(YELLOW_TERRACOTTA_BRICK_WALL);


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


        BlockStateModelGenerator.BlockTexturePool cobblelightdreadBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(LIGHT_COBBLED_DREADSTONE);

        cobblelightdreadBrickPool.stairs(LIGHT_COBBLED_DREADSTONE_STAIRS);
        cobblelightdreadBrickPool.slab(LIGHT_COBBLED_DREADSTONE_SLAB);
        cobblelightdreadBrickPool.wall(LIGHT_COBBLED_DREADSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool bloodylightdreadBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BLOODY_LIGHT_DREADSTONE);

        bloodylightdreadBrickPool.stairs(BLOODY_LIGHT_DREADSTONE_STAIRS);
        bloodylightdreadBrickPool.slab(BLOODY_LIGHT_DREADSTONE_SLAB);
        bloodylightdreadBrickPool.wall(BLOODY_LIGHT_DREADSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool bloodylightbrickdreadBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BLOODY_LIGHT_DREADSTONE_BRICKS);

        bloodylightbrickdreadBrickPool.stairs(BLOODY_LIGHT_DREADSTONE_BRICKS_STAIRS);
        bloodylightbrickdreadBrickPool.slab(BLOODY_LIGHT_DREADSTONE_BRICKS_SLAB);
        bloodylightbrickdreadBrickPool.wall(BLOODY_LIGHT_DREADSTONE_BRICKS_WALL);


        BlockStateModelGenerator.BlockTexturePool polishedLdreadsBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_LIGHT_DREADSTONE);

        polishedLdreadsBrickPool.stairs(POLISHED_LIGHT_DREADSTONE_STAIRS);
        polishedLdreadsBrickPool.slab(POLISHED_LIGHT_DREADSTONE_SLAB);
        polishedLdreadsBrickPool.wall(POLISHED_LIGHT_DREADSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool rivetdreadsBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(RIVETED_LIGHT_DREADSTONE);

        rivetdreadsBrickPool.stairs(RIVETED_LIGHT_DREADSTONE_STAIRS);
        rivetdreadsBrickPool.slab(RIVETED_LIGHT_DREADSTONE_SLAB);
        rivetdreadsBrickPool.wall(RIVETED_LIGHT_DREADSTONE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(TILED_LIGHT_DREADSTONE);
        blockStateModelGenerator.registerDoor(LIGHT_DREADSTONE_DOOR);
        blockStateModelGenerator.registerTrapdoor(LIGHT_DREADSTONE_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool cdreadBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(COBBLED_DREADSTONE);

        cdreadBrickPool.stairs(COBBLED_DREADSTONE_STAIRS);
        cdreadBrickPool.slab(COBBLED_DREADSTONE_SLAB);
        cdreadBrickPool.wall(COBBLED_DREADSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool tcdreadBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TILED_COBBLED_DREADSTONE);

        tcdreadBrickPool.stairs(TILED_COBBLED_DREADSTONE_STAIRS);
        tcdreadBrickPool.slab(TILED_COBBLED_DREADSTONE_SLAB);
        tcdreadBrickPool.wall(TILED_COBBLED_DREADSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool dreadBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(DREADSTONE_BLOCK);

        dreadBlockPool.stairs(DREADSTONE_BLOCK_STAIRS);
        dreadBlockPool.slab(DREADSTONE_BLOCK_SLAB);
        dreadBlockPool.wall(DREADSTONE_BLOCK_WALL);


        registerRedstoneActivatedLamp(DREADSTONE_LAMP, blockStateModelGenerator);
        blockStateModelGenerator.registerSimpleCubeAll(DREADSTONE_GRATE);
        registerBars(DREADSTONE_BARS, blockStateModelGenerator);
        blockStateModelGenerator.registerSimpleCubeAll(DREADSTONE_GLASS);

        BlockStateModelGenerator.BlockTexturePool dreadBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(DREADSTONE_BRICKS);

        dreadBrickPool.stairs(DREADSTONE_BRICKS_STAIRS);
        dreadBrickPool.slab(DREADSTONE_BRICKS_SLAB);
        dreadBrickPool.wall(DREADSTONE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool dreadGratedPool = blockStateModelGenerator.registerCubeAllModelTexturePool(GRATED_DREADSTONE);

        dreadGratedPool.stairs(GRATED_DREADSTONE_STAIRS);
        dreadGratedPool.slab(GRATED_DREADSTONE_SLAB);
        dreadGratedPool.wall(GRATED_DREADSTONE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(DREADSTONE_WINDOW);

        BlockStateModelGenerator.BlockTexturePool dreadPolishchisPool = blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_CHISELED_DREADSTONE);

        dreadPolishchisPool.stairs(POLISHED_CHISELED_DREADSTONE_STAIRS);
        dreadPolishchisPool.slab(POLISHED_CHISELED_DREADSTONE_SLAB);
        dreadPolishchisPool.wall(POLISHED_CHISELED_DREADSTONE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(POLISHED_DREADSTONE);
        blockStateModelGenerator.registerSingleton(DREADSTONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

        blockStateModelGenerator.registerSingleton(CHISELED_DREADSTONE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);


        blockStateModelGenerator.registerDoor(DREADSTONE_DOOR);
        blockStateModelGenerator.registerTrapdoor(DREADSTONE_TRAPDOOR);
        blockStateModelGenerator.registerDoor(LOCKED_DREADSTONE_DOOR);


        BlockStateModelGenerator.BlockTexturePool marbledfPool = blockStateModelGenerator.registerCubeAllModelTexturePool(MARBLED_FLESH);

        marbledfPool.stairs(MARBLED_FLESH_STAIRS);
        marbledfPool.slab(MARBLED_FLESH_SLAB);
        marbledfPool.wall(MARBLED_FLESH_FENCE);


        BlockStateModelGenerator.BlockTexturePool scaledfPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SCALED_FLESH);

        scaledfPool.stairs(SCALED_FLESH_STAIRS);
        scaledfPool.slab(SCALED_FLESH_SLAB);
        scaledfPool.wall(SCALED_FLESH_WALL);


        blockStateModelGenerator.registerWoolAndCarpet(CRIMSON_WOOL, CRIMSON_CARPET);

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
        registerGeneratedItem(GCItems.SHADOW_CLUMP, "foods/inedibles/", itemModelGenerator);
        registerGeneratedItem(GCItems.SHADOW_TENDRIL, "loot/mob_drops/shadow/", itemModelGenerator);
        registerGeneratedItem(GCItems.SHADOW_EYE, "loot/mob_drops/shadow/", itemModelGenerator);
        registerGeneratedItem(GCItems.SHADOW_TOOTH, "loot/mob_drops/shadow/", itemModelGenerator);
        registerGeneratedItem(GCItems.ARCANE_POWDER, "loot/", itemModelGenerator);
        registerGeneratedItem(GCItems.TREE_RESIN, "loot/", itemModelGenerator);
        registerHandheldItem(GCItems.HAMMER, "util/", itemModelGenerator);
        registerHandheldItem(GCItems.CROWBAR, "util/", itemModelGenerator);
        registerHandheldItem(GCItems.SPELL_SCROLL, "util/", itemModelGenerator);
        registerPlaceableItem(GCItems.MARIAH, "placeables/", itemModelGenerator);

        registerGeneratedItem(DARK_CHERRY_SIGN.asItem(), "", itemModelGenerator);
        registerGeneratedItem(EBONY_SIGN.asItem(), "", itemModelGenerator);

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

        GCItems.COOKIE_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/desserts/cookies/", itemModelGenerator);
        });

        GCItems.CANDY_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/desserts/candy/", itemModelGenerator);
        });

        GCItems.DRINK_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/drinks/", itemModelGenerator);
        });

        GCItems.FRUIT_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/fruit/", itemModelGenerator);
        });

        GCItems.COOKED_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/cooked/", itemModelGenerator);
        });

        GCItems.PIE_SET.forEach(item -> {
            registerGeneratedItem(item, "foods/desserts/pie/", itemModelGenerator);
        });

        GCItems.POUCH_SET.forEach(item -> {
            registerGeneratedItem(item, "pouches/", itemModelGenerator);
        });

        GCItems.EVO_SET.forEach(item -> {
            registerGeneratedItem(item, "evo_stones/", itemModelGenerator);
        });

        GCItems.SPOOL_SET.forEach(item -> {
            registerGeneratedItem(item, "tradeskill/spools/", itemModelGenerator);
        });

        GCItems.BAR_SET.forEach(item -> {
            registerGeneratedItem(item, "tradeskill/ores-bars/", itemModelGenerator);
        });

        GCItems.FISHING_SET.forEach(item -> {
            registerGeneratedItem(item, "tradeskill/fishing/", itemModelGenerator);
        });

        GCItems.WOODCARVE_SET.forEach(item -> {
            registerGeneratedItem(item, "tradeskill/woodcarve/", itemModelGenerator);
        });

        GCItems.MISC_SET.forEach(item -> {
            registerGeneratedItem(item, "unsorted/", itemModelGenerator);
        });

        GCItems.FLAG_SET.forEach(item -> {
            registerPlaceableItem(item, "placeables/flags/", itemModelGenerator);
        });

        GCItems.PUMPKIN_SET.forEach(item -> {
            registerTileItem(item, "placeables/decorations/pumpkins/", itemModelGenerator);
        });

        GCItems.GEMSTONE_SET.forEach(item -> {
            registerTileItem(item, "loot/gemstones/", itemModelGenerator);
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

    public static void registerRedstoneActivatedLamp(Block block, BlockStateModelGenerator generator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(block, generator.modelCollector);
        Identifier identifier2 = generator.createSubModel(block, "_on", Models.CUBE_ALL, TextureMap::all);
        generator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block)
                        .coordinate(
                                BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)
                        )
        );
    }

    public static void registerBars(Block block, BlockStateModelGenerator generator) {
        Identifier id_post_ends = ModelIds.getBlockSubModelId(block, "_post_ends");
        Identifier id_post = ModelIds.getBlockSubModelId(block, "_post");
        Identifier id_cap = ModelIds.getBlockSubModelId(block, "_cap");
        Identifier id_cap_alt = ModelIds.getBlockSubModelId(block, "_cap_alt");
        Identifier id_side = ModelIds.getBlockSubModelId(block, "_side");
        Identifier id_side_alt = ModelIds.getBlockSubModelId(block, "_side_alt");

        TextureKey bars = TextureKey.of("bars");

        TextureMap barsMap = new TextureMap()
                .put(TextureKey.PARTICLE, Registries.BLOCK.getId(block).withPrefixedPath("block/"))
                .put(bars, Registries.BLOCK.getId(block).withPrefixedPath("block/"));


        TextureMap barsAndEdgeMap = barsMap.copyAndAdd(TextureKey.EDGE, Registries.BLOCK.getId(block).withPrefixedPath("block/"));

        Model cap = new Model(Optional.of(Identifier.of("block/iron_bars_cap")), Optional.empty(), TextureKey.PARTICLE, bars, TextureKey.EDGE);
        Model cap_alt = new Model(Optional.of(Identifier.of("block/iron_bars_cap_alt")), Optional.empty(), TextureKey.PARTICLE, bars, TextureKey.EDGE);
        Model side = new Model(Optional.of(Identifier.of("block/iron_bars_side")), Optional.empty(), TextureKey.PARTICLE, bars, TextureKey.EDGE);
        Model side_alt = new Model(Optional.of(Identifier.of("block/iron_bars_side_alt")), Optional.empty(), TextureKey.PARTICLE, bars, TextureKey.EDGE);
        Model post = new Model(Optional.of(Identifier.of("block/iron_bars_post")), Optional.empty(), TextureKey.PARTICLE, bars);
        Model post_ends = new Model(Optional.of(Identifier.of("block/iron_bars_post_ends")), Optional.empty(), TextureKey.PARTICLE, TextureKey.EDGE);

        cap.upload(id_cap, barsAndEdgeMap, generator.modelCollector);
        cap_alt.upload(id_cap_alt, barsAndEdgeMap, generator.modelCollector);
        side.upload(id_side, barsAndEdgeMap, generator.modelCollector);
        side_alt.upload(id_side_alt, barsAndEdgeMap, generator.modelCollector);
        post.upload(id_post, barsMap, generator.modelCollector);
        post_ends.upload(id_post_ends, barsAndEdgeMap, generator.modelCollector);

        generator.blockStateCollector
                .accept(
                        MultipartBlockStateSupplier.create(block)
                                .with(BlockStateVariant.create().put(VariantSettings.MODEL, id_post_ends))
                                .with(
                                        When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, id_post)
                                )
                                .with(
                                        When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, id_cap)
                                )
                                .with(
                                        When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, id_cap).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                )
                                .with(
                                        When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, id_cap_alt)
                                )
                                .with(
                                        When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, id_cap_alt).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                )
                                .with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, id_side))
                                .with(
                                        When.create().set(Properties.EAST, true),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, id_side).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                )
                                .with(When.create().set(Properties.SOUTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, id_side_alt))
                                .with(
                                        When.create().set(Properties.WEST, true),
                                        BlockStateVariant.create().put(VariantSettings.MODEL, id_side_alt).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                )
                );
        generator.registerItemModel(block);
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
