package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.entity.BatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class SkyWehEntityRenderer extends BatEntityRenderer {
    private static final Identifier TEXTURE = Identifier.of(MOD_ID, "textures/entity/sky_weh.png");

    public SkyWehEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(BatEntity batEntity) {
        return TEXTURE;
    }
}
