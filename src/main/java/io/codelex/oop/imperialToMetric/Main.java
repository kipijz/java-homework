package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valueToConvert = new BigDecimal("10.5");

        BigDecimal result = MeasurementConverter.convert(ConversionType.CENTIMETERS_TO_INCHES, valueToConvert);

        System.out.println(result);
    }
}