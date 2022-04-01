package io.codelex.advanced.exercise1;

public class Main {
    public static void main(String[] args) throws NotEnoughFundsException {
        DebitCard debitCard = new DebitCard(4144, "Joe Holmes", 113, 9999);
        CreditCard creditCard = new CreditCard(5551, "Jimmy Bob", 561, 120);

        //prints a warning
        debitCard.addMoney(12);
        //throws exception
        creditCard.withdrawMoney(150);
    }
}
