package io.codelex.arithmetic.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        calcWage(7.5, 35);
        calcWage(8.2, 47);
        calcWage(10, 73);
    }

    public static void calcWage(double pay, int hoursWorked) {
        if (pay < 8.00) {
            System.out.println("Error, the wage is less than the minimum wage.");
        } else if (hoursWorked > 60) {
            System.out.println("Error, hours exceed 60.");
        } else {
            int overtimeHours = hoursWorked % 40;
            double totalPay = (pay * hoursWorked) + (overtimeHours * (pay * 1.5));
            System.out.println("You get paid: $" + totalPay);
        }

    }
}
