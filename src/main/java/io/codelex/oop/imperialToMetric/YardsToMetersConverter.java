package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class YardsToMetersConverter extends UnitConverter {

    @Override
    public BigDecimal getCoefficient() {
        return new BigDecimal("0.9144");
    }
}