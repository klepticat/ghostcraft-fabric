package org.klepticat.ghostcraft.render.entity.model;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class AllEntityModelLayers {
    public static EntityModelLayer RAT = register("rat");

    private static EntityModelLayer register(String layer) {
        Identifier id = Identifier.of(MOD_ID, layer);
        return new EntityModelLayer(id, layer);
    }
}
