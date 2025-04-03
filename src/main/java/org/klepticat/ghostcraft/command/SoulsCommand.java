package org.klepticat.ghostcraft.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import org.klepticat.ghostcraft.GCCardinalComponents;

import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

public class SoulsCommand implements Command {
    @Override
    public void execute(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(literal("souls").then(literal("add").then(argument("players", EntityArgumentType.players()).then(argument("value", IntegerArgumentType.integer(0, 255)).executes(context -> {
            for (PlayerEntity player : EntityArgumentType.getPlayers(context, "players")) {
                player.getComponent(GCCardinalComponents.PLAYER_SOULS).set((byte) (player.getComponent(GCCardinalComponents.PLAYER_SOULS).get() + IntegerArgumentType.getInteger(context, "value")));
            }
            return EntityArgumentType.getPlayers(context, "players").size();
        })))).then(literal("set").then(argument("players", EntityArgumentType.players()).then(argument("value", IntegerArgumentType.integer(0, 127)).executes(context -> {
            for (PlayerEntity player : EntityArgumentType.getPlayers(context, "players")) {
                player.getComponent(GCCardinalComponents.PLAYER_SOULS).set((byte) IntegerArgumentType.getInteger(context, "value"));
            }
            return EntityArgumentType.getPlayers(context, "players").size();
        })))).then(literal("remove").then(argument("players", EntityArgumentType.players()).then(argument("value", IntegerArgumentType.integer(0, 127)).executes(context -> {
            for (PlayerEntity player : EntityArgumentType.getPlayers(context, "players")) {
                player.getComponent(GCCardinalComponents.PLAYER_SOULS).set((byte) (player.getComponent(GCCardinalComponents.PLAYER_SOULS).get() - IntegerArgumentType.getInteger(context, "value")));
            }
            return EntityArgumentType.getPlayers(context, "players").size();
        })))).then(literal("set_max").then(argument("players", EntityArgumentType.players()).then(argument("value", IntegerArgumentType.integer(1, 127)).executes(context -> {
            for (PlayerEntity player : EntityArgumentType.getPlayers(context, "players")) {
                player.getComponent(GCCardinalComponents.PLAYER_MAX_SOULS).set((byte) IntegerArgumentType.getInteger(context, "value"));
            }
            return EntityArgumentType.getPlayers(context, "players").size();
        })))));
    }
}
