package org.klepticat.ghostcraft;

import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.entity.SpellProjectileEntity;
import org.klepticat.ghostcraft.entity.TotemEntity;
import org.klepticat.ghostcraft.util.cardinalcomponent.MagicTypeTracker;
import org.klepticat.ghostcraft.util.cardinalcomponent.TotemRadiusTracker;
import org.klepticat.ghostcraft.util.cardinalcomponent.TotemTracker;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class AllCardinalComponents implements EntityComponentInitializer {
    public static final ComponentKey<TotemTracker> TOTEM_TRACKER = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_tracker"), TotemTracker.class);
    public static final ComponentKey<MagicTypeTracker> MAGIC_TYPE_TRACKER = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "magic_type_tracker"), MagicTypeTracker.class);
    public static final ComponentKey<TotemRadiusTracker> TOTEM_RADIUS_TRACKER = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_radius_tracker"), TotemRadiusTracker.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(TOTEM_TRACKER, playerEntity -> new TotemTracker(), RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerFor(SpellProjectileEntity.class, MAGIC_TYPE_TRACKER, spellProjectileEntity -> new MagicTypeTracker(spellProjectileEntity));
        registry.registerFor(TotemEntity.class, TOTEM_RADIUS_TRACKER, totemEntity -> new TotemRadiusTracker(totemEntity));
    }
}
