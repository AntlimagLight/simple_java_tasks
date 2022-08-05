package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {

        System.out.println("№1 Реверс значений массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        outputIntArray(numbers, 8);
        for (int num : numbers) {
            numbers[num - 1] = 8 - num;
        }
        outputIntArray(numbers, 8);

        System.out.println("\n№2 Вывод произведения элементов массива  ");

        numbers = new int[10];
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            numbers[i] = i;
        }
        int prod = 1;
        for (int i = 2; i < len - 1; i++) {
            System.out.print(numbers[i] + (!(i >= 8) ? " * " : " = "));
            prod *= numbers[i];
        }
        System.out.print(prod + "\n");
        System.out.println("Элемент с индексом 0 : " + numbers[0]);
        System.out.println("Элемент с индексом 9 : " + numbers[9]);

        System.out.println("\n№3 Удаление элементов массива ");
        float[] floatNums = new float[15];
        len = floatNums.length;
        for (int i = 0; i < len; i++) {
            floatNums[i] = (float) Math.random();
        }

        float midNum = 0f;
        outputFloatArray(floatNums);
        for (int i = 0; i < (len / 2 + 1); i++) {
            midNum = (searchLeastAfterGot(floatNums, midNum));
        }

        int countDel = 0;
        for (int i = 0; i < len; i++) {
            if (floatNums[i] > midNum) {
                floatNums[i] = 0;
                countDel++;
            }
        }
        outputFloatArray(floatNums);
        System.out.println("Количество обнуленных элементов : " + countDel);

        System.out.println("\n№4 Вывод элементов массива лесенкой в обратном порядке ");
        char[] alphabet = new char[26];
        for (int i = 'A'; i <= (int) 'Z'; i++) {
            alphabet[i - 65] = (char) i;
        }
        int count = 0;
        for (char letter : alphabet) {
            for (int i = 0; i <= count; i++) {
                System.out.print(alphabet[25 - i]);
            }
            System.out.print("\n");
            count++;
        }

        System.out.println("\n№5 Генерация уникальных чисел ");
        numbers = new int[30];
        len = numbers.length;
        int randomNum;
        for (int i = 0; i < len; i++) {
            do {
                randomNum = (int) (60 + Math.random() * 40);
            } while (checkUnique(numbers, randomNum));
            numbers[i] = randomNum;
        }
        Arrays.sort(numbers);
        outputIntArray(numbers, 10);

        System.out.println("\n№6 Сдвиг элементов массива ");
        String[] srcArray = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};
        System.out.println("Исходный массив : ");
        outputStringArray(srcArray);

        count = 0;
        for (String string : srcArray) {
            if (!string.equals("")) {
                count++;
            }
        }
        String[] finishArray = new String[count];
        len = srcArray.length;
        int countFinishArray = 0;
        for (int i = 0; i < len; i++) {
            if (!srcArray[i].equals("")) {
                int countLength = 1;
                while (!srcArray[i + countLength].equals("") & i + countLength <= len) {
                    countLength++;
                }
                System.arraycopy(srcArray, i, finishArray, countFinishArray, countLength);
                countFinishArray += countLength;
                i += countLength - 1;
            }
        }

        System.out.println("Итоговый массив : ");
        outputStringArray(finishArray);
    }
    private static void outputIntArray(int[] array, int elementsPerLine) {
        int count = 0;
        for (int element : array) {
            count++;
            System.out.print(element + " ");
            System.out.print((count % elementsPerLine == 0 || element == array[array.length - 1]) ? "\n" : "");
        }
    }

    private static void outputFloatArray(float[] array) {
        int count = 0;
        for (float element : array) {
            System.out.printf("%.3f ", element );
            System.out.print((count == 7 || element == array[array.length - 1]) ? "\n" : "");
            count++;
        }
    }

    private static float searchLeastAfterGot(float[] array, float gotNumber) {
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
    private static void outputStringArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
        System.out.println("Конец массива \n");
    }

}
