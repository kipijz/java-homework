package io.codelex.arithmetic.exercises;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(sumDif(6, 9));
    }

    public static boolean sumDif(int a, int b) {
        if (a == 15 || b == 15 || a + b == 15 || a - b == 15 || b - a == 15) {
            return true;
        } else return false;
    }
}
