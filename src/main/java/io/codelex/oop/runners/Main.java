package io.codelex.oop.runners;

public class Main {
    public static void main(String[] args) {
        System.out.println("Returns advanced: ");
        System.out.println(Runner.getFitnessLevel(35));
        System.out.println("Returns intermediate: ");
        System.out.println(Runner.getFitnessLevel(45));
        System.out.println("Returns beginner: ");
        System.out.println(Runner.getFitnessLevel(70));
    }
}
