package io.codelex.oop.cars;

import java.util.ArrayList;

public class Main {
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

        System.out.println("Cybertruck is manufactured in: " );
        for (int i = 0; i < manufacturersForCybertruck.size(); i++) {
            System.out.println(manufacturersForCybertruck.get(i).getName());
        }

        System.out.println("-----------------");

        System.out.println("The Kopeyka is made in: " + kopeyka.getYearOfManufacture() + " and has a: " + kopeyka.getEngineType());
    }
}
