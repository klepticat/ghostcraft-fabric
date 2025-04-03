package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.entity.LavaRatEntity;
import org.klepticat.ghostcraft.render.entity.model.RatEntityModel;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;
import static org.klepticat.ghostcraft.render.entity.model.RatEntityModel.modelLayer;

public class LavaRatEntityRenderer extends MobEntityRenderer<LavaRatEntity, RatEntityModel<LavaRatEntity>> {
    public final Identifier TEXTURE = Identifier.of(MOD_ID, "textures/entity/lava_rat.png");

    public LavaRatEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new RatEntityModel<>(context.getPart(modelLayer)), 0.3f);
    }

    public Identifier getTexture(LavaRatEntity lavaRatEntity) {
        return TEXTURE;
    }
}
