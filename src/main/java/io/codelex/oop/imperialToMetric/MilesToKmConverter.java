package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class MilesToKmConverter extends UnitConverter {
    @Override
    public BigDecimal getCoefficient() {
        return new BigDecimal("1.609344");
    }
}