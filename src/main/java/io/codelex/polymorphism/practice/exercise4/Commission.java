package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly{

    private double totalSales;
    private double commissionRateForEmployee;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRateForEmployee) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRateForEmployee = commissionRateForEmployee;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment =  super.pay() + totalSales * commissionRateForEmployee;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}
