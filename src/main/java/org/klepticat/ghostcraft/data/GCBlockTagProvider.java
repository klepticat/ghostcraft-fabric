package org.klepticat.ghostcraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.klepticat.ghostcraft.GCBlocks;

import java.util.concurrent.CompletableFuture;

public class GCBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public GCBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(GCBlocks.DARK_CHERRY_FENCE, GCBlocks.EBONY_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(GCBlocks.DARK_CHERRY_FENCE, GCBlocks.EBONY_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(GCBlocks.DARK_CHERRY_BUTTON, GCBlocks.DARK_CHERRY_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(GCBlocks.DARK_CHERRY_DOOR, GCBlocks.EBONY_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(GCBlocks.DARK_CHERRY_STAIRS, GCBlocks.EBONY_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(GCBlocks.DARK_CHERRY_PRESSURE_PLATE, GCBlocks.EBONY_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(GCBlocks.DARK_CHERRY_SLAB, GCBlocks.EBONY_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(GCBlocks.DARK_CHERRY_TRAPDOOR, GCBlocks.EBONY_TRAPDOOR);

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
                        GCBlocks.SMOOTH_SCULK_STONE_WALL);
    }
}
