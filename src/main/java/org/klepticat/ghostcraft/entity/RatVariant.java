package org.klepticat.ghostcraft.entity;

public enum RatVariant {
    LIGHT_BROWN("light_brown"),
    GRAY("gray"),
    BLACK("black");

    public final String string;

    RatVariant(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }
}
