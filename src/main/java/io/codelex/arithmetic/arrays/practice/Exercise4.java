package io.codelex.arithmetic.arrays.practice;

public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

//        fixme - check if contains number 1245

        boolean doesntContain = true;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1245) {
                System.out.println("Contains!");
                doesntContain = false;
            }
        }
        if (doesntContain) System.out.println("Doesn't contain!");

    }
}
