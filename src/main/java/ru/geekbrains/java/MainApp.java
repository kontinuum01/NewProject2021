package ru.geekbrains.java;
import java.util.Scanner;
public class MainApp {
    public static void main(String args[]) {

      bool(); // Вызов метода, определяющий логически отрицательно или положительно вводимое число

    }

    public static boolean bool() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        boolean bool = a  <= 0;
        System.out.println(bool);
        scanner.close();
        return true;

    }

}

