package io.codelex.classesandobjects.exercises.exercise9;

public class Point {
    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public static void swapPoints(Point one, Point two) {
        int tempX = one.pointX;
        int tempY = one.pointY;

        one.pointX = two.pointX;
        one.pointY = two.pointY;

        two.pointX = tempX;
        two.pointY = tempY;
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }
}
