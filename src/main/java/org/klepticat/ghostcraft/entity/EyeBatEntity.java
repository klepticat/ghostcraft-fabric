package org.klepticat.ghostcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.world.World;
import org.klepticat.ghostcraft.GCCardinalComponents;

public class EyeBatEntity extends AllayEntity {
    public EyeBatEntity(EntityType<? extends AllayEntity> entityType, World world) {
        super(entityType, world);

        this.getComponent(GCCardinalComponents.EYE_BAT_VARIANT).setVariant(EyeBatVariant.values()[random.nextInt(EyeBatVariant.values().length)]);
    }
}
