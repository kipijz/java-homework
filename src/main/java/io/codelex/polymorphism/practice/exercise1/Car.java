package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    void speedUp();

    void slowDown();

    String showCurrentSpeed();

    String showCarName();

    default void startEngine(){
        System.out.println("Rrrrrrr.....");
    }


}
