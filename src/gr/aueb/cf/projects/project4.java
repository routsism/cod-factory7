package gr.aueb.cf.projects;

import java.util.Scanner;

public class project4 {

    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while (true) {
            System.out.println("Παίκτης " + currentPlayer + ", κάνε την κίνησή σου:");
            int row = getPlayerInput("Γράψε την γραμμή (0, 1, 2): ");
            int col = getPlayerInput("Γράψε την στήλη (0, 1, 2): ");

            if (board[row][col] != '-') {
                System.out.println("Αυτή η θέση είναι κατειλημμένη. Δοκίμασε άλλη θέση.");
                continue;
            }


            board[row][col] = currentPlayer;
            printBoard();


            if (checkWin()) {
                System.out.println("Ο Παίκτης " + currentPlayer + " κερδίζει!");
                break;
            }


            if (checkDraw()) {
                System.out.println("Ισοπαλία!");
                break;
            }


            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }


    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }


    public static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static int getPlayerInput(String message) {
        Scanner sc = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print(message);
            input = sc.nextInt();
            if (input >= 0 && input <= 2) {
                break;
            } else {
                System.out.println("Η είσοδος πρέπει να είναι μεταξύ 0 και 2.");
            }
        }
        return input;
    }


    public static boolean checkWin() {
        // Ελέγχουμε τις γραμμές
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }


        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }


        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }


    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;  // Αν βρούμε κενή θέση, δεν είναι ισοπαλία
                }
            }
        }
        return true;  // Αν δεν υπάρχουν κενές θέσεις, τότε είναι ισοπαλία
    }
}

