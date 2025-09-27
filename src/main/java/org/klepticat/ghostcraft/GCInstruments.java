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
    public static final RegistryKey<Instrument> MEI_FLUTE = register("mei_flute", GCSounds.INSTRUMENT_MEI_FLUTE);
    public static final RegistryKey<Instrument> VIC_FLUTE = register("vic_flute", GCSounds.INSTRUMENT_VIC_FLUTE);
    public static final RegistryKey<Instrument> LIMBY_TOOT_TOOT = register("limby_toot_toot", GCSounds.INSTRUMENT_LIMBY_TOOT_TOOT);
    public static final RegistryKey<Instrument> KAT_BALL = register("kat_ball", GCSounds.INSTRUMENT_KAT_BALL);
    public static final RegistryKey<Instrument> MARIAH_AHH = register("mariah_ahh", GCSounds.INSTRUMENT_MARIAH_AHH);
    public static final RegistryKey<Instrument> MARIAH_ITS_TIME = register("mariah_its_time", GCSounds.INSTRUMENT_MARIAH_ITS_TIME);

    private static RegistryKey<Instrument> register(String id, RegistryEntry.Reference<SoundEvent> soundEventReference) {
        RegistryKey<Instrument> key = RegistryKey.of(RegistryKeys.INSTRUMENT, Identifier.of(MOD_ID, id));

        Registry.register(Registries.INSTRUMENT, key, new Instrument(soundEventReference, 100, 140));

        return key;
    }

    public static void initialize() {
    }
}
