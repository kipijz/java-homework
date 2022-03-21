package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS (new MetersToYardsConverter()),
    YARDS_TO_METERS (new YardsToMetersConverter()),
    CENTIMETERS_TO_INCHES (new CmToInchesConverter()),
    INCHES_TO_CENTIMETERS (new InchesToCmConverter()),
    KILOMETERS_TO_MILES (new KilometerToMilesConverter()),
    MILES_TO_KILOMETERS (new MilesToKmConverter());

    public Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }
}
