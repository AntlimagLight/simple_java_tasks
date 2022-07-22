public class CyclesTheme {
    public static void main(String[] args) {
        System.out.print(" №1 Перевод псевдокода на язык Java \n");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
               sumEven += counter;
            } else {
               sumOdd += counter;
            }
           counter++;
        } while (counter <= 21);
        System.out.print(" В промежутке [-10, 21] сумма четных чисел = " + sumEven + " , а нечетных = " + sumOdd);

        System.out.print("\n\n №2 Вывод чисел в интервале (min и max) в порядке убывания \n ");
        int num1 = -1;
        int num2 = 5;
        int num3 = 10;
        int max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        int min  = (num1 < num2) ? num1 : num2;
        min = (min < num3) ? min : num3;
        for (int count = max - 1; count > min; count--) {
            System.out.print(count + " ");
        }

        System.out.print("\n\n №3 Вывод реверсивного числа и суммы его цифр \n ");
        int srcNum = 1234;
        int sum = 0; 
        int digit = srcNum;
        while (digit > 0) {
            System.out.print(digit % 10);
            sum += digit % 10;
            digit /= 10;
        }
        System.out.print(" Сумма цифр исходного числа: " + sum);

        System.out.print("\n\n №4 Вывод чисел на консоль в несколько строк \n");
        int numbersPerLine = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3s", i);
            numbersPerLine++;
            if (numbersPerLine == 5) {
                System.out.println();
                numbersPerLine = 0;
            }
        }
        for (int i = numbersPerLine; i < 5; i++) {
            System.out.printf("%3s", 0);
        }

        System.out.print("\n\n №5 Проверка количества единиц на четность \n ");
        srcNum = 3141591;
        System.out.print("Число " + srcNum + " содержит ");
        int countOnes = 0;
        while (srcNum > 0) {
            if (srcNum % 10 == 1) {
                countOnes++;
            }
            srcNum /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.print("четное количество единиц");
        } else {
            System.out.print("нечетное количество единиц");
        }

        System.out.print("\n\n №6 Отображение фигур в консоли \n");
        for (int i = 1; i < 51; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        int rowСount = 0;
        int charPerLine = 0;
        while (rowСount < 5) {
            rowСount++;
            charPerLine = rowСount;
            while (charPerLine <= 5) {
                System.out.print("#");
                charPerLine++;
            }
            System.out.println();
        }

        System.out.println();
        int symbolСount = 0;
        do {
            if (symbolСount == 1 || symbolСount == 3 || symbolСount == 6 || symbolСount == 8) {
                System.out.println();
            }
            System.out.print("$");
            symbolСount++;
        } while (symbolСount < 9);

        System.out.print("\n\n №7 Отображение ASCII-символов \n");
        System.out.printf("  %3s %4s \n", "Dec" , " Char");
        for (int i = 1; i <= 47; i += 2) {
            System.out.printf("  %3s   %3s \n", i , (char) i);
        }
        System.out.print("\n ");
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("  %2s   %3s \n", i , (char) i);
        }

        System.out.print("\n №8 Проверка, является ли число палиндромом \n");
        srcNum = 1234321;
        int copySrcNum = srcNum;
        int reverse = 0;
        copySrcNum = srcNum;
        while (copySrcNum != 0) {
            reverse = (reverse * 10) + (copySrcNum % 10);
            copySrcNum /= 10;
        }
        if (srcNum == reverse) {
            System.out.print(" Число " + srcNum + " является палиндромом.");
        } else {
            System.out.print(" Число " + srcNum + " не является палиндромом.");
        }

        System.out.print("\n\n №9 Определение, является ли число счастливым \n");
        srcNum = 786498;
        System.out.print(" Число " + srcNum + "\n");
        int sum1 = 0;
        int sum2 = 0;
        int count = 1;
        while (srcNum != 0) {
            if (count <= 3) {
                sum1 += srcNum % 10;
            } else {
                sum2 += srcNum % 10;
            }
            srcNum /= 10;
            count++;
        }

        if (sum1 == sum2) {
            System.out.print(" является счастливым.\n Сумма цифр: " + sum2 + " = " + sum1);
        } else {
            System.out.print(" не является счастливым.\n Сумма цифр: " + sum2 + " = " + sum1);
        }

        System.out.print("\n\n №10 Вывод таблицы умножения Пифагора \n");
        for (int i = 0; i < 9; i++) {
            if (i == 1) {
                System.out.print("  ___________________________\n");
            }
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    j++;
                    System.out.printf("%3s",j * (i + 1));
                    j--;
              } else if (j == 1) {
                    System.out.print(" |");
                } else {
                    System.out.printf("%3s",j * (i + 1));
                }
            }
            System.out.println();
        }
    }
}