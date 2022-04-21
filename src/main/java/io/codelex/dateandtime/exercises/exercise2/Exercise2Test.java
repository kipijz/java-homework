package io.codelex.dateandtime.exercises.exercise2;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input server launch date: ");
        LocalDate serverLaunchDay = addDate(scanner);

        System.out.println("Input update year: ");
        String updateYear = scanner.next();

        System.out.println("Input update month: ");
        String updateMonth = scanner.next();

        while (!checkUpdateDate(updateYear, updateMonth, serverLaunchDay)) {
            System.out.println("Input update year: ");
            updateYear = scanner.next();

            System.out.println("Input update month: ");
            updateMonth = scanner.next();
        }

        Update.updatesOn(serverLaunchDay, updateYear, updateMonth);


    }

    public static LocalDate addDate(Scanner scan) {
        return LocalDate.parse(scan.next());
    }


    //pārbauda vai update datums ir pirms vai pēc serverLaunchDay
    private static boolean checkUpdateDate(String updateYear, String updateMonth, LocalDate serverLaunchDay) {
        boolean isValidUpdateDate = true;
        String firstDay = "";
        if (serverLaunchDay.getDayOfMonth() < 10) {
            firstDay = "0" + serverLaunchDay.getDayOfMonth();
        } else {
            firstDay = String.valueOf(serverLaunchDay.getDayOfMonth());
        }
        StringBuilder updateMonthFullString = new StringBuilder();
        updateMonthFullString.append(updateYear).append("-").append(updateMonth).append("-").append(firstDay);
        LocalDate updateMonthAsDate = LocalDate.parse(updateMonthFullString);

        if (serverLaunchDay.isAfter(updateMonthAsDate)) {
            System.out.println("The server launch date is after the update date, enter the correct update date. ");
            isValidUpdateDate = false;
        }
        return isValidUpdateDate;
    }
}
