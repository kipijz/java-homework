package io.codelex.classesandobjects.exercises.exercise3;

public class Odometer {
    private int mileage;
    private int milageTraveled;

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
        if (this.mileage < 999999) {
            this.mileage++;
            milageTraveled++;
        } else this.mileage = 0;

        if (this.milageTraveled % 10 == 0) fuelGauge.dereaseFuel();
    }
}
