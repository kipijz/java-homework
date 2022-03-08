package io.codelex.classesandobjects.exercises.exercise3;

public class Test {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(5);
        Odometer odometer = new Odometer(10, fuelGauge);

        fuelGauge.increaseFuel();

        while (fuelGauge.getFuel() > 0) {
            // add mile driven
            odometer.increaseMileage();

            // Display the mileage.
            System.out.println("Mileage: " + odometer.getMileage());

            // Display the amount of fuel.
            System.out.println("Fuel level: " + fuelGauge.getFuel() + " liters");
            System.out.println("------------------------------");
        }
    }
}