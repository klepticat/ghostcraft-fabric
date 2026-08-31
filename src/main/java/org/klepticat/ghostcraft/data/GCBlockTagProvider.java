package org.klepticat.ghostcraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.klepticat.ghostcraft.GCBlocks;
import org.klepticat.ghostcraft.block.BlockType;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static org.klepticat.ghostcraft.GCBlocks.*;

public class GCBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public GCBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        List<Block> fences = BLOCK_SETS.stream().map(blockSet -> blockSet.get(BlockType.FENCE)).toList();
        List<Block> buttons = BLOCK_SETS.stream().map(blockSet -> blockSet.get(BlockType.FENCE)).toList();
        List<Block> doors = BLOCK_SETS.stream().map(blockSet -> blockSet.get(BlockType.FENCE)).toList();
        List<Block> stairs = BLOCK_SETS.stream().map(blockSet -> blockSet.get(BlockType.FENCE)).toList();
        List<Block> plates = BLOCK_SETS.stream().map(blockSet -> blockSet.get(BlockType.FENCE)).toList();
        List<Block> slabs = BLOCK_SETS.stream().map(blockSet -> blockSet.get(BlockType.FENCE)).toList();
        List<Block> trapdoors = BLOCK_SETS.stream().map(blockSet -> blockSet.get(BlockType.FENCE)).toList();

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(fences.toArray(new Block[0]))
                .add(NETHERRACK_FENCE);



        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(fences.toArray(new Block[0]));

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(buttons.toArray(new Block[0]));

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(doors.toArray(new Block[0]));

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(stairs.toArray(new Block[0]));

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(plates.toArray(new Block[0]));

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(slabs.toArray(new Block[0]));

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(trapdoors.toArray(new Block[0]));

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(GCBlocks.BROWN_GRANITE_STAIRS, GCBlocks.POLISHED_BROWN_GRANITE_STAIRS, GCBlocks.SLATE_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(GCBlocks.BROWN_GRANITE_SLAB, GCBlocks.POLISHED_BROWN_GRANITE_SLAB, GCBlocks.SLATE_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(
                        GCBlocks.BROWN_GRANITE_WALL,
                        GCBlocks.POLISHED_BROWN_GRANITE_WALL,
                        GCBlocks.SLATE_WALL,
                        GCBlocks.COBBLED_SCULK_STONE_WALL,
                        GCBlocks.POLISHED_SCULK_STONE_WALL,
                        GCBlocks.SCULK_STONE_WALL,
                        GCBlocks.SCULK_STONE_BRICKS_WALL,
                        GCBlocks.SMOOTH_SCULK_STONE_WALL,
                        GCBlocks.BLUE_NETHERRACK_WALL,
                        GCBlocks.DRIPSTONE_WALL,
                        GCBlocks.TEMPLE_BRICKS_WALL,
                        GCBlocks.LIGHT_COBBLED_DREADSTONE_WALL,
                        GCBlocks.BLOODY_LIGHT_DREADSTONE_BRICKS_WALL,
                        GCBlocks.BLOODY_LIGHT_DREADSTONE_WALL,
                        GCBlocks.RIVETED_LIGHT_DREADSTONE_WALL,
                        GCBlocks.COBBLED_DREADSTONE_WALL,
                        GCBlocks.DREADSTONE_BLOCK_WALL,
                        GCBlocks.GRATED_DREADSTONE_WALL,
                        GCBlocks.POLISHED_CHISELED_DREADSTONE_WALL,
                        GCBlocks.POLISHED_LIGHT_DREADSTONE_WALL,
                        GCBlocks.SCALED_FLESH_WALL,
                        GCBlocks.MARBLED_FLESH_FENCE,
                        GCBlocks.TILED_COBBLED_DREADSTONE_WALL,
                        GCBlocks.NETHERRACK_WALL,
                        GCBlocks.SMOOTH_BASALT_WALL,
                        GCBlocks.AMETHYST_WALL,
                        GCBlocks.BLACK_TERRACOTTA_BRICK_WALL,
                        GCBlocks.BLUE_TERRACOTTA_BRICK_WALL,
                        GCBlocks.BROWN_TERRACOTTA_BRICK_WALL,
                        GCBlocks.CYAN_TERRACOTTA_BRICK_WALL,
                        GCBlocks.GRAY_TERRACOTTA_BRICK_WALL,
                        GCBlocks.GREEN_TERRACOTTA_BRICK_WALL,
                        GCBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL,
                        GCBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL,
                        GCBlocks.LIME_TERRACOTTA_BRICK_WALL,
                        GCBlocks.MAGENTA_TERRACOTTA_BRICK_WALL,
                        GCBlocks.ORANGE_TERRACOTTA_BRICK_WALL,
                        GCBlocks.PINK_TERRACOTTA_BRICK_WALL,
                        GCBlocks.RED_TERRACOTTA_BRICK_WALL,
                        GCBlocks.TERRACOTTA_BRICK_WALL,
                        GCBlocks.WHITE_TERRACOTTA_BRICK_WALL,
                        GCBlocks.PURPLE_TERRACOTTA_BRICK_WALL,
                        GCBlocks.SMARAGDANT_CRYSTAL_BRICKS_WALL,
                        GCBlocks.SMARAGDANT_CRYSTAL_TILES_WALL,
                        GCBlocks.POLISHED_SMARAGDANT_CRYSTAL_WALL,
                        GCBlocks.SOUL_QUARTZ_BLOCK_WALL,
                        GCBlocks.SOUL_QUARTZ_BRICKS_WALL,
                        GCBlocks.CRACKED_SOUL_QUARTZ_BRICKS_WALL,
                        GCBlocks.LAPIS_BRICKS_WALL,
                        GCBlocks.LAPIS_TILES_WALL,
                        GCBlocks.SMOOTH_LAPIS_BLOCK_WALL,
                        GCBlocks.GILDED_FANCY_LAPIS_WALL,
                        GCBlocks.GILDED_LAPIS_BLOCK_WALL,
                        GCBlocks.GILDED_LAPIS_BRICKS_WALL,
                        GCBlocks.GILDED_LAPIS_TILES_WALL,


                        TANGLEWOOD_SET.get(BlockType.WALL),
                        BLUE_ENCHANTED_SET.get(BlockType.WALL),
                        LAMENT_SET.get(BlockType.WALL),
                        SKYRIS_SET.get(BlockType.WALL)
                );
    }
}
