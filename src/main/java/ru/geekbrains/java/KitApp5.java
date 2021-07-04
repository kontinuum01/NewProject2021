package ru.geekbrains.java;

import java.util.Random;
import java.util.Scanner;

public class KitApp5 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAI;

    public static void main(String[] args) {
        while (true) {
            playRound();
            System.out.printf("SCORE IS: HUMAN   AI\n            %d      %d\n", scoreHuman, scoreAI);
            System.out.print("Wanna play again? Enter Y or N >>> ");
            if (!SCANNER.next().toLowerCase().equals("y")) break;
        }
}
    private static void playRound() {

        initField(5, 5); // Поле размером 5*5
        printField();

        while (true) {
            humanTurn();
            printField();
            if (checkGameState(DOT_HUMAN)) break;
            aiTurn();
            printField();
            if (checkGameState(DOT_AI)) break;
        }
    }
    private static boolean checkGameState(char dot) {
        if (checkDraw()) return true;

        if (checkWin(dot)) {
            if (dot == DOT_HUMAN) {
                System.out.println("Human win!");
                scoreHuman++;
            } else {
                System.out.println("AI win!");
                scoreAI++;
            }
            return true;
        }
        return false;
    }
    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("Ooops... It's DRAW!");
        return true;
    }

    private static boolean checkWin(char dot) // Проверка победы на поле 5*5
    {
        for (int i = 0; i < 5; i++)
            if ((field[i][0] == dot && field[i][1] == dot &&
                    field[i][2] == dot && field[i][3] == dot && field[i][4] == dot) ||
                    (field[0][i] == dot && field[1][i] == dot &&
                            field[2][i] == dot && field[3][i] == dot && field[4][i] == dot))
                return true;
        if ((field[0][0] == dot && field[1][1] == dot &&
                field[2][2] == dot && field[3][3] == dot && field[4][4] == dot) ||
                (field[4][0] == dot && field[3][1] == dot &&
                        field[2][2] == dot && field[1][3] == dot && field[0][4] == dot))
            return true;
        return false;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(y, x));
        field[y][x] = DOT_AI;
    }
    private static void humanTurn() {
        int x, y;

        do {
            System.out.print("Please enter coordinates of your turn x & y split with whitespace >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));

        field[y][x] = DOT_HUMAN;
    }
    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    /**
     * This is method to check is the specified cell empty
     * @param y - y coordinate
     * @param x - x coordinate
     * @return
     */
    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void initField(int sizeY, int sizeX) {
        fieldSizeY = sizeY;
        fieldSizeX = sizeX;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }
    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i <= fieldSizeX * 2 + 1; i++) {
            System.out.print("_");
        }
        System.out.println();

        }
    }


