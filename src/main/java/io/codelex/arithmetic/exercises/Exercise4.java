package io.codelex.arithmetic.exercises;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(Product1ToN());
    }

    public static int Product1ToN() {
        int intSum = 1;
        for (int i = 2; i <= 10; i++) {
            intSum *= i;
        }
        return intSum;
    }
}
