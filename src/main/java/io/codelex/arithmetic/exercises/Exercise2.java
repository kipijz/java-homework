package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's even or odd: ");
        int userNumber = scanner.nextInt();
        CheckOddEven(userNumber);
    }

    public static void CheckOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else System.out.println("Odd Number");
        System.out.println("bye!");
    }
}
