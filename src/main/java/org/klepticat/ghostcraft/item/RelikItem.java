package org.klepticat.ghostcraft.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.klepticat.ghostcraft.GCCardinalComponents;
import org.klepticat.ghostcraft.GCEntityTypes;
import org.klepticat.ghostcraft.GCSounds;
import org.klepticat.ghostcraft.entity.TotemEntity;
import org.klepticat.ghostcraft.util.types.TotemData;

import java.util.List;

import static org.klepticat.ghostcraft.GCCardinalComponents.PLAYER_TOTEM;

public class RelikItem extends Item {
    private float totemRadius = 5.0f;
    private short totemUptime = 0;
    private byte effectAmplifier = 0;
    private int cooldown = 0;
    private RegistryEntry<StatusEffect> statusEffect;
    private TotemData.TotemParticle particleEffect = TotemData.TotemParticle.makeDustParticle(1, 1, 1, 1);

    public RelikItem(Settings settings) {
        super(settings.maxCount(1));
    }

    public RelikItem(float totemRadius, short totemUptime, int cooldown, RegistryEntry<StatusEffect> statusEffect, byte effectAmplifier, Settings settings) {
        this(settings);
        this.totemRadius = totemRadius;
        this.totemUptime = totemUptime;
        this.statusEffect = statusEffect;
        this.effectAmplifier = effectAmplifier;
        this.cooldown = cooldown;
    }

    public RelikItem(float totemRadius, short totemUptime, int cooldown, TotemData.TotemParticle particleEffect, RegistryEntry<StatusEffect> statusEffect, byte effectAmplifier, Settings settings) {
        this(totemRadius, totemUptime, cooldown, statusEffect, effectAmplifier, settings);
        this.particleEffect = particleEffect;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getPlayer().getItemCooldownManager().isCoolingDown(this)) {
            return ActionResult.FAIL;
        } else if(!(context.getWorld() instanceof ServerWorld)) {
            return ActionResult.SUCCESS;
        } else {
            Entity existingTotem = ((ServerWorld) context.getWorld()).getEntity(PLAYER_TOTEM.get(context.getPlayer()).getUuid());

            World world = context.getWorld();
            ItemPlacementContext itemPlacementContext = new ItemPlacementContext(context);
            BlockPos blockPos = itemPlacementContext.getBlockPos();
            ItemStack itemStack = context.getStack();
            Vec3d vec3d = Vec3d.ofBottomCenter(blockPos);
            Box box = GCEntityTypes.TOTEM.getDimensions().getBoxAt(vec3d.getX(), vec3d.getY(), vec3d.getZ());

            List<TotemEntity> nearbyTotems = world.getEntitiesByClass(
                    TotemEntity.class,
                    Box.of(itemPlacementContext.getBlockPos().toCenterPos(), 100, 100, 100),
                    entity -> (itemPlacementContext.getBlockPos().toCenterPos().distanceTo(entity.getPos()) <= this.totemRadius + entity.getComponent(GCCardinalComponents.TOTEM_DATA).getRadius()) && entity.getOwner() != context.getPlayer()
            );

            if (world.isSpaceEmpty(null, box) && world.getOtherEntities(null, box).isEmpty() && nearbyTotems.isEmpty()) {
                if (!(existingTotem == null)) {
                    existingTotem.discard();
                }

                if (world instanceof ServerWorld serverWorld) {
                    TotemEntity totem = new TotemEntity(
                            GCEntityTypes.TOTEM,
                            this,
                            new TotemData(
                                    this.statusEffect,
                                    this.effectAmplifier,
                                    this.particleEffect,
                                    this.totemUptime,
                                    this.totemRadius
                            ),
                            context.getPlayer(),
                            serverWorld
                    );

                    if (totem == null) {
                        return ActionResult.FAIL;
                    }

                    totem.setPosition(vec3d);

                    totem.setOwner(context.getPlayer());

                    float f = MathHelper.wrapDegrees(context.getPlayerYaw() - 180.0F);
                    totem.refreshPositionAndAngles(totem.getX(), totem.getY(), totem.getZ(), f, 0.0F);
                    serverWorld.spawnEntityAndPassengers(totem);
                    world.playSound(
                            null, vec3d.x, vec3d.y, vec3d.z, GCSounds.TOTEM_PLACE, SoundCategory.PLAYERS, 4.0F, 1.0F
                    );
                    serverWorld.spawnParticles(ParticleTypes.CLOUD, vec3d.x, vec3d.y, vec3d.z, 15, 0.2, 1.0, 0.2, 0.05);
                    totem.emitGameEvent(GameEvent.ENTITY_PLACE, context.getPlayer());

                    PLAYER_TOTEM.get(context.getPlayer()).setUuid(totem.getUuid());

                    context.getPlayer().getItemCooldownManager().set(this, this.cooldown);
                }

                return ActionResult.success(world.isClient);
            } else {
                return ActionResult.FAIL;
            }
        }
    }
}
