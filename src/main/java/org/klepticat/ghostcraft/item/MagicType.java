package org.klepticat.ghostcraft.item;

import net.minecraft.sound.SoundEvent;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.GCSounds;

public enum MagicType {
    CHAOS(new Vector3f(0.66f, 0.0f, 0.0f), GCSounds.DIRE_CHARGE, "chaos", 2.0f), // used by sil's - red
    ETHEREAL(new Vector3f(0.33f, 0.33f, 1.0f), GCSounds.ETHEREAL_CHARGE, "ethereal", 0.66f), // used by elvur's - blue
    MAGIC(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "magic", 0.66f), // default - green
    POTENT(new Vector3f(0.66f, 0.0f, 0.66f), GCSounds.POTENT_CHARGE, "potent", 1.0f), // used by tiorva's - purple
    BRAVE(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "brave", 0.66f), // Courage, Fear
    CHARM(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "charm", 0.66f), // Love, Heal
    DEATHLY(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "deathly", 0.66f), // Death, Locate
    LIVING(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "living", 0.66f), // Life, Locate
    UNITED(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "united", 0.66f), // Unite, Tether
    BALANCED(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "balanced", 0.66f), // Balance, Key
    CLEAN(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "clean", 0.66f); // Peace, cleanse

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
