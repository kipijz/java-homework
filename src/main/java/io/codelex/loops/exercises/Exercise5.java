package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scanner.next();

        System.out.println("Enter second word:");
        String secondWord = scanner.next();


        System.out.print(firstWord);

        int totalLineLength = 30;
        int dotNum = totalLineLength - firstWord.length() - secondWord.length();

        for (int i = 0; i < dotNum; i++) {
            System.out.print(".");
        }

        System.out.println(secondWord);

    }
}
