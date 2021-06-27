package ru.geekbrains.java;
import java.util.Arrays;

public class KitApp2 {
    public static void main(String args[]) {

        massiveArray1();// Метод задающий массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ];
                        // и умножающий числа значением меньше 6 на 2;

    }

    public static void massiveArray1() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(Arrays.toString(new int[]{arr[i]}));

        }
    }
}


