package org.klepticat.ghostcraft;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.entity.SpellProjectileEntity;
import org.klepticat.ghostcraft.entity.TotemEntity;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class AllEntityTypes {
    public static EntityType SPELL_PROJECTILE = register("spell_projectile", SpellProjectileEntity::new, 0.1f, 0.1f);
    public static EntityType TOTEM = register("totem", TotemEntity::new, 0.5f, 1.975f);

    public static void initialize() {}

    public static EntityType register(String id, EntityType.EntityFactory entityFactory, float width, float height) {
        Identifier modEntityId = Identifier.of(MOD_ID, id);

        EntityType entityType = EntityType.Builder.create(entityFactory, SpawnGroup.MISC).dimensions(width, height).build(id);

        return Registry.register(Registries.ENTITY_TYPE, modEntityId, entityType);
    }
}
