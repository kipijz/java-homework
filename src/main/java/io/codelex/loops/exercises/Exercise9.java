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

        Random diceRoll = new Random();

        firstRoll = diceRoll.nextInt(6) + 1;
        secondRoll = diceRoll.nextInt(6) + 1;

        while (true){
            if (firstRoll + secondRoll == userInput) {
                System.out.println(firstRoll + " and " + secondRoll + " = " + userInput);
                break;
            }
            else {
                int rollSum = firstRoll + secondRoll;
                System.out.println(firstRoll + " and " + secondRoll + " = " + rollSum);
                firstRoll = diceRoll.nextInt(6) + 1;
                secondRoll = diceRoll.nextInt(6) + 1;
            }
        }
    }
}
