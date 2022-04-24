package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class CmToInchesConverter extends UnitConverter {
    @Override
    public BigDecimal getCoefficient() {
        return new BigDecimal("0.393700787");
    }
}