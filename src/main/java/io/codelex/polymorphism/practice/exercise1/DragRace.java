package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Audi audi = new Audi("Audi");
        Bmw bmw = new Bmw("BMW");
        Lada lada = new Lada("LADA");
        Lambo lambo = new Lambo("Lambo");
        Lexus lexus = new Lexus("Lexus");
        Tesla tesla = new Tesla("Tesla");

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(audi);
        cars.add(bmw);
        cars.add(lada);
        cars.add(lambo);
        cars.add(lexus);
        cars.add(tesla);

        iterate(cars);
        printFastestCar(cars);
    }

    private static void printFastestCar(ArrayList<Car> cars) {
        Car fastestCar = cars.stream()
                .max(Comparator.comparingInt(car -> Integer.parseInt(car.showCurrentSpeed())))
                .get();
        System.out.println("The fastest car was: " + fastestCar.showCarName() + ", the speed of this car was: " + fastestCar.showCurrentSpeed());
    }

    private static void iterate(ArrayList<Car> cars) {
        int iteration = 1;
        while (iteration <= 10) {
            for (Car car : cars) {
                if (iteration == 3) {
                    if (car instanceof Nitrous) {
                        car.speedUp();
                        ((Nitrous) car).useNitrousOxideEngine();
                    }
                } else {
                    car.speedUp();
                }
            }
            iteration++;
        }
    }
}
