package org.klepticat.ghostcraft;

import net.minecraft.item.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GCInstruments {
    public static final RegistryKey<Instrument> MEI_FLUTE = register("mei_flute");

    private static RegistryKey<Instrument> register(String id) {
        RegistryKey<Instrument> key = RegistryKey.of(RegistryKeys.INSTRUMENT, Identifier.of(MOD_ID, id));

        Registry.register(Registries.INSTRUMENT, key, new Instrument(GCSounds.INSTRUMENT_MEI_FLUTE, 256, 140));

        return key;
    }

    public static void initialize() {
    }
}
