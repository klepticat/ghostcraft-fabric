package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.entity.ChickenEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class PumkenEntityRenderer extends ChickenEntityRenderer {
    private static final Identifier TEXTURE = Identifier.of(MOD_ID, "textures/entity/pumken.png");

    public PumkenEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ChickenEntity chickenEntity) {
        return TEXTURE;
    }
}
