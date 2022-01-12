package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Задание 1
        int[] array = new int[]{1, 2, 3};
        String str = Arrays.toString(array);
        System.out.println(Arrays.toString(array));


        double[] arraySecond = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arraySecond));

        int[] howManyDays = new int[12];
        howManyDays[0] = 31;
        int januaryDays = howManyDays[0];
        System.out.println(januaryDays);


        // Задание 2
        int[] arrayThird = {1, 2, 3};
        arrayThird[0] = 1;
        for (int i = 0; i < arrayThird.length; i++) {
            System.out.print(arrayThird[i] + ",");
        }
        System.out.println();

        double[] fraction = {1.57, 7.654, 9.986};
        fraction[0] = 1.57;
        for (int i = 0; i < fraction.length; i++) {
            System.out.print(fraction[i] + ",");

        }
        System.out.println();

        // Задание 3
        int[] array5 = {1, 2, 3};
        for (int i = array5.length - 1; i >= 0; i--) {
            if (i == 0) {
            }
            System.out.print(arrayThird[i] + ",");
        }
        System.out.println();

        double[] name = {1.57, 7.654, 9.986};
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i] + ",");
        }
        System.out.println();

        //Задание 4
        int[] arrayH = {1, 2, 3};
        for (int i = 0; i < arrayThird.length; i++) {
            if (arrayH[i] % 2 != 0) {
                arrayH[i]++;
            }
            if (i == arrayH.length- 1) {
                System.out.print(arrayH[i] + ",");
            }
        }
    }
}