package org.klepticat.ghostcraft.entity;

public enum EyeBatVariant {
    GREEN("green"),
    BLURPLE("blurple"),
    RED("red"),
    ORANGE("orange");

    public final String string;

    EyeBatVariant(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }
}
