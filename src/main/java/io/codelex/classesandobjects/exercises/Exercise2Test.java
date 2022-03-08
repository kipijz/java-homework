package io.codelex.classesandobjects.exercises;

import java.util.Scanner;

public class Exercise2Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;


        //Kods pirms metodes fillUp izveides

 /*       System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

        Exercise2 car = new Exercise2(startKilometers, endKilometers, liters);

        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
        if (car.gasHog()) System.out.println("This car is a gas hog");
        if (car.economyCar()) System.out.println("This car is a an economy car");



        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();
        Exercise2 car2 = new Exercise2(startKilometers, endKilometers, liters);

        System.out.println( "Kilometers per liter are "  + car2.calculateConsumption() );*/


        //Kods pēc metodes fillUp izveides

        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        Exercise2 car = new Exercise2(startKilometers);

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

        car.fillUp(endKilometers, liters);

        car.calculateConsumption();
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
        if (car.gasHog()) System.out.println("This car is a gas hog");
        if (car.economyCar()) System.out.println("This car is a an economy car");

        System.out.println();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

        car.fillUp(endKilometers, liters);

        car.calculateConsumption();
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
        if (car.gasHog()) System.out.println("This car is a gas hog");
        if (car.economyCar()) System.out.println("This car is a an economy car");

    }
}
