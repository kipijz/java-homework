package io.codelex.oop.exercise9and10;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return width + height + hypotenuse;
    }

    @Override
    public double calculateArea() {
        return (width * height) / 2.0;
    }
}
