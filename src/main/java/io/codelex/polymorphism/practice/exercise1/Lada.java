package io.codelex.polymorphism.practice.exercise1;

public class Lada implements Car, Nitrous {
    private Integer currentSpeed = 0;
    private String carName;

    public Lada(String carName) {
        this.carName = carName;
    }

    @Override
    public void speedUp() {
        currentSpeed += 40;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 40;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public String showCarName() {
        return carName;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 50;
    }

}
