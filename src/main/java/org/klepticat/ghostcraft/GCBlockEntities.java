package org.klepticat.ghostcraft;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.block.entity.GCSignBlockEntity;

import java.util.Set;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCBlockEntities {
    public static final BlockEntityType<?> SIGN = register(
            "sign",
            Set.of(GCBlocks.EBONY_SIGN, GCBlocks.EBONY_WALL_SIGN),
            GCSignBlockEntity::new
    );

    public static void initialize() {
//        addSupportedBlocks(BlockEntityType.SIGN, Set.of(GCBlocks.EBONY_SIGN, GCBlocks.EBONY_WALL_SIGN));
    }

//    public static void addSupportedBlocks(BlockEntityType<?> blockEntityType, Set<Block> blocks) {
//        blocks.forEach(blockEntityType::addSupportedBlock);
//    }

    public static <T extends BlockEntity> BlockEntityType<T> register(String name, Set<Block> blocks, BlockEntityType.BlockEntityFactory<T> factory) {
        Identifier identifier = Identifier.of(MOD_ID, name);
        BlockEntityType<T> blockEntityType = BlockEntityType.Builder.create(factory, blocks.toArray(new Block[0])).build();

        return Registry.register(Registries.BLOCK_ENTITY_TYPE, identifier, blockEntityType);
    }
}
