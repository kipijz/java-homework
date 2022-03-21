package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class KilometerToMilesConverter extends UnitConverter {

    @Override
    public BigDecimal getCoefficient() {
        return new BigDecimal("0.621371192");
    }
}