package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.klepticat.ghostcraft.entity.*;
import org.klepticat.ghostcraft.entity.stickers.StickerEntity;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCEntityTypes {
    public static EntityType<SpellProjectileEntity> SPELL_PROJECTILE = register(
            "spell_projectile",
            EntityType.Builder.<SpellProjectileEntity>create(SpellProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f)
    );
    public static EntityType<TotemEntity> TOTEM = register(
            "totem",
            EntityType.Builder.<TotemEntity>create(TotemEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.975f)
    );
    public static EntityType<StickerEntity> STICKER = register(
            "sticker",
            EntityType.Builder.<StickerEntity>create(StickerEntity::new, SpawnGroup.MISC)
                    .dimensions(1.0f, 1.0f)
                    .eyeHeight(0.5f)
                    .maxTrackingRange(10)
    );

    public static EntityType<EyeBatEntity> EYE_BAT = register(
            "eye_bat",
            EntityType.Builder.create(EyeBatEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.35F, 0.6F)
                    .eyeHeight(0.36F)
                    .vehicleAttachment(0.04F)
                    .maxTrackingRange(8)
                    .trackingTickInterval(2)
    );
    public static final EntityType<SkyWehEntity> SKY_WEH = register(
            "sky_weh", EntityType.Builder.create(SkyWehEntity::new, SpawnGroup.AMBIENT).dimensions(0.5F, 0.9F).eyeHeight(0.45F).maxTrackingRange(5)
    );
    public static final EntityType<WehzeEntity> WEHZE = register(
            "wehze", EntityType.Builder.create(WehzeEntity::new, SpawnGroup.MONSTER).makeFireImmune().dimensions(0.6F, 1.8F).maxTrackingRange(8)
    );
    public static final EntityType<PumkenEntity> PUMKEN = register(
            "pumken",
            EntityType.Builder.create(PumkenEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.4F, 0.7F)
                    .eyeHeight(0.644F)
                    .passengerAttachments(new Vec3d(0.0, 0.7, -0.1))
                    .maxTrackingRange(10)
    );
    public static final EntityType<RatEntity> RAT = register(
            "rat",
            EntityType.Builder.create(RatEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.4F, 0.3F)
                    .eyeHeight(0.13F)
                    .passengerAttachments(0.2375F)
                    .maxTrackingRange(8)
    );
    public static final EntityType<LavaRatEntity> LAVA_RAT = register(
            "lava_rat",
            EntityType.Builder.create(LavaRatEntity::new, SpawnGroup.MONSTER)
                    .dimensions(0.4F, 0.3F)
                    .eyeHeight(0.13F)
                    .passengerAttachments(0.2375F)
                    .maxTrackingRange(8)
                    .makeFireImmune()
    );
    public static final EntityType<WeehEntity> WEEH = register(
            "weeh", EntityType.Builder.create(WeehEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.7F, 0.6F)
                    .eyeHeight(0.3F)
                    .maxTrackingRange(8)
    );
    public static final EntityType<TransportwehtionEntity> TRANSPORTWEHTION = register(
            "transportwehtion", EntityType.Builder.create(TransportwehtionEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1.7F, 2.375F)
                    .eyeHeight(2.275F)
                    .maxTrackingRange(10)
    );

    public static void initialize() {
        FabricDefaultAttributeRegistry.register(EYE_BAT, EyeBatEntity.createAllayAttributes());
        FabricDefaultAttributeRegistry.register(SKY_WEH, SkyWehEntity.createBatAttributes());
        FabricDefaultAttributeRegistry.register(WEHZE, WehzeEntity.createBlazeAttributes());
        FabricDefaultAttributeRegistry.register(PUMKEN, PumkenEntity.createChickenAttributes());
        FabricDefaultAttributeRegistry.register(RAT, RatEntity.createSilverfishAttributes());
        FabricDefaultAttributeRegistry.register(LAVA_RAT, LavaRatEntity.createSilverfishAttributes());
        FabricDefaultAttributeRegistry.register(WEEH, WeehEntity.createBeeAttributes());
        FabricDefaultAttributeRegistry.register(TRANSPORTWEHTION, TransportwehtionEntity.createCamelAttributes());
    }

    public static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
        Identifier modEntityId = Identifier.of(MOD_ID, id);

        EntityType<T> entityType = builder.build(id);

        return Registry.register(Registries.ENTITY_TYPE, modEntityId, entityType);
    }
}
