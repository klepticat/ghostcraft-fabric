package org.klepticat.ghostcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.world.World;

public class SkyWehEntity extends BatEntity {
    public SkyWehEntity(EntityType<? extends BatEntity> entityType, World world) {
        super(entityType, world);
    }
}
