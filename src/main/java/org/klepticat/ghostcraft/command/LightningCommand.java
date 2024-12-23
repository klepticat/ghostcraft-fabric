package org.klepticat.ghostcraft.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;

import static net.minecraft.server.command.CommandManager.*;

public class LightningCommand implements Command {
    public LightningCommand() {}

    @Override
    public void execute(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(literal("lightning")
            .executes(context -> {
                if(!context.getSource().isExecutedByPlayer()) {
                    context.getSource().sendError(Text.literal("This command must be run by a player, or an entity must be provided"));
                    return 0;
                }

                ServerPlayerEntity player = context.getSource().getPlayer();

                assert player != null;
                HitResult hitResult = player.raycast(200.0, 0.0f, false);

                BlockPos blockPos = new BlockPos((int) Math.floor(hitResult.getPos().x), (int) Math.floor(hitResult.getPos().y), (int) Math.floor(hitResult.getPos().z));

                EntityType.LIGHTNING_BOLT.spawn(context.getSource().getWorld(), blockPos, SpawnReason.COMMAND);
                context.getSource().sendFeedback(() -> Text.literal("Spawned Lightning"), false);
                return 1;
            })
            .then(argument("entity", EntityArgumentType.entity()).executes(context -> {
                Entity entity = EntityArgumentType.getEntity(context, "entity");

                EntityType.LIGHTNING_BOLT.spawn(context.getSource().getWorld(), entity.getBlockPos(), SpawnReason.COMMAND);
                context.getSource().sendFeedback(() -> Text.literal("Struck " + entity.getName().getString() + " with Lightning"), true);
                return 1;
            }))
        );
    }
}
