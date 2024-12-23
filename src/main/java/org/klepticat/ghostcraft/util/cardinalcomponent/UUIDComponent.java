package org.klepticat.ghostcraft.util.cardinalcomponent;

import org.ladysnake.cca.api.v3.component.Component;

import java.util.UUID;

public interface UUIDComponent extends Component {
    UUID getUuid();
    void setUuid(UUID uuid);
}
