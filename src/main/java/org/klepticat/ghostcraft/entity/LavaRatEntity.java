package org.klepticat.ghostcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.world.World;

public class LavaRatEntity extends SilverfishEntity {
    public LavaRatEntity(EntityType<? extends SilverfishEntity> entityType, World world) {
        super(entityType, world);
    }
}
