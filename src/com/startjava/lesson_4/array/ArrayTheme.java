package com.startjava.lesson_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("№1 Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        outputIntArray(intArr, 8);
        for (int num : intArr) {
            intArr[num - 1] = 8 - num;
        }
        outputIntArray(intArr, 8);

        System.out.println("\n№2 Вывод произведения элементов массива  ");

        intArr = new int[10];
        int len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        int prod = 1;
        for (int i = 2; i < len - 1; i++) {
            System.out.print(intArr[i] + (i <= 7 ? " * " : " = "));
            prod *= intArr[i];
        }
        System.out.println(prod);
        System.out.println("Элемент с индексом 0 : " + intArr[0]);
        System.out.println("Элемент с индексом 9 : " + intArr[9]);

        System.out.println("\n№3 Удаление элементов массива ");
        float[] floatNums = new float[15];
        len = floatNums.length;
        for (int i = 0; i < len; i++) {
            floatNums[i] = (float) Math.random();
        }
        outputFloatArray(floatNums);

        float midNum = floatNums[len / 2];
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
        len = alphabet.length;
        for (char i = 'A'; i <= 'Z'; i++) {
            alphabet[i - 65] = i;
        }
        int count = 0;
        for (char letter : alphabet) {
            for (int i = len - 1; i >= len - 1 - count; i--) {
                System.out.print(alphabet[i]);
            }
            System.out.println();
            count++;
        }

        System.out.println("\n№5 Генерация уникальных чисел ");
        intArr = new int[30];
        len = intArr.length;
        int randomNum;
        for (int i = 0; i < len; i++) {
            do {
                randomNum = (int) (60 + Math.random() * 40);
            } while (checkUnique(intArr, randomNum));
            intArr[i] = randomNum;
        }
        Arrays.sort(intArr);
        outputIntArray(intArr, 10);

        System.out.println("\n№6 Сдвиг элементов массива ");
        String[] srcArray = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};
        System.out.println("Исходный массив : ");
        outputStringArray(srcArray);

        count = 0;
        for (String string : srcArray) {
            if (!string.isBlank()) {
                count++;
            }
        }
        String[] destArray = new String[count];
        len = srcArray.length;
        int lastIdx = 0;
        for (int i = 0; i < len; i++) {
            if (!srcArray[i].isBlank()) {
                int countLength = 1;
                while (!srcArray[i + countLength].isBlank() && i + countLength <= len) {
                    countLength++;
                }
                System.arraycopy(srcArray, i, destArray, lastIdx, countLength);
                lastIdx += countLength;
                i += countLength - 1;
            }
        }

        System.out.println("Итоговый массив : ");
        outputStringArray(destArray);
    }
    private static void outputIntArray(int[] array, int elementsPerLine) {
        int count = 1;
        for (int element : array) {
            System.out.print(element);
            System.out.print((count % elementsPerLine == 0 || element == array[array.length - 1]) ? "\n" : " ");
            count++;
        }
    }

    private static void outputFloatArray(float[] array) {
        int count = 0;
        for (float element : array) {
            System.out.printf("%.3f", element);
            System.out.print((count == 7) ? "\n" : " ");
            count++;
        }
        System.out.print("\n\n");
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
        int count = 1;
        for (String element : array) {
            System.out.print(element + ((array.length <= count) ? "." : ", "));
            count++;
        }
        System.out.println();
    }

}
