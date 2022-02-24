package io.codelex.typesandvariables.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.########");

        int metersInput;
        int hoursInput;
        int minutesInput;
        int secondsInput;

        double kilometers;
        double miles;

        int totalSeconds;
        double totalHours;

        double metersSecond;
        double kilometersHour;
        double milesSecond;

        System.out.println("Input distance in meters: ");
        metersInput = scanner.nextInt();
        System.out.println("Input hours: ");
        hoursInput = scanner.nextInt();
        System.out.println("Input minutes: ");
        minutesInput = scanner.nextInt();
        System.out.println("Input seconds: ");
        secondsInput = scanner.nextInt();

        totalSeconds = (hoursInput * 3600) + (minutesInput * 60) + secondsInput;
        totalHours = ((double) secondsInput / 3600) + ((double) minutesInput / 60) + hoursInput;

        kilometers = (double) metersInput / 1000;
        miles = (double) metersInput / 1609;

        metersSecond = (double) metersInput / totalSeconds;
        kilometersHour = kilometers / totalHours;
        milesSecond = miles / totalHours;

        System.out.println("Your speed in meters/second is " + df.format(metersSecond));
        System.out.println("Your speed in km/h is " + df.format(kilometersHour)); //Sanāk 0.4208951, nevis 0.42089513 noapaļošanas dēļ? That's ok?
        System.out.println("Your speed in miles/h is " + df.format(milesSecond));


    }
}
