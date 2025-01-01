package org.klepticat.ghostcraft.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.klepticat.ghostcraft.AllEntityTypes;
import org.klepticat.ghostcraft.AllSounds;
import org.klepticat.ghostcraft.entity.TotemEntity;

import java.util.function.Consumer;

import static org.klepticat.ghostcraft.AllCardinalComponents.TOTEM_TRACKER;

public class RelikItem extends Item {
    // TODO: radius buffs, different per-item type, maybe a tick method defined per item type? - method reference?
    // TODO: the radii of two totems shouldn't be able to overlap - distFromAToB > radiusA + radiusB
    // TODO: per-totem cooldowns
    // TODO: per-totem entity uptime
    public RelikItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getPlayer().getItemCooldownManager().isCoolingDown(this)) {
            return ActionResult.FAIL;
        } else if(!(context.getWorld() instanceof ServerWorld)) {
            return ActionResult.SUCCESS;
        } else {
            Entity existingTotem = ((ServerWorld) context.getWorld()).getEntity(TOTEM_TRACKER.get(context.getPlayer()).getUuid());

            World world = context.getWorld();
            ItemPlacementContext itemPlacementContext = new ItemPlacementContext(context);
            BlockPos blockPos = itemPlacementContext.getBlockPos();
            ItemStack itemStack = context.getStack();
            Vec3d vec3d = Vec3d.ofBottomCenter(blockPos);
            Box box = AllEntityTypes.TOTEM.getDimensions().getBoxAt(vec3d.getX(), vec3d.getY(), vec3d.getZ());
            if (world.isSpaceEmpty(null, box) && world.getOtherEntities(null, box).isEmpty()) {
                if(!(existingTotem == null)) {
                    existingTotem.discard();
                }

                if (world instanceof ServerWorld serverWorld) {
                    Consumer<ArmorStandEntity> consumer = EntityType.copier(serverWorld, itemStack, context.getPlayer());
                    TotemEntity totem = new TotemEntity(AllEntityTypes.TOTEM, this, context.getPlayer(), serverWorld);
                    if (totem == null) {
                        return ActionResult.FAIL;
                    }

                    totem.setPosition(vec3d);

                    totem.setOwner(context.getPlayer());

                    float f = MathHelper.wrapDegrees(context.getPlayerYaw() - 180.0F);
                    totem.refreshPositionAndAngles(totem.getX(), totem.getY(), totem.getZ(), f, 0.0F);
                    serverWorld.spawnEntityAndPassengers(totem);
                    world.playSound(
                            null, vec3d.x, vec3d.y, vec3d.z, AllSounds.TOTEM_PLACE, SoundCategory.PLAYERS, 1.0F, 1.0F
                    );
                    serverWorld.spawnParticles(ParticleTypes.CLOUD, vec3d.x, vec3d.y, vec3d.z, 15, 0.2, 1.0, 0.2, 0.05);
                    totem.emitGameEvent(GameEvent.ENTITY_PLACE, context.getPlayer());

                    TOTEM_TRACKER.get(context.getPlayer()).setUuid(totem.getUuid());

                    context.getPlayer().getItemCooldownManager().set(this, 5*20);
                }

                return ActionResult.success(world.isClient);
            } else {
                return ActionResult.FAIL;
            }
        }
    }
}
