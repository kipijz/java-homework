package io.codelex.oop.shapes;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".##");

        Triangle triangle = new Triangle(5, 10);
        Rectangle rectangle = new Rectangle(20, 55);

        System.out.println("Width of triangle: " + triangle.getWidth() + " height of triangle: " + triangle.getHeight());
        System.out.println("The area triangle: " + df.format(triangle.getArea()) + " the perimeter of triangle: " + df.format(triangle.getPerimeter()));

        System.out.println();

        System.out.println("Width of rectangle: " + rectangle.getWidth() + " height of rectangle: " + rectangle.getHeight());
        System.out.println("The area rectangle: " + df.format(rectangle.getArea()) + " the perimeter of rectangle: " + df.format(rectangle.getPerimeter()));
    }
}
