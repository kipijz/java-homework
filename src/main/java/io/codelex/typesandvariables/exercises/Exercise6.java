package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        while (true) {
            System.out.println("Enter the first  digit: ");
            number1 = scanner.nextInt();
            if (number1 > 9 || number1 < -9) {
                System.out.println("Not a digit, try again.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Enter the second  digit: ");
            number2 = scanner.nextInt();
            if (number2 > 9 || number2 < -9) {
                System.out.println("Not a digit, try again.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Enter the third  digit: ");
            number3 = scanner.nextInt();
            if (number3 > 9 || number3 < -9) {
                System.out.println("Not a digit, try again.");
                continue;
            }
            break;
        }

        int numberSum = number1 + number2 + number3;

        System.out.println("The sum is: " + numberSum);
    }
}
