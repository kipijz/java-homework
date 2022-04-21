package io.codelex.dateandtime.exercises.exercise2;

import java.time.LocalDate;

public class Update {
    public static void updatesOn(LocalDate serverLaunchDay, String updateYear, String updateMonth) {
        LocalDate updateMonthAsDate = createUpdateMonth(updateYear, updateMonth);
        LocalDate firstUpdateDate = null;
        LocalDate secondUpdateDate = null;
        boolean firstDateRecorded = false;

        while (true) {
            serverLaunchDay = serverLaunchDay.plusDays(14);
            if (firstDateRecorded) {
                secondUpdateDate = serverLaunchDay;
                System.out.println("Second update is on: " + secondUpdateDate);
                break;
            }
            //-1 diena tāpēc, ka, ja iekrīt 1. datumā update, lai viņš neskippo.
            if (serverLaunchDay.isAfter(updateMonthAsDate.minusDays(1))) {
                firstUpdateDate = serverLaunchDay;
                System.out.println("First update is on: " + firstUpdateDate);
                firstDateRecorded = true;
            }
        }
    }
    public static LocalDate createUpdateMonth(String updateYear, String updateMonth) {
        StringBuilder updateMonthFullString = new StringBuilder();
        updateMonthFullString.append(updateYear).append("-").append(updateMonth).append("-").append("01");
        return LocalDate.parse(updateMonthFullString);
    }
}
