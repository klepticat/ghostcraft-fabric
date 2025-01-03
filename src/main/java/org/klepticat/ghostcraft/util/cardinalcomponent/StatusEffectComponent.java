package org.klepticat.ghostcraft.util.cardinalcomponent;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import org.ladysnake.cca.api.v3.component.Component;

public interface StatusEffectComponent extends Component {
    RegistryEntry<StatusEffect> getEffect();

    byte getAmplifier();

    void setEffect(RegistryEntry<StatusEffect> effect, byte amplifier);

    void setEffect(RegistryEntry<StatusEffect> effect);

    void setAmplifier(byte amplifier);
}
