package org.klepticat.ghostcraft;

import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.stickers.Sticker;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCStickers {
    public static final Sticker DEFAULT = register("default", new Sticker(Identifier.of(MOD_ID, "textures/stickers/default.png"), false));

    public static final Sticker ANGRY_GUY = register("angry_guy", new Sticker(Identifier.of(MOD_ID, "textures/stickers/angry_guy.png"), true));
    public static final Sticker ETHRIL_SNOOF = register("ethril_snoof", new Sticker(Identifier.of(MOD_ID, "textures/stickers/ethril_snoof.png"), true));
    public static final Sticker FRED_HAPPI = register("fred_happi", new Sticker(Identifier.of(MOD_ID, "textures/stickers/fred_happi.png"), true));
    public static final Sticker GRIM_UNO = register("grim_uno", new Sticker(Identifier.of(MOD_ID, "textures/stickers/grim_uno.png"), true));
    public static final Sticker KEEPER = register("keeper", new Sticker(Identifier.of(MOD_ID, "textures/stickers/keeper.png"), true));
    public static final Sticker LIMBUS_LIMEL = register("limbus_limel", new Sticker(Identifier.of(MOD_ID, "textures/stickers/limbus_limel.png"), true));
    public static final Sticker LIMBY_EVIDENCE = register("limby_evidence", new Sticker(Identifier.of(MOD_ID, "textures/stickers/limby_evidence.png"), true));
    public static final Sticker LIMBY_WIGGLY = register("limby_wiggly", new Sticker(Identifier.of(MOD_ID, "textures/stickers/limby_wiggly.png"), true));
    public static final Sticker LIMBY_WTF = register("limby_wtf", new Sticker(Identifier.of(MOD_ID, "textures/stickers/limby_wtf.png"), true));
    public static final Sticker MEI_YIPPEE = register("mei_yippee", new Sticker(Identifier.of(MOD_ID, "textures/stickers/mei_yippee.png"), true));
    public static final Sticker RAVNA_WANTED = register("ravna_wanted", new Sticker(Identifier.of(MOD_ID, "textures/stickers/ravna_wanted.png"), true));
    public static final Sticker SHINGY_POG = register("shiny_pog", new Sticker(Identifier.of(MOD_ID, "textures/stickers/shiny_pog.png"), true));
    public static final Sticker SILVER_AGONY = register("silver_agony", new Sticker(Identifier.of(MOD_ID, "textures/stickers/silver_agony.png"), true));
    public static final Sticker VIC_CHOMPUS = register("vic_chompus", new Sticker(Identifier.of(MOD_ID, "textures/stickers/vic_chompus.png"), true));
    public static final Sticker VIC_GREMLIN = register("vic_gremlin", new Sticker(Identifier.of(MOD_ID, "textures/stickers/vic_gremlin.png"), true));
    public static final Sticker VIC_PISSED = register("vic_pissed", new Sticker(Identifier.of(MOD_ID, "textures/stickers/vic_pissed.png"), true));

    public static void initialize() {
    }

    public static Sticker register(String id, Sticker sticker) {
        return Registry.register(GCRegistries.STICKERS, Identifier.of(MOD_ID, id), sticker);
    }
}
