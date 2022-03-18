package io.codelex.classesandobjects.exercises.exercise3;

public class Odometer {
    private int mileage;
    private int milageTraveled;
    private static final int MAX_MILEAGE = 999999;

    private FuelGauge fuelGauge;

    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
        this.milageTraveled = 0;
    }

    public int getMileage() {
        return mileage;
    }

    public void increaseMileage() {
        if (this.mileage < MAX_MILEAGE) {
            this.mileage++;
            milageTraveled++;
        } else {
            this.mileage = 0;
        }

        if (this.milageTraveled % 10 == 0) {
            fuelGauge.dereaseFuel();
        }
    }
}
