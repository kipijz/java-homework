package io.codelex.enums.exercise1;

public class Main {
    public static void main(String[] args) {
        CardinalPoints north = CardinalPoints.NORTH;
        CardinalPoints south = CardinalPoints.SOUTH;
        CardinalPoints east = CardinalPoints.EAST;
        CardinalPoints west = CardinalPoints.WEST;

        System.out.println(north.toString() + ":" + north.getText() + ":" + north.ordinal());
        System.out.println(south + ":" + south.getText() + ":" + south.ordinal());
        System.out.println(east + ":" + east.getText() + ":" + east.ordinal());
        System.out.println(west + ":" + west.getText() + ":" + west.ordinal());
    }
}
