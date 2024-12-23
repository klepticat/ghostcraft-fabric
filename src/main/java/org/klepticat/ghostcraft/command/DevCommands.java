package org.klepticat.ghostcraft.command;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.IdentifierArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import org.klepticat.ghostcraft.util.json.TagJSON;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static net.minecraft.server.command.CommandManager.*;

public class DevCommands implements Command {
    @Override
    public void execute(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(literal("dev")
                .then(literal("attribute")
                        .then(argument("parent", StringArgumentType.word())
                                .executes(context -> {
                                    Identifier itemId = Identifier.of(context.getSource().getPlayer().getStackInHand(Hand.MAIN_HAND).getItem().toString());

                                    List<String> fileLines = Arrays.asList("{ \"parent\": \"bettercombat:" + StringArgumentType.getString(context, "parent") + "\" }");
                                    Path file = Paths.get("../src/main/resources/data/ghostcraft/weapon_attributes/", itemId.getPath().concat(".json"));

                                    try {
                                        Files.write(file, fileLines, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
                                        context.getSource().sendFeedback(() -> Text.literal("Added item weapon attribute"), false);
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }

                                    return 1;
                                })
                        )
                )
                .then(literal("tag")
                        .then(argument("item_tag", IdentifierArgumentType.identifier())
                                .executes(context -> {
                                    Identifier tagId = IdentifierArgumentType.getIdentifier(context, "item_tag");
                                    Identifier itemId = Identifier.of(context.getSource().getPlayer().getStackInHand(Hand.MAIN_HAND).getItem().toString());

                                    Path file = Paths.get("../src/main/resources/data", tagId.getNamespace(), "tags/item", tagId.getPath().concat(".json"));

                                    if(Files.exists(file)) {
                                        try {
                                            TagJSON tagJson = new Gson().fromJson(Files.newBufferedReader(file, StandardCharsets.UTF_8), TagJSON.class);

                                            if(tagJson.values.contains(itemId.toString())) {
                                                context.getSource().sendError(Text.literal("This tag already contains that item."));
                                                return 0;
                                            }

                                            tagJson.values.add(itemId.toString());
                                            Collections.sort(tagJson.values);

                                            String tagJsonString = new Gson().toJson(tagJson);
                                            Files.writeString(file, tagJsonString, StandardOpenOption.TRUNCATE_EXISTING);

                                            context.getSource().sendFeedback(() -> Text.literal("Added item to tag"), false);

                                            return 1;
                                        } catch (IOException e) {
                                            throw new RuntimeException(e);
                                        }
                                    } else {
                                        TagJSON tagJSON = new TagJSON();

                                        tagJSON.replace = false;
                                        tagJSON.values = List.of(itemId.toString());

                                        String tagJsonString = new Gson().toJson(tagJSON);

                                        try {
                                            Files.writeString(file, tagJsonString, StandardOpenOption.CREATE_NEW);

                                            context.getSource().sendFeedback(() -> Text.literal("Added item to tag"), false);

                                            return 1;
                                        } catch (IOException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                })
                        )
                )
                .then(literal("translate")
                        .then(argument("translation", StringArgumentType.greedyString())
                                .executes(context -> {
                                    String itemKey = context.getSource().getPlayer().getStackInHand(Hand.MAIN_HAND).getItem().getTranslationKey();

                                    Path file = Paths.get("../src/main/resources/assets/ghostcraft/lang/en_us.json");

                                    try {
                                        JsonObject translationJson = JsonParser.parseReader(Files.newBufferedReader(file, StandardCharsets.UTF_8)).getAsJsonObject();
                                        translationJson.addProperty(itemKey, StringArgumentType.getString(context, "translation"));

                                        String translationJsonString = new Gson().toJson(translationJson);

                                        Files.writeString(file, translationJsonString, StandardOpenOption.TRUNCATE_EXISTING);

                                        context.getSource().sendFeedback(() -> Text.literal("Added translation for item"), false);

                                        return 1;
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }
                                })
                        )
                )
        );
    }
}
