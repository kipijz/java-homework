package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{
    public Mouse(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("squeeeeeeek");
    }
}
