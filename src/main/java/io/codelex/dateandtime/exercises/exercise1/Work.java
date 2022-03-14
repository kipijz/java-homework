package io.codelex.dateandtime.exercises.exercise1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Work {
    public static void calculateHours(LocalDate one, LocalDate two) {
        int workedDays = 0;
        int totalWorkedDays;
        final int WORKED_HOURS = 8;

        for (LocalDate date = one; !date.isAfter(two); date = date.plusDays(1)) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workedDays++;
            }
        }

        totalWorkedDays = workedDays * WORKED_HOURS;

        System.out.println("The employee has worked: " + totalWorkedDays + " hours!");
        System.out.println("First day: " + one + ", last day: " + two);
    }
}
