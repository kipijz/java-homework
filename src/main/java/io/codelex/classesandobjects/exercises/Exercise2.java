package io.codelex.classesandobjects.exercises;

public class Exercise2 {
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings
    private static final double GAS_HOG_CONSUMPTION = 15.0;
    private static final double ECONOMIC_CONSUMPTION = 5.0;

    //pirmais constructor
/*    public Exercise2(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }*/

    public Exercise2(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    //README rakstīts, ka vajag izmantot int mileage kā pirmo parametru, bet tas tak ir būtībā tas
    // pats, kas double endKilometers, ja es pareizi saprotu?
    void fillUp(double endKilometers, double liters ) {
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return liters / (endKilometers - startKilometers);
    }

    public boolean gasHog() {
        return calculateConsumption() > GAS_HOG_CONSUMPTION;
    }

    public boolean economyCar() {
        return calculateConsumption() < ECONOMIC_CONSUMPTION;
    }

}
