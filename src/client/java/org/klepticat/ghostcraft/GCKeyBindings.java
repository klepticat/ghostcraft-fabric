package org.klepticat.ghostcraft;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.entity.GCPlayerEntityStickers;
import org.klepticat.ghostcraft.gui.screen.StickerSelectScreen;
import org.klepticat.ghostcraft.networking.InvisKeyPayload;
import org.klepticat.ghostcraft.networking.NightVisKeyPayload;
import org.klepticat.ghostcraft.networking.PlaceStickerPayload;
import org.klepticat.ghostcraft.stickers.Sticker;
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

                ClientPlayerEntity player = MinecraftClient.getInstance().player;

                HitResult raycast = player.raycast(player.getBlockInteractionRange(), 1, false);

                Vector3f position = (player.isSneaking() ? ((BlockHitResult) raycast).getBlockPos().toCenterPos().offset(((BlockHitResult) raycast).getSide(), 0.5) : raycast.getPos()).toVector3f();

                if (((GCPlayerEntityStickers) player).hasStickerSelected() && raycast.getType() == HitResult.Type.BLOCK) {
                    ClientPlayNetworking.send(
                            new PlaceStickerPayload(
                                    ((GCPlayerEntityStickers) player).getSelectedSticker(),
                                    player.getId(),
                                    position,
                                    ((BlockHitResult) raycast).getSide()
                            )
                    );

                    ((GCPlayerEntityStickers) player).setSelectedSticker((Sticker) null);
                }
            }
        });
    }
}
