package io.codelex.classesandobjects.practice;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.name = "Benson";
        bankAccount1.balance = 17.25;
        System.out.println(bankAccount1.toString());

        //check if 2 numbers after dot for the balance
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.name = "Hendo";
        bankAccount2.balance = -15;

        System.out.println("Should be negative with 2 numbers after dot: ");
        System.out.println(bankAccount2.toString());
    }
}
