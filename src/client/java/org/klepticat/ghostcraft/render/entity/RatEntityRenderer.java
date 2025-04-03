package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.klepticat.ghostcraft.entity.RatEntity;
import org.klepticat.ghostcraft.render.entity.model.RatEntityModel;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;
import static org.klepticat.ghostcraft.render.entity.model.RatEntityModel.modelLayer;

public class RatEntityRenderer extends MobEntityRenderer<RatEntity, RatEntityModel<RatEntity>> {
    public RatEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new RatEntityModel<>(context.getPart(modelLayer)), 0.3f);
    }

    public Identifier getTexture(RatEntity ratEntity) {
        Identifier id;

        switch (ratEntity.getComponent(GCCardinalComponents.RAT_VARIANT).getVariant()) {
            case GRAY -> id = Identifier.of(MOD_ID, "textures/entity/rat/gray.png");
            case LIGHT_BROWN -> id = Identifier.of(MOD_ID, "textures/entity/rat/light_brown.png");
            case BLACK -> id = Identifier.of(MOD_ID, "textures/entity/rat/black.png");
            default ->
                    throw new IllegalStateException("Unexpected value: " + ratEntity.getComponent(GCCardinalComponents.EYE_BAT_VARIANT).getVariant());
        }
        return id;
    }
}
