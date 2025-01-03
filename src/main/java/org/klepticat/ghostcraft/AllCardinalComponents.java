package org.klepticat.ghostcraft;

import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.entity.SpellProjectileEntity;
import org.klepticat.ghostcraft.entity.TotemEntity;
import org.klepticat.ghostcraft.util.cardinalcomponent.*;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class AllCardinalComponents implements EntityComponentInitializer {
    public static final ComponentKey<PlayerTotem> PLAYER_TOTEM = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "player_totem"), PlayerTotem.class);
    public static final ComponentKey<MagicTypeTracker> MAGIC_TYPE_TRACKER = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "magic_type_tracker"), MagicTypeTracker.class);
    public static final ComponentKey<TotemRadius> TOTEM_RADIUS = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_radius"), TotemRadius.class);
    public static final ComponentKey<TotemUptime> TOTEM_UPTIME = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_uptime"), TotemUptime.class);
    public static final ComponentKey<TotemStatusEffect> TOTEM_STATUS_EFFECT = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_status_effect"), TotemStatusEffect.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(PLAYER_TOTEM, playerEntity -> new PlayerTotem(), RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerFor(SpellProjectileEntity.class, MAGIC_TYPE_TRACKER, spellProjectileEntity -> new MagicTypeTracker(spellProjectileEntity));
        registry.registerFor(TotemEntity.class, TOTEM_RADIUS, totemEntity -> new TotemRadius(totemEntity));
        registry.registerFor(TotemEntity.class, TOTEM_UPTIME, totemEntity -> new TotemUptime());
        registry.registerFor(TotemEntity.class, TOTEM_STATUS_EFFECT, totemEntity -> new TotemStatusEffect(totemEntity));
    }
}
