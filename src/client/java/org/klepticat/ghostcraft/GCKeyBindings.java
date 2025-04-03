package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.text.Text;
import org.klepticat.ghostcraft.gui.screen.StickerSelectScreen;
import org.klepticat.ghostcraft.networking.InvisKeyPayload;
import org.klepticat.ghostcraft.networking.NightVisKeyPayload;
import org.lwjgl.glfw.GLFW;

public class GCKeyBindings {
    private static final KeyBinding DM_INVIS_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.ghostcraft.invis",
            GLFW.GLFW_KEY_V,
            "category.ghostcraft.dm_utility"
    ));

    private static final KeyBinding DM_NIGHTVIS_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.ghostcraft.night_vision",
            GLFW.GLFW_KEY_B,
            "category.ghostcraft.dm_utility"
    ));

    private static final KeyBinding STICKER_SELECTOR_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.ghostcraft.sticker_selector",
            GLFW.GLFW_KEY_G,
            "category.ghostcraft.stickers"
    ));

    private static final KeyBinding STICKER_PLACE_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.ghostcraft.place_sticker",
            GLFW.GLFW_KEY_Z,
            "category.ghostcraft.stickers"
    ));

    public static void initialize() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (DM_INVIS_KEY.wasPressed()) {
                ClientPlayNetworking.send(new InvisKeyPayload());
            }

            while (DM_NIGHTVIS_KEY.wasPressed()) {
                ClientPlayNetworking.send(new NightVisKeyPayload());
            }

            while (STICKER_SELECTOR_KEY.wasPressed()) {
                client.setScreen(new StickerSelectScreen(Text.of("Sticker Selector")));
            }

            while (STICKER_PLACE_KEY.wasPressed()) {
                assert MinecraftClient.getInstance().player != null;


            }
        });
    }
}
