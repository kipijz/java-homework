package io.codelex.oop.exercise9and10;

public class Cone extends Shape3D{
    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //balstoties uz šito konusam nemaz nevar aprēķināt perimetru? aprēķināju perimetru tikai bāzei. https://www.quora.com/What-is-the-perimeter-of-a-cone
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
}
