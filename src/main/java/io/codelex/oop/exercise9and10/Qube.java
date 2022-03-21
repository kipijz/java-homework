package io.codelex.oop.exercise9and10;

public class Qube extends Shape3D{
    private double height;

    public Qube(double height) {
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
        return height * 12;
    }

    @Override
    public double calculateArea() {
        return Math.pow(height, 2) * 6;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(height, 3);
    }
}
