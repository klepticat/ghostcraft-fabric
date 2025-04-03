package org.klepticat.ghostcraft.item;

import net.minecraft.sound.SoundEvent;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.GCSounds;

public enum MagicType {
    DIRE(new Vector3f(0.66f, 0.0f, 0.0f), GCSounds.DIRE_CHARGE, "dire", 2.0f), // used by sil's - red
    ETHEREAL(new Vector3f(0.33f, 0.33f, 1.0f), GCSounds.ETHEREAL_CHARGE, "ethereal", 0.66f), // used by elvur's - blue
    MAGIC(new Vector3f(0.33f, 1.0f, 0.33f), GCSounds.MAGIC_CHARGE, "magic", 0.66f), // default - green
    POTENT(new Vector3f(0.66f, 0.0f, 0.66f), GCSounds.POTENT_CHARGE, "potent", 1.0f); // used by tiorva's - purple

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
