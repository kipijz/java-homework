package io.codelex.loops.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        int size = 5;
        for (int rows = 0; rows < size; rows++) {
            for (int forward = size * 4 - 4; forward > rows * 4; forward--) {
                System.out.print("/");
            }
            for (int stars = 0; stars < rows * 8; stars++) {
                System.out.print("*");
            }
            for (int backward = size * 4 - 4; backward > rows * 4; backward--) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
