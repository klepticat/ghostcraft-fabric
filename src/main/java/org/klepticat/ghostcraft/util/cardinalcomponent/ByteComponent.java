package org.klepticat.ghostcraft.util.cardinalcomponent;

import org.ladysnake.cca.api.v3.component.Component;

public interface ByteComponent extends Component {
    byte get();

    void set(byte value);
}
