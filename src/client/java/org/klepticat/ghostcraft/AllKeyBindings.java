package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.option.KeyBinding;
import org.klepticat.ghostcraft.networking.InvisKeyPayload;
import org.klepticat.ghostcraft.networking.NightVisKeyPayload;
import org.lwjgl.glfw.GLFW;

public class AllKeyBindings {
    private static KeyBinding DM_INVIS_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.ghostcraft.invis",
            GLFW.GLFW_KEY_V,
            "category.ghostcraft.dm_utility"
    ));

    private static KeyBinding DM_NIGHTVIS_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.ghostcraft.night_vision",
            GLFW.GLFW_KEY_B,
            "category.ghostcraft.dm_utility"
    ));

    public static void initialize() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (DM_INVIS_KEY.wasPressed()) {
                ClientPlayNetworking.send(new InvisKeyPayload());
            }

            while (DM_NIGHTVIS_KEY.wasPressed()) {
                ClientPlayNetworking.send(new NightVisKeyPayload());
            }
        });
    }
}
