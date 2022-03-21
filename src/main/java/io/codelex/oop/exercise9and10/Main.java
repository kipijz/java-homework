package io.codelex.oop.exercise9and10;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.13, 10);
        Triangle triangle = new Triangle(10, 10);
        Hexagon hexagon = new Hexagon(41.5);
        Cone cone = new Cone(10, 8);
        Qube qube = new Qube(415.12);

        System.out.printf("Perimeter of the rectangle: %.2f %n", rectangle.calculatePerimeter());
        System.out.printf("Area of the triangle: %.2f %n", triangle.calculateArea());
        System.out.printf("Area of the hexagon: %.2f %n", hexagon.calculateArea());
        System.out.printf("Volume of the cone: %.2f %n", cone.calculateVolume());
        System.out.printf("Perimeter of the cube: %.2f %n", qube.calculatePerimeter());
    }
}
