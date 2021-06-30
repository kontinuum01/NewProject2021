package ru.geekbrains.java;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class KitApp4 {
// Игра угадай слово
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Угадай слово!!!");
        String[] words = {"яблоко", "апельсин", "лимон", "банан", "абрикос", "авокадо", "брокколи", "морковь",
                "вишня", "чеснок", "виноград", "дыня", "киви", "манго", "гриб", "орех",
                "оливки", "горох", "арахис", "груша", "перец", "ананас", "тыква", "картофель"

        };
        String wordsAI = words[random.nextInt(words.length)];
        String wordsHuman;
        char[] hiddenfield = new char[15];
        Arrays.fill(hiddenfield, '#');

        System.out.print("Выберите из следующего набора слов: ");
        System.out.println(Arrays.toString(words));
        while (true) {
            System.out.print("Введите ваш вариант: ");
            wordsHuman = scanner.next();

            if (wordsHuman.toLowerCase().equals(wordsAI)) {
                System.out.println("Вы угадали!!!");
                break;
            }

            for (int i = 0; i < wordsHuman.length() && i < wordsAI.length(); i++) {
                if (wordsHuman.charAt(i) == wordsAI.charAt(i)) hiddenfield[i] = wordsAI.charAt(i);
            }
            System.out.println("Нет, слово содержит следующие буквы:");
            System.out.println(new String(hiddenfield));
        }


    }

}