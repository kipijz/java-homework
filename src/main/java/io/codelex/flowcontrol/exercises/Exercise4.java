package io.codelex.flowcontrol.exercises;

public class Exercise4 {
    public static void main(String[] args) {
        PrintDayInWord(2);
        PrintDayInWord(-4);
    }

    public static void PrintDayInWord(int dayNumber) {
        if (dayNumber >= 0 && dayNumber <= 6) {
            switch (dayNumber) {
                case 0 -> System.out.println("Monday");
                case 1 -> System.out.println("Tuesday");
                case 2 -> System.out.println("Wednesday");
                case 3 -> System.out.println("Thursday");
                case 4 -> System.out.println("Friday");
                case 5 -> System.out.println("Saturday");
                case 6 -> System.out.println("Sunday");
            }
        } else System.out.println("Not a valid day.");
    }
}

