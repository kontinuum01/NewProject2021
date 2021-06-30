package ru.geekbrains.java;
import java.util.Scanner;
import java.util.Random;

public class KitApp3 {
    // Игра угадай число
    private static Scanner scr = new Scanner(System.in);
    static Random random = new Random();
    static final int TRIES = 3;

    public static void main(String[] args) {
        System.out.println("Угадай число!!!");{
            while (true) {
                int x = random.nextInt(10);
                System.out.print("Ваше число:");
                boolean bool = false;
                for (int i = 0; i < TRIES; i++) {
                    int answer = scr.nextInt();
                    if (answer == x) {
                        System.out.println("Вы выиграли!!!");
                        bool = true;
                        break;
                    } else if (answer > x) {
                        System.out.println("Ваше число больше!");
                    } else {
                        System.out.println("Ваше число меньше!");
                    }
                }
                if (!bool) System.out.println("Вы проиграли!");
                System.out.print("Начать заново? y or n ");
                if (!scr.next().equals("y")) break;
            }
        }
    }
}