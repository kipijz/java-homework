package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Nitrous{
    private Integer currentSpeed = 0;
    private String carName;

    public Lexus(String carName) {
        this.carName = carName;
    }

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed += 8;
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
        currentSpeed += 30;
    }

}
