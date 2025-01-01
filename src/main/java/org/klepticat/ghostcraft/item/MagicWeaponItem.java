package org.klepticat.ghostcraft.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.AllSounds;
import org.klepticat.ghostcraft.entity.SpellProjectileEntity;

// TODO: Remove all references to arrows/bows. Eventually convert to extending RangedWeaponItem once all bow functionality is copied over? - 70% there
// TODO: add better visual/audio cues. gamefeel isn't good enough when charging.
// TODO: dire: evil, sinister, dark, growly, grizzly, necromancy / ethereal: holy, light magic, healing magic / potent: goopy, mutation magic, transmutation magic / magic: generic magic sound, sparkly, twinkly, ars magica/noveau type sound?
public class MagicWeaponItem extends BowItem {

    private float projectileSpeed = 2.0f;
    private MagicType magicType;

    public MagicWeaponItem(MagicType magicType, Settings settings) {
        super(settings);
        this.magicType = magicType;
    }

    public MagicWeaponItem(Settings settings) {
        super(settings);
        this.magicType = MagicType.POTENT;
    }

        if(this.magicType == null) this.magicType = MagicType.MAGIC;
    }

    public float getPullTime() { return this.chargeTime; }

    public static int getWeaponStackDamage() { return 1; }

    protected void shootAll(
            ServerWorld world,
            LivingEntity shooter,
            Hand hand,
            ItemStack stack,
            float speed,
            float divergence,
            boolean critical
    ) {
        ItemStack itemStack = Items.ARROW.getDefaultStack();

        ProjectileEntity projectileEntity = this.createArrowEntity(world, shooter, stack, itemStack, critical);
        this.shoot(shooter, projectileEntity, speed, divergence);
        world.spawnEntity(projectileEntity);
        stack.damage(this.getWeaponStackDamage(itemStack), shooter, LivingEntity.getSlotForHand(hand));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        return TypedActionResult.consume(itemStack);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.NONE;
    }

    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (user instanceof PlayerEntity playerEntity) {
            // gets number of ticks weapon has been pulled back for
            int usedTime = this.getMaxUseTime(stack, user) - remainingUseTicks;
            float f = Math.min(1.0f, usedTime / this.getPullTime());
            if (!((double)f < 0.9)) {
                if (world instanceof ServerWorld serverWorld) {
                    this.shootAll(serverWorld, playerEntity, playerEntity.getActiveHand(), stack, projectileSpeed, 0.5F, f == 1.0F);
                }

                world.playSound(
                        null,
                        playerEntity.getX(),
                        playerEntity.getY(),
                        playerEntity.getZ(),
                        this.magicType.soundEvent,
                        SoundCategory.PLAYERS,
                        this.magicType.volume,
                        1.0F / (world.getRandom().nextFloat() * 0.4F + 1.2F) + f * 0.5F
                );
                playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            }
        }
    }

    public static float getPullProgress(int useTicks) {
        float f = (float)useTicks / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }

    protected void shoot(LivingEntity shooter, ProjectileEntity projectile, float speed, float divergence) {
        projectile.setVelocity(shooter, shooter.getPitch(), shooter.getYaw(), 0.0F, speed, divergence);
    }

    protected ProjectileEntity createArrowEntity(World world, LivingEntity shooter, ItemStack weaponStack, ItemStack projectileStack, boolean critical) {
        ProjectileEntity projectileEntity = new SpellProjectileEntity(this.magicType, shooter, world);

        return projectileEntity;
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        if((this.getMaxUseTime(stack, user) - remainingUseTicks) >= this.getPullTime() && !world.isClient) {
            if(world instanceof ServerWorld serverWorld && (remainingUseTicks % 2 == 0)) {
                serverWorld.spawnParticles(new DustParticleEffect(this.magicType.color,1.0f), user.getX(), user.getEyeY(), user.getZ(), 1, 0.5f, 0.5f, 0.5f, 5);
            }
        }
    }
}
