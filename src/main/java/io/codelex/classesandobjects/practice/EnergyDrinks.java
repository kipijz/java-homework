package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
//        fixme


        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers() + " bought at least one energy drink");
        System.out.println((int) calculatePreferCitris() + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static int calculateEnergyDrinkers() {
        return (int) (NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS);
    }

    public static int calculatePreferCitris() {
        return (int) (calculateEnergyDrinkers() * PREFER_CITRUS_DRINKS);
    }
}
