package io.codelex.classesandobjects.exercises.exercise3;

public class FuelGauge {
    private int fuel;
    private static final int MAX_FUEL = 70;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void increaseFuel() {
        if (this.fuel < MAX_FUEL) {
            this.fuel++;
        }
        else {
            System.out.println("Already at max capacity");
        }
    }
    public void dereaseFuel() {
        if (this.fuel > 0) {
            this.fuel--;
        }
        else {
            System.out.println("Already empty");
        }
    }

}
