package org.klepticat.ghostcraft.render;

import net.minecraft.client.render.entity.BeeEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.entity.WeehEntity;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class WeehEntityRenderer extends BeeEntityRenderer {
    private static final Identifier ANGRY_TEXTURE = Identifier.of(MOD_ID, "textures/entity/weeh/angry.png");
    private static final Identifier ANGRY_NECTAR_TEXTURE = Identifier.of(MOD_ID, "textures/entity/weeh/angry_nectar.png");
    private static final Identifier PASSIVE_TEXTURE = Identifier.of(MOD_ID, "textures/entity/weeh/passive.png");
    private static final Identifier NECTAR_TEXTURE = Identifier.of(MOD_ID, "textures/entity/weeh/nectar.png");

    public WeehEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(BeeEntity beeEntity) {
        WeehEntity weehEntity = ((WeehEntity) beeEntity);

        if (weehEntity.hasAngerTime()) {
            return weehEntity.hasNectar() ? ANGRY_NECTAR_TEXTURE : ANGRY_TEXTURE;
        } else {
            return weehEntity.hasNectar() ? NECTAR_TEXTURE : PASSIVE_TEXTURE;
        }
    }

}
