package io.codelex.enums.exercise1;

public class Main {
    public static void main(String[] args) {
        CardinalPoints north = CardinalPoints.NORTH;
        CardinalPoints south = CardinalPoints.SOUTH;
        CardinalPoints east = CardinalPoints.EAST;
        CardinalPoints west = CardinalPoints.WEST;

        System.out.println(north.getDirection() + ":" + north.getText() + ":" + north.ordinal());
        System.out.println(south.getDirection() + ":" + south.getText() + ":" + south.ordinal());
        System.out.println(east.getDirection() + ":" + east.getText() + ":" + east.ordinal());
        System.out.println(west.getDirection() + ":" + west.getText() + ":" + west.ordinal());


    }
}
