package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int firstRoll;
        int secondRoll;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Desired sum: ");
        int userInput = scanner.nextInt();

        firstRoll = roll();
        secondRoll = roll();

        while (true) {
            if (firstRoll + secondRoll == userInput) {
                System.out.println(firstRoll + " and " + secondRoll + " = " + userInput);
                break;
            } else {
                rollOutput(firstRoll, secondRoll);
                firstRoll = roll();
                secondRoll = roll();
            }
        }

    }

    public static int roll() {
        Random diceRoll = new Random();
        return diceRoll.nextInt(6) + 1;
    }

    public static void rollOutput(int firstRoll, int secondRoll) {
        int rollSum = firstRoll + secondRoll;
        System.out.println(firstRoll + " and " + secondRoll + " = " + rollSum);
    }

}
