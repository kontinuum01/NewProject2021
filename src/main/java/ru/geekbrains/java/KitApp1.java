package ru.geekbrains.java;
import java.util.Arrays;

public class KitApp1 {
    public static void main(String args[]) {

        massiveArray(8, 3);// Метод задающий целочисленный массив размером 8;
                                    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    }

    static int[] massiveArray(int size, int step) {

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step;
            System.out.print(Arrays.toString(new int[]{arr[i]}));

        }
        return arr;
    }
}




