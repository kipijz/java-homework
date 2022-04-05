package io.codelex.advanced.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(int cardNumber, String owner, int CCV, BigDecimal balance) {
        super(cardNumber, owner, CCV, balance);
    }

    @Override
    public void addMoney(BigDecimal sum) {
        super.addMoney(sum);
        if (getBalance().compareTo(Card.BIG_FUNDS_WARNING_NUMBER) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
