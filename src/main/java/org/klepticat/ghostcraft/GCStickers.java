package org.klepticat.ghostcraft;

import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.stickers.Sticker;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCStickers {
    public static final Sticker DEFAULT = register("default", new Sticker(Identifier.of(MOD_ID, "textures/stickers/default.png"), false));

    public static final Sticker GRIM_UNO = register("grim_uno", new Sticker(Identifier.of(MOD_ID, "textures/stickers/grim_uno.png"), true));
    public static final Sticker VIC_CHOMPUS = register("vic_chompus", new Sticker(Identifier.of(MOD_ID, "textures/stickers/vic_chompus.png"), true));

    public static void initialize() {
    }

    public static Sticker register(String id, Sticker sticker) {
        return Registry.register(GCRegistries.STICKERS, Identifier.of(MOD_ID, id), sticker);
    }
}
