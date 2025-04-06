package org.klepticat.ghostcraft.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;
import org.klepticat.ghostcraft.GCBlockEntities;

public class GCSignBlockEntity extends SignBlockEntity {
    public GCSignBlockEntity(BlockPos pos, BlockState state) {
        super(GCBlockEntities.SIGN, pos, state);
    }
}
