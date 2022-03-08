package io.codelex.classesandobjects.exercises;

public class Exercise1Test {
    public static void main(String[] args) {
        Exercise1 logitechMouse = new Exercise1("Logitech mouse", 70.00, 14);
        Exercise1 iphone5s = new Exercise1("iPhone 5s", 999.99, 3);
        Exercise1 epsonEB = new Exercise1("Epson EB-U05", 440.46, 1);

        logitechMouse.printProduct();
        iphone5s.printProduct();
        epsonEB.printProduct();

//        Changing the prices
        logitechMouse.setPriceAtStart(40.51);

//        Changing the qty
        epsonEB.setAmountAtStart(4);

        System.out.println("After changes: ");
        logitechMouse.printProduct();
        epsonEB.printProduct();
    }
}
