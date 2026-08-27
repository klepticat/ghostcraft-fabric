package org.klepticat.ghostcraft;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCSounds {
    public static final SoundEvent CHAOS_CHARGE = register("chaos_charge");
    public static final SoundEvent MAGIC_CHARGE = register("magic_charge");
    public static final SoundEvent ETHEREAL_CHARGE = register("ethereal_charge");
    public static final SoundEvent POTENT_CHARGE = register("potent_charge");
    public static final SoundEvent BRAVE_CHARGE = register("brave_charge");
    public static final SoundEvent CHARM_CHARGE = register("charm_charge");
    public static final SoundEvent CLEAN_CHARGE = register("clean_charge");
    public static final SoundEvent DEATHLY_CHARGE = register("deathly_charge");
    public static final SoundEvent LIVING_CHARGE = register("living_charge");
    public static final SoundEvent UNITED_CHARGE = register("united_charge");
    public static final SoundEvent BALANCED_CHARGE = register("balanced_charge");
    public static final SoundEvent TOTEM_PLACE = register("totem_place");
    public static final SoundEvent GRAPPLE = register("grapple");

    public static final RegistryEntry.Reference<SoundEvent> DAWNSONG = registerReference("dawnsong");
    public static final RegistryEntry.Reference<SoundEvent> DUSKSONG = registerReference("dusksong");
    public static final RegistryEntry.Reference<SoundEvent> HEALINGSONG = registerReference("healingsong");
    public static final RegistryEntry.Reference<SoundEvent> STORMSONG = registerReference("stormsong");

    public static final RegistryEntry.Reference<SoundEvent> INSTRUMENT_MEI_FLUTE = registerReference("mei_flute");
    public static final RegistryEntry.Reference<SoundEvent> INSTRUMENT_VIC_FLUTE = registerReference("vic_flute");
    public static final RegistryEntry.Reference<SoundEvent> INSTRUMENT_LIMBY_TOOT_TOOT = registerReference("limby_toot_toot");
    public static final RegistryEntry.Reference<SoundEvent> INSTRUMENT_KAT_BALL = registerReference("kat_ball");
    public static final RegistryEntry.Reference<SoundEvent> INSTRUMENT_MARIAH_ITS_TIME = registerReference("mariah_its_time");
    public static final RegistryEntry.Reference<SoundEvent> INSTRUMENT_MARIAH_AHH = registerReference("mariah_ahh");

    public static void initialize() {}

    public static SoundEvent register(String id) {
        Identifier modSoundID = Identifier.of(MOD_ID, id);

        return Registry.register(Registries.SOUND_EVENT, modSoundID, SoundEvent.of(modSoundID));
    }

    public static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        Identifier modSoundID = Identifier.of(MOD_ID, id);

        return Registry.registerReference(Registries.SOUND_EVENT, modSoundID, SoundEvent.of(modSoundID));
    }
}
