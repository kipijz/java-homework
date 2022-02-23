package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name;
        String Eyes;
        String Teeth;
        String Hair;
        int Age;
        int Height;
        int Weight;
        double HeightCm;
        double WeightKg;

        Name = "Zed A. Shaw";
        Age = 35;
        Height = 74;  // inches
        Weight = 180; // lbs
        HeightCm = Math.floor((Height * 2.54) * 100) / 100;
        WeightKg = Math.floor((Weight * 0.453592) * 100) / 100;
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + Height + " inches tall.");
        System.out.println("He's " + Weight + " pounds heavy.");
        System.out.println("Height in cm: " + HeightCm + " Weight in kg: " + WeightKg);
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");
        System.out.println("If I add " + Age + ", " + Height + ", and " + Weight + " I get " + (Age + Height + Weight) + ".");
    }
}