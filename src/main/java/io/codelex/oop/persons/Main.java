package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Brown", "1415", 41, "Accountant", LocalDate.of(2015, 03, 01));
        System.out.println(employee.getInfo());

        System.out.println();

        Customer customer = new Customer("Peter", "Brown", "CID1234", 13, "CID1234", 10);
        System.out.println(customer.getInfo());
    }
}
