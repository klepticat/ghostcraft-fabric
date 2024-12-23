package org.klepticat.ghostcraft.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.server.command.CommandManager.*;

public class LoreCommand implements Command {
    public LoreCommand() {}

    @Override
    public void execute(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(literal("lore").then(literal("add").then(argument("text", StringArgumentType.greedyString()).executes(context -> {
            if(!context.getSource().isExecutedByPlayer()) {
                context.getSource().sendError(Text.literal("This command must be run by a player"));
                return 0;
            }

            ServerPlayerEntity player = context.getSource().getPlayer();

            assert player != null;
            ItemStack heldItem = player.getStackInHand(Hand.MAIN_HAND);

            if(heldItem.isEmpty()) {
                context.getSource().sendError(Text.literal("No item found in mainhand"));
                return 0;
            }

            List<Text> lore = new ArrayList<>();
            lore.addAll(heldItem.get(DataComponentTypes.LORE).lines());

            String loreText = StringArgumentType.getString(context, "text");

            lore.add(Text.of(loreText));

            context.getSource().sendFeedback(() -> Text.literal("Added item lore"), true);
            heldItem.set(DataComponentTypes.LORE, new LoreComponent(lore));
            return 1;
        })))
        .then(literal("set").then(argument("row", IntegerArgumentType.integer(1)).then(argument("text", StringArgumentType.greedyString()).executes(context -> {
            if(!context.getSource().isExecutedByPlayer()) {
                context.getSource().sendError(Text.literal("This command must be run by a player"));
                return 0;
            }

            ServerPlayerEntity player = context.getSource().getPlayer();

            ItemStack heldItem = player.getStackInHand(Hand.MAIN_HAND);

            if(heldItem.isEmpty()) {
                context.getSource().sendError(Text.literal("No item found in mainhand"));
                return 0;
            }

            List<Text> lore = new ArrayList<>(heldItem.get(DataComponentTypes.LORE).lines());

            if(lore.size() == 0) {
                context.getSource().sendError(Text.literal("There is no lore on this item"));
                return 0;
            }

            String loreText = StringArgumentType.getString(context, "text");

            int rowIndex = IntegerArgumentType.getInteger(context, "row") - 1;

            lore.set(rowIndex, Text.of(loreText));

            context.getSource().sendFeedback(() -> Text.literal("Updated item lore"), true);
            heldItem.set(DataComponentTypes.LORE, new LoreComponent(lore));
            return 1;
        }))))
        .then(literal("clear").executes(context -> {
            if(!context.getSource().isExecutedByPlayer()) {
                context.getSource().sendError(Text.literal("This command must be run by a player"));
                return 0;
            }

            ServerPlayerEntity player = context.getSource().getPlayer();

            assert player != null;
            ItemStack heldItem = player.getStackInHand(Hand.MAIN_HAND);

            if(heldItem.isEmpty()) {
                context.getSource().sendError(Text.literal("No item found in mainhand"));
                return 0;
            }

            context.getSource().sendFeedback(() -> Text.literal("Cleared item lore"), true);
            heldItem.set(DataComponentTypes.LORE, new LoreComponent(List.of()));
            return 0;
        }))
        );
    }
}
