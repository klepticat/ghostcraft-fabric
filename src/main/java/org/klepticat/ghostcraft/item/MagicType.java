package org.klepticat.ghostcraft.item;

import net.minecraft.sound.SoundEvent;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.GCSounds;

public enum MagicType {
    CHAOS(new Vector3f(0.66f, 0.0f, 0.0f), GCSounds.CHAOS_CHARGE, "chaos", 2.0f), // used by sil's - red
    ETHEREAL(new Vector3f(0.33f, 0.33f, 1.0f), GCSounds.ETHEREAL_CHARGE, "ethereal", 0.66f), // used by elvur's - blue
    MAGIC(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "magic", 0.66f), // default - green
    POTENT(new Vector3f(0.66f, 0.0f, 0.66f), GCSounds.POTENT_CHARGE, "potent", 1.0f), // used by tiorva's - purple
    BRAVE(new Vector3f(0.9f, 0.5f, 0f), GCSounds.BRAVE_CHARGE, "brave", 1.00f), // Courage, Fear
    CHARM(new Vector3f(1f, 0.8f, 0f), GCSounds.CHARM_CHARGE, "charm", 1.00f), // Love, Heal
    DEATHLY(new Vector3f(0, 0, 0), GCSounds.DEATHLY_CHARGE, "deathly", 1.00f), // Death, Locate
    LIVING(new Vector3f(1, 1, 1), GCSounds.LIVING_CHARGE, "living", 1.00f), // Life, Locate
    UNITED(new Vector3f(1f, 0.55f, 0.55f), GCSounds.UNITED_CHARGE, "united", 1.00f), // Unite, Tether
    BALANCED(new Vector3f(0.11f, 0.11f, 0.7f), GCSounds.BALANCED_CHARGE, "balanced", 1.00f), // Balance, Key
    CLEAN(new Vector3f(0.60f, 0.40f, 0.60f), GCSounds.CLEAN_CHARGE, "clean", 1.00f); // Peace, cleanse

    public final Vector3f color;
    public final SoundEvent soundEvent;
    public final float volume;
    private final String string;

    MagicType(Vector3f color, SoundEvent soundEvent, String string, float volume) {
        this.color = color;
        this.soundEvent = soundEvent;
        this.string = string;
        this.volume = volume;
    }

    public String toString() {
        return string;
    }
}
