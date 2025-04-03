package org.klepticat.ghostcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.world.World;

public class WehzeEntity extends BlazeEntity {
    public WehzeEntity(EntityType<? extends BlazeEntity> entityType, World world) {
        super(entityType, world);
    }
}
