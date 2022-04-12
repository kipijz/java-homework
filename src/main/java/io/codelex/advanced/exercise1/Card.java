package io.codelex.advanced.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    public static final BigDecimal LOW_FUNDS_WARNING_NUMBER = BigDecimal.valueOf(100);
    public static final BigDecimal BIG_FUNDS_WARNING_NUMBER = BigDecimal.valueOf(10000);
    private int cardNumber;
    private String owner;
    private int CCV;
    private BigDecimal balance;

    public Card(int cardNumber, String owner, int CCV, BigDecimal balance) {
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void addMoney(BigDecimal sum) {
        setBalance(getBalance().add(sum));
    }

    public void withdrawMoney(BigDecimal sum) throws NotEnoughFundsException {
        if (sum.compareTo(getBalance()) > 0) {
            throw new NotEnoughFundsException("Not enough funds in your account!");
        }
        setBalance(getBalance().subtract(sum));
    }
}
