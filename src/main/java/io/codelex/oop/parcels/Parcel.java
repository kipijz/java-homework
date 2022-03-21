package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    private static final int MAX_COMBINED_DIMENSIONS = 300;
    private static final int MIN_SIZE_DIMENSION = 30;
    private static final float MAX_WEIGHT_FOR_EXPRESS = 15.0f;
    private static final float MAX_WEIGHT_FOR_NON_EXPRESS = 30.0f;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public boolean validate() {
        boolean isValid = true;
        if (xLength + yLength + zLength > MAX_COMBINED_DIMENSIONS) {
            System.out.println("The sum of the dimensions exceeds 300!");
            isValid = false;
        }
        if (xLength < MIN_SIZE_DIMENSION || yLength < MIN_SIZE_DIMENSION || zLength < MIN_SIZE_DIMENSION) {
            System.out.println("One of dimensions is less than 30!");
            isValid = false;
        }
        if (!isExpress) {
            if (weight > MAX_WEIGHT_FOR_NON_EXPRESS) {
                System.out.println("Not express, the weight exceeds 30!");
                isValid = false;
            }
        } else {
            if (weight > MAX_WEIGHT_FOR_EXPRESS) {
                System.out.println("Is express, the weight exceeds 15!");
                isValid = false;
            }
        }
        return isValid;
    }
}
