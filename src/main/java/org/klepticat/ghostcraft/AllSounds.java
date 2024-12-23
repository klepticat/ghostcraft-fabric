package org.klepticat.ghostcraft;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class AllSounds {
    public static final SoundEvent SPELL_CAST = register("spell_cast");
    public static final SoundEvent TOTEM_PLACE = register("totem_place");

    public static void initialize() {}

    public static SoundEvent register(String id) {
        Identifier modSoundID = Identifier.of(MOD_ID, id);

        return Registry.register(Registries.SOUND_EVENT, modSoundID, SoundEvent.of(modSoundID));
    }
}
