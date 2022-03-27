package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal{
    public Zebra(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("hyonhyon");
    }
}
