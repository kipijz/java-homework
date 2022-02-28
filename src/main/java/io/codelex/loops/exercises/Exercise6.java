package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Max value? ");
        int userNumber = scanner.nextInt();
        fizzBuzz(userNumber);
    }

    public static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            boolean notDivided = true;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                notDivided = false;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                notDivided = false;
            }
            if (notDivided) {
                System.out.print(i);
            }

            System.out.print(" ");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
