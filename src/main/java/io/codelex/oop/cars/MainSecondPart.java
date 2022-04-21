package io.codelex.oop.cars;

import java.util.ArrayList;

public class MainSecondPart {
    public static void main(String[] args) {
        Manufacturer stellantis = new Manufacturer("Stellantis", 2021, "USA");
        Manufacturer toyota = new Manufacturer("Toyota Motor Corp", 1980, "Portugal");
        Manufacturer generalMotors = new Manufacturer("General Motors Co", 1987, "Spain");
        Manufacturer daimler = new Manufacturer("Daimler AG", 1997, "Sweden");


        ArrayList<Manufacturer> manufacturersForCybertruck = new ArrayList<>();
        manufacturersForCybertruck.add(stellantis);
        manufacturersForCybertruck.add(toyota);
        manufacturersForCybertruck.add(generalMotors);
        manufacturersForCybertruck.add(daimler);

        ArrayList<Manufacturer> manufacturersForKopeyka = new ArrayList<>();
        manufacturersForKopeyka.add(stellantis);
        manufacturersForKopeyka.add(toyota);

        Car cybertruck = new Car("Cybertruck", "Tesla", 41000, 2021, manufacturersForCybertruck, EngineType.V12);
        Car kopeyka = new Car("Kopeyka", "LADA", 2415, 1975, manufacturersForKopeyka, EngineType.V6);


        ArrayList<Car> carList = new ArrayList<>();

        CarService carService = new CarService(carList);

        // 1. adding cars to the list,
        carService.addCarToList(kopeyka);

        // 2. removing a car from the list,
        carService.removeCarFromList(kopeyka);


        carService.addCarToList(kopeyka);
        carService.addCarToList(cybertruck);

        // 3. returning a list of all cars,
        carService.returnCarList();

        // 4. returning cars with a V12 engine,
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("With (user given engine type): ");
        carService.returnCarListWithGivenEngine(EngineType.V12);

        // 5. returning cars produced before 1999,
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Produced before (user given year): ");
        carService.returnCarListBeforeGivenYear(1999);

        // 6. returning the most expensive car,
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Most expensive car: ");
        carService.returnMostExpensiveCar();

        // 7. returning the cheapest car,
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Cheapest car: ");
        carService.returnCheapestCar();

        // 8. returning the car with at least 3 manufacturers,
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("At least (user given count) manufacturers: ");
        carService.returnCarListAtLeastGivenManufacturers(3);

        // 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
        //sorting by name of the car
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Ascending: ");
        carService.returnCarListSorted("ascending");
        System.out.println("Descending: ");
        carService.returnCarListSorted("descending");

        // 10. checking if a specific car is on the list,
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Is on list: ");
        carService.isCarOnList("Kopeyka");
        System.out.println("Is not on list: ");
        carService.isCarOnList("Civic");

        // 11. returning a list of cars manufactured by a specific manufacturer,
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Manufactured by Stellantis: ");
        carService.manufacturedBy("Stellantis");
        System.out.println("Manufactured by Daimler AG: ");
        carService.manufacturedBy("Daimler AG");

        // 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        carService.manufacturedYearComparing("Stellantis", 2021);


    }
}
