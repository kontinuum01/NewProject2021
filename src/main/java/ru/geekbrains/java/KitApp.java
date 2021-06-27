package ru.geekbrains.java;

import java.util.Arrays;

public class KitApp {
    public static void main(String args[]) {

        invertArray(); //Метод для создания массива из элементов 0 и 1;
                       //С помощью цикла и условия заменить 0 на 1, 1 на 0;
    }
    public static void invertArray()
{
    int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    for ( int i = 0; i < arr.length; i++){
        if (arr[i] == 1) arr[i] = 0;
         else arr[i] = 1;
        System.out.print(Arrays.toString(new int[]{arr[i]}));



        }

        }
    }









