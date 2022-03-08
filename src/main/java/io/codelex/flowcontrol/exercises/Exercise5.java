package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        phoneKeyPad();
    }

    private static void phoneKeyPad() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userInput = scanner.next().toLowerCase();

        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isLetter(userInput.charAt(i))) {
                switch (userInput.charAt(i)) {
                    case 'a', 'b', 'c' -> System.out.print("2");
                    case 'd', 'e', 'f' -> System.out.print("3");
                    case 'g', 'h', 'i' -> System.out.print("4");
                    case 'j', 'k', 'l' -> System.out.print("5");
                    case 'm', 'n', 'o' -> System.out.print("6");
                    case 'p', 'q', 'r', 's' -> System.out.print("7");
                    case 't', 'u', 'v' -> System.out.print("8");
                    case 'w', 'x', 'y', 'z' -> System.out.print("9");
                }
            }
        }
    }
}