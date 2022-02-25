package io.codelex.arithmetic.exercises;

public class Exercise9 {
    public static void main(String[] args) {
        BMICalculator(300, 190.55);
    }

    public static void BMICalculator(double kilos, double centimeters) {
        double pounds = kilos * 2.20462;
        double inches = centimeters * 0.393701;

        double bodyMassIndex = (pounds * 703) / Math.pow(inches, 2);

        if (18.5 < bodyMassIndex && bodyMassIndex < 25) {
            System.out.printf("Your BMI is: %.2f (Optimal range)", bodyMassIndex);
        } else if (bodyMassIndex < 18.5) {
            System.out.printf("Your BMI is: %.2f (Underweight)", bodyMassIndex);
        } else System.out.printf("Your BMI is: %.2f (Overweight)", bodyMassIndex);

    }
}
