package io.codelex.enums.exercise1;

public enum CardinalPoints {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private String text;

    CardinalPoints(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
