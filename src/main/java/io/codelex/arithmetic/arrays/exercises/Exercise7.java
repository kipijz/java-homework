package io.codelex.arithmetic.arrays.exercises;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        String[][] ticTacToeBoard = {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""},
        };
        playTheGame(ticTacToeBoard);
    }

    public static void playTheGame(String[][] board) {
        Scanner scanner = new Scanner(System.in);
        int userInputRow = 0;
        int userInputColumnn = 0;
        int whosTurn = 1;
        while (!isWinner(board)) {
            if (whosTurn % 2 == 0) {
                System.out.println("'O', Choose your location (row, column): ");
                userInputRow = scanner.nextInt();
                userInputColumnn = scanner.nextInt();
                board[userInputRow][userInputColumnn] = "O";
                checkTable(board);
            } else {
                System.out.println("'X', Choose your location (row, column): ");
                userInputRow = scanner.nextInt();
                userInputColumnn = scanner.nextInt();
                board[userInputRow][userInputColumnn] = "X";
                checkTable(board);
            }
            if (isTie(board)) {
                break;
            }
            whosTurn++;
        }
        if (isTie(board)) System.out.println("The game is a tie.");
        else {
            if (whosTurn % 2 == 0) System.out.println("'X' has won!");
            else System.out.println("'O' has won!");
        }
    }

    public static void checkTable(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Objects.equals(board[i][j], "")) System.out.print(" ");
                else System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isWinner(String[][] board) { //spaghetti code
        boolean isWinner = false;

        if (!Objects.equals(board[0][0], "") && Objects.equals(board[0][0], board[0][1]) && Objects.equals(board[0][0], board[0][2]))
            isWinner = true;
        else if (!Objects.equals(board[1][0], "") && Objects.equals(board[1][0], board[1][1]) && Objects.equals(board[1][1], board[1][2]))
            isWinner = true;
        else if (!Objects.equals(board[2][0], "") && Objects.equals(board[2][0], board[2][1]) && Objects.equals(board[2][1], board[2][2]))
            isWinner = true;
        else if (!Objects.equals(board[0][0], "") && Objects.equals(board[0][0], board[1][0]) && Objects.equals(board[1][0], board[2][0]))
            isWinner = true;
        else if (!Objects.equals(board[0][1], "") && Objects.equals(board[0][1], board[1][1]) && Objects.equals(board[1][1], board[2][1]))
            isWinner = true;
        else if (!Objects.equals(board[0][2], "") && Objects.equals(board[0][2], board[1][2]) && Objects.equals(board[1][2], board[2][2]))
            isWinner = true;
        else if (!Objects.equals(board[0][0], "") && Objects.equals(board[0][0], board[1][1]) && Objects.equals(board[1][1], board[2][2]))
            isWinner = true;
        else if (!Objects.equals(board[0][2], "") && Objects.equals(board[0][2], board[1][1]) && Objects.equals(board[1][1], board[2][0]))
            isWinner = true;

        return isWinner;
    }

    public static boolean isTie(String[][] board) {
        boolean isTie = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Objects.equals(board[i][j], "")) isTie = false;
            }
        }
        return isTie;
    }

}
