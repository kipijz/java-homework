package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesInYear = 525600;
        int minutesInDay = 1440;
        int days;
        int years;


        System.out.println("Enter the minutes: ");
        int minutesInput = scanner.nextInt();

        years = minutesInput / minutesInYear;
        days = (minutesInput % 525600) / minutesInDay;

        System.out.println("Years: " + years + " Days: " + days);

    }
}
