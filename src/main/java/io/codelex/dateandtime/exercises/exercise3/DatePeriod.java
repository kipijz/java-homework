package io.codelex.dateandtime.exercises.exercise3;

import java.time.LocalDate;
import java.util.List;

public class DatePeriod {
    private LocalDate startDate;
    private LocalDate endDate;

    public DatePeriod(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public DatePeriod intersection(DatePeriod datePassed) {
        List<LocalDate> listOfDates = this.startDate.datesUntil((this.endDate.plusDays(1))).toList();
        List<LocalDate> listOfDatesPassed = datePassed.startDate.datesUntil(datePassed.endDate.plusDays(1)).toList();

        LocalDate startDateForIntersection = findStartDate(listOfDates, listOfDatesPassed);
        LocalDate endDateForIntersection = findEndDate(listOfDates, listOfDatesPassed);

        return new DatePeriod(startDateForIntersection, endDateForIntersection);
    }

    private LocalDate findStartDate(List<LocalDate> listOfDates, List<LocalDate> listOfDatesPassed) {
        LocalDate startDateForIntersection = null;
        boolean foundStartDateForIntersection = false;
        for (int i = 0; i < listOfDates.size(); i++) {
            for (int j = 0; j < listOfDatesPassed.size(); j++) {
                if (listOfDates.get(i).isEqual(listOfDatesPassed.get(j))) {
                    startDateForIntersection = listOfDates.get(i);
                    foundStartDateForIntersection = true;
                    break;
                }
            }
            if (foundStartDateForIntersection) {
                break;
            }
        }
        return startDateForIntersection;
    }

    private LocalDate findEndDate(List<LocalDate> listOfDates, List<LocalDate> listOfDatesPassed) {
        LocalDate endDateForIntersection = null;
        for (int i = 0; i < listOfDates.size(); i++) {
            for (int j = 0; j < listOfDatesPassed.size(); j++) {
                if (listOfDates.get(i).isEqual(listOfDatesPassed.get(j))) {
                    endDateForIntersection = listOfDates.get(i);
                }
            }
        }
        return endDateForIntersection;
    }
}
