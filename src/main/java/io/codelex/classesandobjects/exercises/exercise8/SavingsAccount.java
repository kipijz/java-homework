package io.codelex.classesandobjects.exercises.exercise8;

public class SavingsAccount {
    private double annualInterest;
    private double balance;
    private double depositCounter;
    private double withdrawCounter;
    private double interestCounter;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double withdrawAmount) {
        withdrawCounter += withdrawAmount;
        this.balance -= withdrawAmount;
    }

    public void deposit(double depositAmount) {
        depositCounter += depositAmount;
        this.balance += depositAmount;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public void addMonthlyInterest() {
        interestCounter += this.balance * (this.annualInterest) / 12;
        balance += balance * (this.annualInterest / 12);
    }

    public double getBalance() {
        return balance;
    }

    public double getDepositCounter() {
        return depositCounter;
    }

    public double getWithdrawCounter() {
        return withdrawCounter;
    }

    public double getInterestCounter() {
        return interestCounter;
    }
}
