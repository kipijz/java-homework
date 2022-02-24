package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int uppercaseCounter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userInput = scanner.next();

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == userInput.toUpperCase().charAt(i)) {
                uppercaseCounter++;
            };
        }

        System.out.println("Number of uppercase letters in the given string: " + uppercaseCounter);


    }
}
