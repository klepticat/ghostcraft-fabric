package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.entity.CamelEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.passive.CamelEntity;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class TransportwehtionEntityRenderer extends CamelEntityRenderer {
    public final Identifier TEXTURE = Identifier.of(MOD_ID, "textures/entity/transportwehtion.png");

    public TransportwehtionEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer) {
        super(ctx, layer);
    }

    @Override
    public Identifier getTexture(CamelEntity camelEntity) {
        return TEXTURE;
    }
}
