package io.codelex.oop.exercise9and10;

public class Hexagon extends Shape{
    private double height;

    public Hexagon(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return height * 6;
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(height, 2);
    }
}
