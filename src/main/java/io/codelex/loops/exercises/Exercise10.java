package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Min? ");
        int minInput = scanner.nextInt();

        System.out.print("Max? ");
        int maxInput = scanner.nextInt();

        for (int i = minInput; i <= maxInput; i++) {

            for (int j = i; j <= maxInput; j++) {
                System.out.print(j);
            }

            for (int j = minInput; j < i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

