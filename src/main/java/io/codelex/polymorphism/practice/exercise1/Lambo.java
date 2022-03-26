package io.codelex.polymorphism.practice.exercise1;

public class Lambo implements Car{
    private Integer currentSpeed = 0;
    private String carName;

    public Lambo(String carName) {
        this.carName = carName;
    }

    @Override
    public void speedUp() {
        currentSpeed += 15;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 15;
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
