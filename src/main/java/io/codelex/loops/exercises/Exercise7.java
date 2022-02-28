package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumberHolder; //so we can store the piglet() value without it changing
        int points = 0;

        System.out.println("Welcome to Piglet!");
        randomNumberHolder = piglet();
        points = randomNumberHolder;
        System.out.println("You rolled a " + randomNumberHolder + "!");

        while (true) {
            System.out.println("Roll again?");
            char userDecision = scanner.next().toLowerCase().charAt(0);
            if (userDecision == 'y') {
                randomNumberHolder = piglet();
                if (randomNumberHolder == 1) {
                    System.out.println("You rolled a " + randomNumberHolder + "!");
                    System.out.println("You got 0 points.");
                    points = 0;
                    break;
                } else {
                    System.out.println("You rolled a " + randomNumberHolder + "!");
                    points += randomNumberHolder;
                }
            } else {
                System.out.println("You got " + points + " points.");
                break;
            }
        }
    }

    public static int piglet() {
        return (int) ((Math.random() * 6) + 1);
    }
}
