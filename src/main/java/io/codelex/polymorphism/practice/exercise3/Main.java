package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Student jonJones = new Student("Jon", "Jones", "1001 S College St", 51817581, 2.50);
        Employee williamMacDougal = new Employee("William", "MacDougal", "131 Pine St", 44415698, "Janitor");

        jonJones.display();
        System.out.println("----------------");
        williamMacDougal.display();

    }
}
