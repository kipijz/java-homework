package io.codelex.advanced.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(int cardNumber, String owner, int CCV, BigDecimal balance) {
        super(cardNumber, owner, CCV, balance);
    }

    @Override
    public void withdrawMoney(BigDecimal sum) throws NotEnoughFundsException {
        super.withdrawMoney(sum);
        if (getBalance().compareTo(Card.LOW_FUNDS_WARNING_NUMBER) < 0) {
            System.out.println("Warning: Low funds");
        }
    }
}
