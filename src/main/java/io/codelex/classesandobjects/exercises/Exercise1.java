package io.codelex.classesandobjects.exercises;

public class Exercise1 {

    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    public Exercise1(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", " + "price " + priceAtStart + ", " + "amount " + amountAtStart);
    }
}
