package org.klepticat.ghostcraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;

import static org.klepticat.ghostcraft.GCBlocks.*;

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
        blockStateModelGenerator.registerSimpleCubeAll(BLUE_NETHERRACK);
        blockStateModelGenerator.registerSimpleCubeAll(CANDY_CANE);
        blockStateModelGenerator.registerSimpleCubeAll(CHOGGY_BLOGGY);
        blockStateModelGenerator.registerSimpleCubeAll(ENCHANTED_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(END_MOSS);
        blockStateModelGenerator.registerSimpleCubeAll(NOISE);
        blockStateModelGenerator.registerSimpleCubeAll(TEMPLE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(VOID);


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


        BlockStateModelGenerator.BlockTexturePool ebonyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(EBONY_PLANKS);

        blockStateModelGenerator.registerLog(EBONY_LOG).log(EBONY_LOG).wood(EBONY_WOOD);
        blockStateModelGenerator.registerLog(STRIPPED_EBONY_LOG).log(STRIPPED_EBONY_LOG).wood(STRIPPED_EBONY_WOOD);

        blockStateModelGenerator.registerDoor(EBONY_DOOR);
        blockStateModelGenerator.registerTrapdoor(EBONY_TRAPDOOR);

        blockStateModelGenerator.registerHangingSign(EBONY_LOG, EBONY_HANGING_SIGN, EBONY_WALL_HANGING_SIGN);

        ebonyPool.stairs(EBONY_STAIRS);
        ebonyPool.slab(EBONY_SLAB);

        ebonyPool.button(EBONY_BUTTON);
        ebonyPool.pressurePlate(EBONY_PRESSURE_PLATE);

        ebonyPool.fence(EBONY_FENCE);
        ebonyPool.fenceGate(EBONY_FENCE_GATE);

        //ebonyPool.sign(EBONY_SIGN);


        BlockStateModelGenerator.BlockTexturePool darkCherryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_CHERRY_PLANKS);

        blockStateModelGenerator.registerDoor(DARK_CHERRY_DOOR);
        blockStateModelGenerator.registerTrapdoor(DARK_CHERRY_TRAPDOOR);

        blockStateModelGenerator.registerLog(DARK_CHERRY_LOG).log(DARK_CHERRY_LOG).wood(DARK_CHERRY_WOOD);
        blockStateModelGenerator.registerLog(STRIPPED_DARK_CHERRY_LOG).log(STRIPPED_DARK_CHERRY_LOG).wood(STRIPPED_DARK_CHERRY_WOOD);

        blockStateModelGenerator.registerHangingSign(STRIPPED_DARK_CHERRY_LOG, DARK_CHERRY_HANGING_SIGN, DARK_CHERRY_WALL_HANGING_SIGN);

        darkCherryPool.stairs(DARK_CHERRY_STAIRS);
        darkCherryPool.slab(DARK_CHERRY_SLAB);

        darkCherryPool.button(DARK_CHERRY_BUTTON);
        darkCherryPool.pressurePlate(DARK_CHERRY_PRESSURE_PLATE);

        darkCherryPool.fence(DARK_CHERRY_FENCE);
        darkCherryPool.fenceGate(DARK_CHERRY_FENCE_GATE);


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

        BlockStateModelGenerator.BlockTexturePool smoothSculkPool = blockStateModelGenerator.regi(SMOOTH_SCULK_STONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

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
}
