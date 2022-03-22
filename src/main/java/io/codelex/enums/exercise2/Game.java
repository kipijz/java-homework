package io.codelex.enums.exercise2;

import org.apache.commons.lang3.mutable.MutableInt;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        MutableInt userWins = new MutableInt(0);
        MutableInt computerWins = new MutableInt(0);
        MutableInt numberOfTrials = new MutableInt(0);
        boolean beingPlayed = true;

        System.out.println("Let us begin...");
        while (beingPlayed) {
            //user turn
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
                //user quits
                endGameResults(userWins, computerWins, numberOfTrials);
                beingPlayed = false;
            } else {
                //computer turn
                MoveChoice computerChoice = computerTurn();
                System.out.print("My turn: " + computerChoice + "\n");
                whoWonTurn(userChoice, computerChoice, userWins, computerWins, numberOfTrials);
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

    private static MoveChoice computerTurn() {
        int computerRandomNumber = new Random().nextInt(3);
        ArrayList<MoveChoice> computerChoicesArrayList = new ArrayList<>();
        computerChoicesArrayList.add(MoveChoice.SCISSOR);
        computerChoicesArrayList.add(MoveChoice.PAPER);
        computerChoicesArrayList.add(MoveChoice.STONE);
        return computerChoicesArrayList.get(computerRandomNumber);
    }

    private static void whoWonTurn(MoveChoice userTurn, MoveChoice computerTurn, MutableInt userWins, MutableInt computerWins, MutableInt numberOfTrials) {
        numberOfTrials.add(1);
        if (userTurn == computerTurn) {
            System.out.println("TIE" + "\n");
        } else if (userTurn == MoveChoice.PAPER && computerTurn == MoveChoice.SCISSOR) {
            System.out.println("Scissor cuts paper, I won!" + "\n");
            computerWins.add(1);
        } else if (userTurn == MoveChoice.PAPER && computerTurn == MoveChoice.STONE) {
            System.out.println("You won!" + "\n");
            userWins.add(1);
        } else if (userTurn == MoveChoice.SCISSOR && computerTurn == MoveChoice.STONE) {
            System.out.println("Stone breaks scissor, I won!" + "\n");
            computerWins.add(1);
        } else if (userTurn == MoveChoice.SCISSOR && computerTurn == MoveChoice.PAPER) {
            System.out.println("You won!" + "\n");
            userWins.add(1);
        } else if (userTurn == MoveChoice.STONE && computerTurn == MoveChoice.PAPER) {
            System.out.println("Paper wraps around stone, I won!" + "\n");
            computerWins.add(1);
        } else if (userTurn == MoveChoice.STONE && computerTurn == MoveChoice.SCISSOR) {
            System.out.println("You won!" + "\n");
            userWins.add(1);
        }
    }

    private static void endGameResults(MutableInt userWins, MutableInt computerWins, MutableInt numberOfTrials) {
        DecimalFormat df = new DecimalFormat("#.00");
        double userWinPercentage = ((double) userWins.toInteger() / (double) numberOfTrials.toInteger()) * 100;
        double computerWinPercentage = ((double) computerWins.toInteger() / (double) numberOfTrials.toInteger()) * 100;
        System.out.println("Number of trials: " + numberOfTrials);
        System.out.println("I won " + computerWins + "(" + df.format(computerWinPercentage) + "%). You won " + userWins + "(" + df.format(userWinPercentage) + "%).");
        System.out.println("Bye!");
    }
}

/*
1. Kā labāk risināt šāda tipa uzdevumus, visas metodes vienā klasē (piemēram, Main), vai kā es tikko izdarīju - uztaisīt atsevišķu
klasi? Vai arī taisīt pat vairāk klases?

2. Es izmantoju MutableInt, jo tādā veidā varu saglabāt izmaiņas ar tiem mainīgajiem, kurus es izmantoju kā argumentus. Tas ir pieņemami
vai tomēr vajadzētu atturēties no MutableInt izmantošanas? Kā es šeit ar parasto int varēju appiet, ka metodes rezultātā programma nesaglabā
vērtību (whoWonTurn metodē).
*/

