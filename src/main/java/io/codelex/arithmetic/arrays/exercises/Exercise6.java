package io.codelex.arithmetic.arrays.exercises;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
/*
        Create an array of ten integers
        Fill the array with ten random numbers (1-100)
        Copy the array into another array of the same capacity
        Change the last value in the first array to a -7
        Display the contents of both arrays
*/
        Random randomNumber = new Random();

        int[] firstArray = new int[10];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = randomNumber.nextInt(100) + 1;
        }

        int[] secondArray = firstArray.clone();

        firstArray[firstArray.length - 1] = 7;

        System.out.println("Array 1: " + Arrays.toString(firstArray));
        System.out.println("Array 2: " + Arrays.toString(secondArray));

    }
}
