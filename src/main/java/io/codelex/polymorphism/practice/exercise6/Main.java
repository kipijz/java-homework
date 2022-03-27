package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Animal> animalArrayList = new ArrayList<>();
    private static ArrayList<Food> animalFoodArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean moreData = true;
        while (moreData) {
            String[] animal = scanner.nextLine().split(" ");
            if (animal[0].equals("End")) {
                moreData = false;
                System.out.println(animalArrayList);
            } else {
                makeAnimal(animal);
                getLastAnimal().makeSound();
                String[] food = scanner.nextLine().split(" ");
                giveFood(food);
                if (checkFood()) {
                    getLastAnimal().eat(getLastFood());
                    System.out.println(getLastAnimal());
                } else {
                    System.out.println(getLastAnimal().getAnimalType() + " is not eating that type of food!");
                }
            }
        }
    }

    private static boolean checkFood() {
        boolean checkFood = false;

        if (getLastAnimal() instanceof Zebra || getLastAnimal() instanceof Mouse) {
            if (getLastFood() instanceof Vegetable) {
                checkFood = true;
            }
        } else if (getLastAnimal() instanceof Tiger) {
            if (getLastFood() instanceof Meat) {
                checkFood = true;
            }
        } else if (getLastAnimal() instanceof Cat) {
            checkFood = true;
        }
        return checkFood;
    }

    private static void giveFood(String[] food) {
        switch (food[0]) {
            case "Vegetable" -> animalFoodArrayList.add(new Vegetable(Integer.parseInt(food[1])));
            case "Meat" -> animalFoodArrayList.add(new Meat(Integer.parseInt(food[1])));
        }
    }

    private static void makeAnimal(String[] animal) {
        switch (animal[0]) {
            case "Cat" -> animalArrayList.add(new Cat(animal[0], animal[1], Double.parseDouble(animal[2]), animal[3], animal[4]));
            case "Mouse" -> animalArrayList.add(new Mouse(animal[0], animal[1], Double.parseDouble(animal[2]), animal[3]));
            case "Zebra" -> animalArrayList.add(new Zebra(animal[0], animal[1], Double.parseDouble(animal[2]), animal[3]));
            case "Tiger" -> animalArrayList.add(new Tiger(animal[0], animal[1], Double.parseDouble(animal[2]), animal[3]));
        }
    }

    private static Animal getLastAnimal() {
        return animalArrayList.get(animalArrayList.size() - 1);
    }

    private static Food getLastFood() {
        return animalFoodArrayList.get(animalFoodArrayList.size() - 1);
    }
}