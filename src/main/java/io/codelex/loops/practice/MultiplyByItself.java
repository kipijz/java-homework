package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i;
        int n;
        int multiplyNumber;

        System.out.print("Input number of terms (first i, second n) : ");
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        n = in.nextInt();
        multiplyNumber = i;

//        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (int j = 0; j < n; j++) {
            i *= multiplyNumber;
        }
        System.out.println(i);
    }

}
