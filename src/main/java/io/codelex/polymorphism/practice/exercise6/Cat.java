package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline{
    private String breed;

    public Cat(String animalType, String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public boolean isEdible(Food food) {
        return true;
    }

    @Override
    public String toString() {
        return getAnimalType() +
                "[" + getAnimalName() +
                ", " + getBreed() +
                ", " + getAnimalWeight() +
                ", " + getLivingRegion() +
                ", " + getFoodEaten() +
                "]";
    }
}
