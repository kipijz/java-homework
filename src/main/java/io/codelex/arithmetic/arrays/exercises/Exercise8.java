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
            String chosenWordGuessing;
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
            userGuess[index] = scanner.next().charAt(0);
            index++;
            System.out.println();

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");


            boolean gameBeingPlayed = true;
            do {
                boolean isCompleted = false;
                boolean totalMiss = true;


                System.out.print("Word: ");
                for (int i = 0; i < chosenWord.length(); i++) {
                    boolean match = false;
                    for (int j = 0; j < userGuess.length; j++) {
                        if (chosenWord.charAt(i) == userGuess[j]) {
                            System.out.print(userGuess[j]);
                            match = true;
                            break;
                        }
                    }
                    if (!match) {
                        System.out.print("_ ");
                    }
                }
                System.out.println();


                System.out.print("Misses: ");
                for (int i = 0; i < chosenWord.length(); i++) {
                    for (int j = 0; j < userGuess.length; j++) {
                        if (chosenWord.charAt(i) == userGuess[j]) {
                            totalMiss = false;
                            break;
                        }
                    }
                    if (!totalMiss) break;
                }

                if (totalMiss) {
                    allMisses += userGuess[index - 1];
                    System.out.println(allMisses);
                    maxTries--;
                }
                System.out.println();

                int howManyGuessed = 0;
                for (int i = 0; i < chosenWord.length(); i++) {
                    for (int j = 0; j < userGuess.length; j++) {
                        if (chosenWord.charAt(i) == userGuess[j]) {
                            howManyGuessed++;
                            break;
                        }
                    }
                }

                if (howManyGuessed == chosenWord.length()) isCompleted = true;
                if (isCompleted) {
                    System.out.println("YOU GOT IT");
                    System.out.println("Play again or quit?");
                    gameBeingPlayed = false;
                    if (!Objects.equals(scanner.next(), "again")) {
                        answer = "quit";
                        break;
                    }
                }

                if (maxTries < 0) {
                    System.out.println("No more tries");
                    System.out.println("Play again or quit?");
                    gameBeingPlayed = false;
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
}
