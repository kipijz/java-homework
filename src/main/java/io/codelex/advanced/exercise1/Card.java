package io.codelex.advanced.exercise1;

public abstract class Card {
    public static final int LOW_FUNDS_WARNING_NUMBER = 100;
    public static final int BIG_FUNDS_WARNING_NUMBER = 10000;
    private int cardNumber;
    private String owner;
    private int CCV;
    private int balance;

    public Card(int cardNumber, String owner, int CCV, int balance) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.CCV = CCV;
        this.balance = balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCCV() {
        return CCV;
    }

    public void setCCV(int CCV) {
        this.CCV = CCV;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract void addMoney(int sum);

    public abstract void withdrawMoney(int sum) throws NotEnoughFundsException;
}
