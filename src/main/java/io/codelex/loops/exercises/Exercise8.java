package io.codelex.loops.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        int size = 3;
        int totalWidth = 8;
        int halfOfTotalWidth = 4;

        for (int rows = 0; rows < size; rows++) {
            for (int forward = size * halfOfTotalWidth - halfOfTotalWidth; forward > rows * halfOfTotalWidth; forward--) {
                System.out.print("/");
            }
            for (int stars = 0; stars < rows * totalWidth; stars++) {
                System.out.print("*");
            }
            for (int backward = size * halfOfTotalWidth - halfOfTotalWidth; backward > rows * halfOfTotalWidth; backward--) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
