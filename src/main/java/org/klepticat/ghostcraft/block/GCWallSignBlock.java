package org.klepticat.ghostcraft.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.klepticat.ghostcraft.block.entity.GCSignBlockEntity;

public class GCWallSignBlock extends WallSignBlock {
    public GCWallSignBlock(WoodType woodType, Settings settings) {
        super(woodType, settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GCSignBlockEntity(pos, state);
    }
}
