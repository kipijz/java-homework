package io.codelex.advanced.exercise1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws NotEnoughFundsException {
        DebitCard debitCard = new DebitCard(4144, "Joe Holmes", 113, BigDecimal.valueOf(9999));
        CreditCard creditCard = new CreditCard(5551, "Jimmy Bob", 561, BigDecimal.valueOf(120));

        //prints a warning
        debitCard.addMoney(BigDecimal.valueOf(12));
        //throws exception
        creditCard.withdrawMoney(BigDecimal.valueOf(150));
    }
}
