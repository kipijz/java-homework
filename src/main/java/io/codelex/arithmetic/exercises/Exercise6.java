package io.codelex.arithmetic.exercises;

public class Exercise6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 110; i++) {
            boolean isMultiple = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                isMultiple = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                isMultiple = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                isMultiple = true;
            }

            if (!isMultiple) {
                System.out.print(i);
            }

            System.out.print(" ");

            if (i % 11 == 0) {
                System.out.println(" ");

            }

        }
    }
}
