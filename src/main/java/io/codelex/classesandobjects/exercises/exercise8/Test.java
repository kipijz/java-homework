package io.codelex.classesandobjects.exercises.exercise8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double balance;
        double annualInterest;
        double interestEarned;
        double deposit;
        double depositCounter;
        double withdraw;
        double withdrawCounter;
        int monthsPassed;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money is in the account?: ");
        balance = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        annualInterest = scanner.nextDouble();

        System.out.println("How long has the account been opened? ");
        monthsPassed = scanner.nextInt();

        SavingsAccount savingsaccount1 = new SavingsAccount(balance);
        savingsaccount1.setAnnualInterest(annualInterest);

        for (int i = 1; i <= monthsPassed; i++) {
            System.out.print("Enter amount deposited for month: " + i + ": ");
            deposit = scanner.nextDouble();
            savingsaccount1.deposit(deposit);

            System.out.print("Enter amount withdrawn for month: " + i + ": ");
            withdraw = scanner.nextDouble();
            savingsaccount1.withdraw(withdraw);

            savingsaccount1.addMonthlyInterest();
        }

        System.out.printf("\nTotal deposited: $%.2f", savingsaccount1.getDepositCounter());
        System.out.printf("\nTotal withdrawn: $%.2f", savingsaccount1.getWithdrawCounter());
        System.out.printf("\nInterest earned: $%.2f", savingsaccount1.getInterestCounter());
        System.out.printf("\nEnding balance: $%.2f", savingsaccount1.getBalance());

    }
}
