package io.codelex.arithmetic.arrays.practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int[] myArray = new int[maxNumber - minNumber + 1];
        int index = 0;
        int sum = 0;

//        fixme

/*        for (int i = minNumber; i <= maxNumber; i++) {
            sum += i;
        }*/

        for (int i = minNumber; i <= maxNumber; i++) {
            myArray[index] = i;
            index++;
        }

        sum = IntStream.of(myArray).sum();

        System.out.println("The sum is " + sum);
    }
}
