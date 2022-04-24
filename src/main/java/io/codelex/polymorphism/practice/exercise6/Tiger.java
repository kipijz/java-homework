package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline{

    public Tiger(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("RAAAAAAAAAAAAAAAAAWR");
    }

    @Override
    public boolean isEdible(Food food) {
        return food instanceof Meat;
    }
}

