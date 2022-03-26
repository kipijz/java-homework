package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car{
    private Integer currentSpeed = 0;
    private String carName;

    public Audi(String carName) {
        this.carName = carName;
    }

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed += 10;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public String showCarName() {
        return carName;
    }

}
