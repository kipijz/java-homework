package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee extends Person {
    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate now = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(startedWorking, now);
    }


    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + this.position + " (" + getWorkExperience() + " years) ";
    }
}
