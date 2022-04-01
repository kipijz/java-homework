package io.codelex.advanced.exercise1;

public class DebitCard extends Card {
    public DebitCard(int cardNumber, String owner, int CCV, int balance) {
        super(cardNumber, owner, CCV, balance);
    }

    @Override
    public void addMoney(int sum) {
        setBalance(getBalance() + sum);
        if (getBalance() > Card.BIG_FUNDS_WARNING_NUMBER) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void withdrawMoney(int sum) throws NotEnoughFundsException {
        if (sum > getBalance()) {
            throw new NotEnoughFundsException("Not enough funds in your account!");
        } else {
            setBalance(getBalance() - sum);
        }
    }
}
