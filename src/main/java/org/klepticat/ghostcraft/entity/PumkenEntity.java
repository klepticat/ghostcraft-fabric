package org.klepticat.ghostcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.world.World;

public class PumkenEntity extends ChickenEntity {
    public PumkenEntity(EntityType<? extends ChickenEntity> entityType, World world) {
        super(entityType, world);
    }
}
