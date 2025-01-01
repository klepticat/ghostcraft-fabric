package org.klepticat.ghostcraft.util.cardinalcomponent;

import org.klepticat.ghostcraft.item.MagicType;
import org.ladysnake.cca.api.v3.component.Component;

public interface MagicTypeComponent extends Component {
    MagicType getMagicType();

    void setMagicType(MagicType magicType);
}
