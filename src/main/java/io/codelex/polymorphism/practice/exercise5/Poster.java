package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int height;
    private int width;
    private int numberOfCopies;
    private int costPerCopy;
    private int rate;
    private boolean isPrimeLocation;

    public Poster(int fee, int height, int width, int numberOfCopies, int costPerCopy, boolean isPrimeLocation) {
        super(fee);
        this.height = height;
        this.width = width;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
        this.rate = numberOfCopies * costPerCopy;
        this.isPrimeLocation = isPrimeLocation;
    }

    @Override
    public int cost() {
        if (isPrimeLocation) {
            int subcharge = rate / 2;
            return super.cost() + rate + subcharge;
        } else {
            return super.cost() + rate;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " Poster width: " + width
                + " Poster height: " + height
                + " Poster copies: " + numberOfCopies
                + " Cost per copy: " + costPerCopy
                + " Cost per copy: " + costPerCopy
                + " rate=" + rate;
    }
}
