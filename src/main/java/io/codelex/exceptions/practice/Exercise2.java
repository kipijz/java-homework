package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        exercise2.methodA();
    }

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("A");
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println("B");
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            int divided = 21 / 0;
        } catch (ArithmeticException e) {
            System.out.println("C");
        }
    }
}
