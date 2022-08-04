package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        int len;

        System.out.println("№1 Реверс значений массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        intArrayOutput(numbers, 8);
        for (int num : numbers) {
            numbers[num - 1] = 8 - num;
        }
        intArrayOutput(numbers, 8);

        System.out.println("\n №2 Вывод произведения элементов массива  ");

        numbers = new int[10];
        len = numbers.length;
        int tmp = 0;
        int prod = 1;
        for (int i = 0; i < len; i++) {
            numbers[i] = tmp;
            tmp++;
        }
        for (int i = 1; i < (len - 1); i++) {
            System.out.print(numbers[i]);
            System.out.print((i >= 8) ? "" : " * ");
            prod *= numbers[i];
        }
        System.out.print(" = " + prod + "\n");
        System.out.println("Элемент с индексом 0 : " + numbers[0]);
        System.out.println("Элемент с индексом 9 : " + numbers[9]);

        System.out.println("\n№3 Удаление элементов массива ");
        float[] floatNums = new float[15];
        len = floatNums.length;
        for (int i = 0; i < len; i++) {
            floatNums[i] = (float) Math.random();
        }
        float midElement = 0f;
        floatArrayOutput(floatNums);
        for (int i = 0; i < (len / 2 + 1); i++) {
            midElement = (leastAfterGot(floatNums, midElement));
        }
        int countDel = 0;
        for (int i = 0; i < len; i++) {
            if ((floatNums[i] > midElement)) {
                floatNums[i] = 0;
                countDel++;
            }
        }
        System.out.println("");
        floatArrayOutput(floatNums);
        System.out.println("Количество обнуленных элементов : " + countDel);

        System.out.println("\n№4 Вывод элементов массива лесенкой в обратном порядке ");
        char[] reverseAlphabet = new char[26];
        for (int i = 90; i >= 65; i--) {
            reverseAlphabet[90 - i] = (char) i;
        }
        int count = 0;
        for (char liter : reverseAlphabet) {
            for (int i = 0; i <= count; i++) {
                System.out.print(reverseAlphabet[i]);
            }
            System.out.println("");
            count++;
        }

        System.out.println("\n№5 Генерация уникальных чисел ");
        numbers = new int[30];
        len = numbers.length;
        for (int i = 0; i < len; i++) {
            do {
                tmp = (int) (60 + Math.random() * 40);
            } while (checkUnique(numbers, tmp));
            numbers[i] = tmp;
        }
        Arrays.sort(numbers);
        intArrayOutput(numbers,10);

        System.out.println("№6 Сдвиг элементов массива ");
        String[] srcArray = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};
        String[] finishArray = new String[7];
        System.out.println("Исходный массив : ");
        stringArrayOutput(srcArray);
        System.arraycopy(srcArray, 1, finishArray, 0, 1);
        System.arraycopy(srcArray, 3, finishArray, 1, 3);
        System.arraycopy(srcArray, 7, finishArray, 4, 3);
        System.out.println("Итоговый массив : ");
        stringArrayOutput(finishArray);
    }
    private static void intArrayOutput(int[] array,int elementsPerLine) {
        int count = 0;
        for (int element : array) {
            count++;
            System.out.print(element + " ");
            System.out.print((count % elementsPerLine == 0) ? "\n" : "");
        }
        System.out.println("");
    }

    private static void floatArrayOutput(float[] array) {
        int count = 0;
        for (float element : array) {
            System.out.printf("%.3f ", element );
            System.out.print((count == 7) ? "\n" : "");
            count++;
        }
        System.out.println("");
    }

    private static float leastAfterGot(float[] array, float gotNumber) {
        float least = 1f;
        for (float element : array) {
            if (element > gotNumber) {
                least = Math.min(least, element);
            }
        }
        return least;
    }

    private static boolean checkUnique(int[] array, int checkingNum) {
        for (int element : array) {
            if (element == checkingNum) {
                return true;
            }
        }
        return false;
    }
    private static void stringArrayOutput(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
        System.out.println("Конец массива \n");
    }

}
