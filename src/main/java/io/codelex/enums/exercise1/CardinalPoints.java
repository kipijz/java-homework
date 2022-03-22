package io.codelex.enums.exercise1;

public enum CardinalPoints {
    NORTH("North", "up"),
    SOUTH("South", "down"),
    EAST("East", "right"),
    WEST("West", "left");

    private String direction;
    private String text;

    CardinalPoints(String direction, String text) {
        this.direction = direction;
        this.text = text;
    }

    public String getDirection() {
        return direction;
    }

    public String getText() {
        return text;
    }
}
