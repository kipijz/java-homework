package io.codelex.collections.exercise4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueName {

    public static void main(String[] args) {
        uniqueNameGame();
    }

    private static void uniqueNameGame() {
        LinkedHashSet<String> nameHashSet = new LinkedHashSet<>();
        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);

        while (shouldContinue) {
            System.out.print("Enter name: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                System.out.print("Unique name list contains: ");
                for (String element : nameHashSet) {
                    System.out.print(element + " ");
                }
                shouldContinue = false;
            } else {
                nameHashSet.add(userInput);
            }
        }
    }
}
