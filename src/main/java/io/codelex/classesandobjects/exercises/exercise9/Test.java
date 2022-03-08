package io.codelex.classesandobjects.exercises.exercise9;

import static io.codelex.classesandobjects.exercises.exercise9.Point.swapPoints;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.getPointX() + ", " + p1.getPointY() + ")");
        System.out.println("(" + p2.getPointX() + ", " + p2.getPointY() + ")");
    }
}
