package io.codelex.classesandobjects.practice;

public class AccountTest {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account",100.00);
        bartosAccount.deposit(20);
        System.out.println(bartosAccount.toString());

        System.out.println("------------------------------");

        Account mattsAccount = new Account("Matt's account",1000);
        Account myAccount = new Account("My account",1000);
        mattsAccount.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(mattsAccount.toString());
        System.out.println(myAccount.toString());

        System.out.println("------------------------------");

        Account A = new Account("A",100);
        Account B = new Account("B",0);
        Account C = new Account("C",0);

        Account.transfer(A, B, 50);
        Account.transfer(B, C, 25);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

    }
}
