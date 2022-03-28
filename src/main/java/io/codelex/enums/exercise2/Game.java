package io.codelex.enums.exercise2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static int userWins;
    private static int computerWins;
    private static int numberOfTrials;
    private static MoveChoice computerChoice;


    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean beingPlayed = true;

        System.out.println("Let us begin...");
        while (beingPlayed) {
            boolean isInputValid;
            MoveChoice userChoice;
            do {
                System.out.println("Scissor-Paper-Stone");
                System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
                userChoice = userTurn(scanner);
                if (userChoice == null) {
                    System.out.println("Invalid input, try again...");
                    isInputValid = false;
                } else {
                    isInputValid = true;
                }
            } while (!isInputValid);

            if (userChoice == MoveChoice.QUIT) {
                endGameResults();
                beingPlayed = false;
            } else {
                computerTurn();
                whoWonTurn(userChoice, computerChoice);
            }
        }
    }

    private static MoveChoice userTurn(Scanner sc) {
        MoveChoice userChoice;
        char userInput = sc.next().charAt(0);
        switch (userInput) {
            case 's' -> userChoice = MoveChoice.SCISSOR;
            case 'p' -> userChoice = MoveChoice.PAPER;
            case 't' -> userChoice = MoveChoice.STONE;
            case 'q' -> userChoice = MoveChoice.QUIT;
            default -> userChoice = null;
        }
        return userChoice;
    }

    private static void computerTurn() {
        int computerRandomNumber = new Random().nextInt(3);
        ArrayList<MoveChoice> computerChoicesArrayList = new ArrayList<>();
        computerChoicesArrayList.add(MoveChoice.SCISSOR);
        computerChoicesArrayList.add(MoveChoice.PAPER);
        computerChoicesArrayList.add(MoveChoice.STONE);
        computerChoice = computerChoicesArrayList.get(computerRandomNumber);
        System.out.print("My turn: " + computerChoice + "\n");
    }

    private static void whoWonTurn(MoveChoice userTurn, MoveChoice computerTurn) {
        numberOfTrials++;
        if (userTurn == computerTurn) {
            System.out.println("TIE" + "\n");
        } else if (userTurn == MoveChoice.PAPER && computerTurn == MoveChoice.SCISSOR) {
            System.out.println("Scissor cuts paper, I won!" + "\n");
            computerWins++;
        } else if (userTurn == MoveChoice.PAPER && computerTurn == MoveChoice.STONE) {
            System.out.println("You won!" + "\n");
            userWins++;
        } else if (userTurn == MoveChoice.SCISSOR && computerTurn == MoveChoice.STONE) {
            System.out.println("Stone breaks scissor, I won!" + "\n");
            computerWins++;
        } else if (userTurn == MoveChoice.SCISSOR && computerTurn == MoveChoice.PAPER) {
            System.out.println("You won!" + "\n");
            userWins++;
        } else if (userTurn == MoveChoice.STONE && computerTurn == MoveChoice.PAPER) {
            System.out.println("Paper wraps around stone, I won!" + "\n");
            computerWins++;
        } else if (userTurn == MoveChoice.STONE && computerTurn == MoveChoice.SCISSOR) {
            System.out.println("You won!" + "\n");
            userWins++;
        }
    }

    private static void endGameResults() {
        DecimalFormat df = new DecimalFormat("#.00");
        double userWinPercentage = ((double) userWins / (double) numberOfTrials) * 100;
        double computerWinPercentage = ((double) computerWins / (double) numberOfTrials) * 100;
        System.out.println("Number of trials: " + numberOfTrials);
        System.out.println("I won " + computerWins + "(" + df.format(computerWinPercentage) + "%). You won " + userWins + "(" + df.format(userWinPercentage) + "%).");
        System.out.println("Bye!");
    }
}
