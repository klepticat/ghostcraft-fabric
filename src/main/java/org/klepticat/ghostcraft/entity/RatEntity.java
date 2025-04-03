package org.klepticat.ghostcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.world.World;
import org.klepticat.ghostcraft.GCCardinalComponents;

public class RatEntity extends SilverfishEntity {
    public RatEntity(EntityType<? extends SilverfishEntity> entityType, World world) {
        super(entityType, world);

        this.getComponent(GCCardinalComponents.RAT_VARIANT).setVariant(RatVariant.values()[random.nextInt(RatVariant.values().length)]);
    }
}
