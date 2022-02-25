package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        if (radius.doubleValue() > 0) {
            BigDecimal two = new BigDecimal("2");
            return Math.PI * (radius.multiply(two)).doubleValue();
        } else {
            System.out.println("Error, negative value!");
            return 0;
        }
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        if (length.doubleValue() > 0 || width.doubleValue() > 0) {
            return (length.multiply(width)).doubleValue();
        } else {
            System.out.println("Error, negative value!");
            return 0;
        }
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        if (base.doubleValue() > 0 || h.doubleValue() > 0) {
            return (base.multiply(h)).doubleValue() * 0.5;
        } else {
            System.out.println("Error, negative value!");
            return 0;
        }
    }
}
