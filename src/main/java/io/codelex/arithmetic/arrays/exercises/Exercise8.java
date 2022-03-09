package io.codelex.arithmetic.arrays.exercises;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        String answer = "again";

        do {
            Scanner scanner = new Scanner(System.in);
            String[] listOfWords = {"Kakis", "Suns", "Zivis", "Pele", "Flamingo"};
            Random randomNumber = new Random();
            String chosenWord = listOfWords[randomNumber.nextInt(listOfWords.length)];
            String allMisses = "";
//            System.out.println(chosenWord);
            int maxTries = 10;
            char[] userGuess = new char[chosenWord.length() + maxTries];
            int index = 0;


            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            System.out.print("Word: ");
            for (int i = 0; i < chosenWord.length(); i++) {
                System.out.print("_ ");
            }
            System.out.println();


            System.out.println("Misses: ");
            System.out.println();


            System.out.print("Guess: ");
            userGuess[index] = scanner.next().toLowerCase().charAt(0);
            index++;
            System.out.println();

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");


            boolean gameBeingPlayed = true;
            do {
                boolean isCompleted = false;
                boolean totalMiss = true;


                System.out.print("Word: ");

                printWord(chosenWord, userGuess);

                System.out.println();


                System.out.print("Misses: ");

                for (int i = 0; i < chosenWord.length(); i++) {
                    if (chosenWord.toLowerCase().charAt(i) == userGuess[index - 1]) {
                        totalMiss = false;
                        break;
                    }
                }

                if (totalMiss) {
                    allMisses += userGuess[index - 1];
                    System.out.println(allMisses);
                    maxTries--;
                }
                if (!totalMiss) {
                    System.out.println(allMisses);
                }

                System.out.println();


                int howManyGuessed = howManyGuessedMethod(chosenWord, userGuess);

                if (howManyGuessed == chosenWord.length()) {
                    isCompleted = true;
                }

                if (isCompleted) {
                    gameBeingPlayed = guessedTheWordMethod();
                    if (!Objects.equals(scanner.next(), "again")) {
                        answer = "quit";
                        break;
                    }
                }

                if (maxTries < 0) {
                    gameBeingPlayed = failedToGuessTheWordMethod();
                    if (!Objects.equals(scanner.next(), "again")) {
                        answer = "quit";
                        break;
                    }
                }
                System.out.print("Guess: ");

                if (gameBeingPlayed) {
                    userGuess[index] = scanner.next().charAt(0);
                    index++;
                    System.out.println();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                }


            } while (gameBeingPlayed);
        } while (answer.equals("again"));
    }

    private static void printWord(String chosenWord, char[] userGuess) {
        for (int i = 0; i < chosenWord.length(); i++) {
            boolean match = false;
            for (int j = 0; j < userGuess.length; j++) {
                if (chosenWord.toLowerCase().charAt(i) == userGuess[j]) {
                    System.out.print(chosenWord.charAt(i));
                    match = true;
                    break;
                }
            }
            if (!match) {
                System.out.print("_ ");
            }
        }
    }

    public static int howManyGuessedMethod(String chosenWord, char[] userGuess) {
        int howManyGuessed = 0;
        for (int i = 0; i < chosenWord.length(); i++) {
            for (int j = 0; j < userGuess.length; j++) {
                if (chosenWord.toLowerCase().charAt(i) == userGuess[j]) {
                    howManyGuessed++;
                    break;
                }
            }
        }
        return howManyGuessed;
    }

    public static  boolean guessedTheWordMethod() {
        System.out.println("YOU GOT IT");
        System.out.println("Play again or quit?");
        return false;
    }

    public static  boolean failedToGuessTheWordMethod() {
        System.out.println("No more tries");
        System.out.println("Play again or quit?");
        return false;
    }


}
