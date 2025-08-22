package org.klepticat.ghostcraft.util.cardinalcomponent;

import org.ladysnake.cca.api.v3.component.Component;

public interface BooleanComponent extends Component {
    boolean get();

    void set(boolean value);
}
