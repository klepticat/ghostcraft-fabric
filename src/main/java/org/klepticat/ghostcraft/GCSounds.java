package org.klepticat.ghostcraft;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCSounds {
    public static final SoundEvent DIRE_CHARGE = register("dire_charge");
    public static final SoundEvent MAGIC_CHARGE = register("magic_charge");
    public static final SoundEvent ETHEREAL_CHARGE = register("ethereal_charge");
    public static final SoundEvent POTENT_CHARGE = register("potent_charge");
    public static final SoundEvent TOTEM_PLACE = register("totem_place");
    public static final SoundEvent GRAPPLE = register("grapple");

    public static final RegistryEntry.Reference<SoundEvent> INSTRUMENT_MEI_FLUTE = registerReference("mei_flute");

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
