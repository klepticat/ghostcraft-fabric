package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.entity.BlazeEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class WehzeEntityRenderer extends BlazeEntityRenderer {
    private static final Identifier TEXTURE = Identifier.of(MOD_ID, "textures/entity/wehze.png");

    public WehzeEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(BlazeEntity blazeEntity) {
        return TEXTURE;
    }
}
