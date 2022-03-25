package io.codelex.collections.exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        happyNumberGame();
    }

    private static void happyNumberGame() {
        ArrayList<Integer> arrayListForSum = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's happy: ");
        String userNumber = scanner.nextLine();

        arrayListForSum.add(addFirstSum(userNumber));
        if (isHappy(arrayListForSum)) {
            System.out.println(userNumber + " is happy!");
        } else {
            System.out.println(userNumber + " is not happy!");
        }
    }

    //Pārvērš pirmo nr par string, lai varētu visu skaitļu 2. pakāpes saskaitīt
    private static int addFirstSum(String userNumber) {
        int firstNumberSum = 0;
        for (int i = 0; i < userNumber.length(); i++) {
            int j = Character.digit(userNumber.charAt(i), 10);
            firstNumberSum += Math.pow(j, 2);
        }
        return firstNumberSum;
    }

    private static boolean isHappy(ArrayList<Integer> arrayListForSum) {
        boolean isHappy = false;

        while (true) {
            //Unhappy number ends in a cycle of repeating numbers which contain 4
            String latestSumAsString = String.valueOf(arrayListForSum.get(arrayListForSum.size() - 1));
            int latestNumberSum = 0;
            for (int i = 0; i < latestSumAsString.length(); i++) {
                int j = Character.digit(latestSumAsString.charAt(i), 10);
                latestNumberSum += Math.pow(j, 2);
            }
            if (latestNumberSum == 1) {
                isHappy = true;
                break;
            } else if (latestNumberSum == 4) {
                break;
            } else {
                arrayListForSum.add(latestNumberSum);
            }
        }
        return isHappy;
    }
}