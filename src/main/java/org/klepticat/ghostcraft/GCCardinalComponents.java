package org.klepticat.ghostcraft;

import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.entity.EyeBatEntity;
import org.klepticat.ghostcraft.entity.RatEntity;
import org.klepticat.ghostcraft.entity.SpellProjectileEntity;
import org.klepticat.ghostcraft.entity.TotemEntity;
import org.klepticat.ghostcraft.util.cardinalcomponent.*;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCCardinalComponents implements EntityComponentInitializer {
    public static final ComponentKey<PlayerSticker> PLAYER_STICKER = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "player_sticker"), PlayerSticker.class);
    public static final ComponentKey<PlayerTotem> PLAYER_TOTEM = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "player_totem"), PlayerTotem.class);
    public static final ComponentKey<MagicTypeTracker> MAGIC_TYPE_TRACKER = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "magic_type_tracker"), MagicTypeTracker.class);
    //public static final ComponentKey<TotemRadius> TOTEM_RADIUS = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_radius"), TotemRadius.class);
    //public static final ComponentKey<TotemUptime> TOTEM_UPTIME = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_uptime"), TotemUptime.class);
    //public static final ComponentKey<TotemStatusEffect> TOTEM_STATUS_EFFECT = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_status_effect"), TotemStatusEffect.class);
    public static final ComponentKey<PlayerSouls> PLAYER_SOULS = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "player_souls"), PlayerSouls.class);
    public static final ComponentKey<PlayerMaxSouls> PLAYER_MAX_SOULS = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "player_max_souls"), PlayerMaxSouls.class);
    public static final ComponentKey<EyeBatVariantComponent> EYE_BAT_VARIANT = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "eye_bat_variant"), EyeBatVariantComponent.class);
    public static final ComponentKey<RatVariantComponent> RAT_VARIANT = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "rat_variant"), RatVariantComponent.class);
    public static final ComponentKey<TotemDataComponent> TOTEM_DATA = ComponentRegistry.getOrCreate(Identifier.of(MOD_ID, "totem_data"), TotemDataComponent.class);

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(PLAYER_STICKER, playerEntity -> new PlayerSticker(), RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerForPlayers(PLAYER_TOTEM, playerEntity -> new PlayerTotem(), RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerForPlayers(PLAYER_SOULS, PlayerSouls::new, RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerForPlayers(PLAYER_MAX_SOULS, PlayerMaxSouls::new, RespawnCopyStrategy.ALWAYS_COPY);
        registry.registerFor(SpellProjectileEntity.class, MAGIC_TYPE_TRACKER, MagicTypeTracker::new);
        //registry.registerFor(TotemEntity.class, TOTEM_RADIUS, TotemRadius::new);
        //registry.registerFor(TotemEntity.class, TOTEM_UPTIME, totemEntity -> new TotemUptime());
        //registry.registerFor(TotemEntity.class, TOTEM_STATUS_EFFECT, TotemStatusEffect::new);
        registry.registerFor(TotemEntity.class, TOTEM_DATA, TotemDataComponent::new);
        registry.registerFor(EyeBatEntity.class, EYE_BAT_VARIANT, EyeBatVariantComponent::new);
        registry.registerFor(RatEntity.class, RAT_VARIANT, RatVariantComponent::new);
    }
}
