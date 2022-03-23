package io.codelex.dateandtime.exercises.exercise1;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first date: ");
        LocalDate date1 = addDate(scanner);

        System.out.println("Input second date: ");
        LocalDate date2 = addDate(scanner);

        Work.calculateHours(date1, date2);

    }

    private static LocalDate addDate(Scanner scan) {
        return LocalDate.parse(scan.next());
    }
}
