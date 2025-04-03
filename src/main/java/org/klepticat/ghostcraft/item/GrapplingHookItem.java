package org.klepticat.ghostcraft.item;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.klepticat.ghostcraft.GCSounds;

import java.util.Optional;

// TODO: add entity pulling

public class GrapplingHookItem extends Item {
    public GrapplingHookItem(Settings settings) {
        super(settings);
    }

    public static float maxAngle = 0.524f;

    public int cooldown = 10;

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        Vec3d cameraPos = user.getClientCameraPosVec(0);
        Vec3d rotVec = user.getRotationVec(0);
        Box searchBox = Box.of(cameraPos, 30, 30, 30);

        Optional<BlockPos> closestTargetOptional = BlockPos.stream(searchBox).map(BlockPos::toImmutable).filter(blockPos -> (world.getBlockState(blockPos).getBlock() instanceof TargetBlock || world.getBlockState(blockPos).getBlock() instanceof LeverBlock) &&
                Math.PI - (Math.acos(blockPos.toCenterPos().relativize(cameraPos).dotProduct(rotVec) / (blockPos.toCenterPos().relativize(cameraPos).length() * rotVec.length()))) <= maxAngle &&
                blockPos.toCenterPos().isInRange(cameraPos, 15)).min((blockPosA, blockPosB) -> {
            double angleA = Math.PI - (Math.acos(blockPosA.toCenterPos().relativize(cameraPos).dotProduct(rotVec) / (blockPosA.toCenterPos().relativize(cameraPos).length() * rotVec.length())));
            double angleB = Math.PI - (Math.acos(blockPosB.toCenterPos().relativize(cameraPos).dotProduct(rotVec) / (blockPosB.toCenterPos().relativize(cameraPos).length() * rotVec.length())));

            return angleA != angleB ? (angleA > angleB ? 1 : -1) : 0;
        });

        if (closestTargetOptional.isEmpty()) return TypedActionResult.fail(itemStack);

        if (world instanceof ServerWorld serverWorld) {
            BlockState blockState = world.getBlockState(closestTargetOptional.get());
            Block block = blockState.getBlock();

            if (block instanceof TargetBlock) {
                user.addVelocity(closestTargetOptional.get().toCenterPos().subtract(user.getPos()).multiply(0.2, 0.1, 0.2));
                user.velocityModified = true;
                user.getItemCooldownManager().set(this, this.cooldown);
            } else if (block instanceof LeverBlock leverBlock) {
                leverBlock.togglePower(blockState, world, closestTargetOptional.get(), user);
            }

            world.playSound(null, user.getX(), user.getY(), user.getZ(), GCSounds.GRAPPLE, SoundCategory.PLAYERS, 1.0f, 1.0f);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
