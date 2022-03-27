package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalType;
    private String animalName;
    private double animalWeight;
    private Integer foodEaten = 0;
    DecimalFormat decimalFormat = new DecimalFormat("0.#");

    public Animal(String animalType, String animalName, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getAnimalWeight() {
        return Double.parseDouble(decimalFormat.format(animalWeight));
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }
}
