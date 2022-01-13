package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Задание 1
        int[] array = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(array));


        double[] arraySecond = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arraySecond));

        int[] howManyDays = new int[12];
        howManyDays[0] = 31;
        int januaryDays = howManyDays[0];
        System.out.println(januaryDays);


        // Задание 2
        int[] arrayThird = {1, 2, 3};
        for (int i = 0; i < arrayThird.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(arrayThird[i]);
        }
        System.out.println();

        double[] fraction = {1.57, 7.654, 9.986};
        for (int i = 0; i < fraction.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(fraction[i]);

        }
        System.out.println();

        // Задание 3
        int[] array5 = {1, 2, 3};
        for (int i = array5.length - 1; i >= 0; i--) {
            if (i < array5.length - 1) {
                System.out.print(",");
            }
            System.out.print(arrayThird[i]);
        }
        System.out.println();

        double[] name = {1.57, 7.654, 9.986};
        for (int i = name.length - 1; i >= 0; i--) {
            if (i < name.length - 1) {
                System.out.print(",");
            }
            System.out.print(name[i]);
        }
        System.out.println();

        //Задание 4
        int[] arrayH = {1, 2, 3};
        for (int i = 0; i < arrayH.length; i++) {
            if (i >0) {
                System.out.print(",");
            }

                if (arrayH[i] % 2 != 0) {
                    arrayH[i]++;
                }
                System.out.print(arrayH[i]);
            }

            System.out.println();
        }

    }


