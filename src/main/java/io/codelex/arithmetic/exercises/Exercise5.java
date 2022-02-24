package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        int randomNumber = (int) ((Math.random() * 100) + 1);

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        userNumber = scanner.nextInt();

        if (userNumber == randomNumber) System.out.println("You guessed it!  What are the odds?!?");
        else if (userNumber > randomNumber) System.out.println("Sorry, you are too high.  I was thinking of " + randomNumber);
        else System.out.println("Sorry, you are too low.  I was thinking of " + randomNumber);
    }
}
