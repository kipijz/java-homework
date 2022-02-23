package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        //fixme - should be 15 :| 
        int sum = a + b + c + d + e;
        System.out.println(sum);
    }

    private static void second() {
        float a = 1;
        float b = 2;
        float c = 3;
        float d = 4.2f;
        float e = 5.3f;

        //fixme - should be 15.5 :| 
        float sum = a + b + c + d + e;
        System.out.println(sum);
    }
}
