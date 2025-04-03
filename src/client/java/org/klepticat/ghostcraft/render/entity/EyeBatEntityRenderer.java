package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.entity.AllayEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.klepticat.ghostcraft.entity.EyeBatEntity;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class EyeBatEntityRenderer extends AllayEntityRenderer {
    public EyeBatEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(AllayEntity allayEntity) {
        EyeBatEntity eyeBatEntity = ((EyeBatEntity) allayEntity);

        Identifier id;

        switch (eyeBatEntity.getComponent(GCCardinalComponents.EYE_BAT_VARIANT).getVariant()) {
            case RED -> id = Identifier.of(MOD_ID, "textures/entity/eye_bat/red.png");
            case GREEN -> id = Identifier.of(MOD_ID, "textures/entity/eye_bat/green.png");
            case BLURPLE -> id = Identifier.of(MOD_ID, "textures/entity/eye_bat/blurple.png");
            case ORANGE -> id = Identifier.of(MOD_ID, "textures/entity/eye_bat/orange.png");
            default ->
                    throw new IllegalStateException("Unexpected value: " + eyeBatEntity.getComponent(GCCardinalComponents.EYE_BAT_VARIANT).getVariant());
        }
        return id;
    }
}
