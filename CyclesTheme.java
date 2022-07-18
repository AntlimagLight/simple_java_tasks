public class CyclesTheme {
    public static void main(String[] args) {
        System.out.print(" №1 Перевод псевдокода на язык Java \n");
        int currientNum = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (currientNum % 2 == 0) {
               sumEven += currientNum;
            } else {
               sumOdd += currientNum;
            }
           currientNum++;
        } while (currientNum <= 21);
        System.out.print(" В промежутке [-10, 21] сумма четных чисел = " + sumEven + " , а нечетных = " + sumOdd);

        System.out.print("\n\n №2 Вывод чисел в интервале (min и max) в порядке убывания \n ");
        int num1 = -1;
        int num2 = 5;
        int num3 = 10;
        int max = ( num1 > num2 ) ? num1 : num2;
        max = ( max > num3 ) ? max : num3;
        int min  = ( num1 < num2 ) ? num1 : num2;
        min = ( min < num3 ) ? min : num3;
        for (int count = max; count >= min; count--) {
            System.out.print(count + " ");
        }

        System.out.print("\n\n №3 Вывод реверсивного числа и суммы его цифр \n ");
        // Я так понимаю, что до массивов мы не добрались и задачу надо решить без них? 
        // Тогда вижу это как-то так, но интуитивно хочется записывать цифры в массив.
        int srcNum = 1234;
        int sum = 0; 
        while (srcNum > 0) {
            System.out.print(srcNum % 10);
            sum += srcNum % 10;
            srcNum /= 10;
        }
        System.out.print(" Сумма цифр исходного числа: " + sum);

        System.out.print("\n\n №4 Вывод чисел на консоль в несколько строк \n");
        int countNewLine = 0;
        for (int count = 1 ; count < 24 ; count += 2 ){
            System.out.printf("%3s",count);
            countNewLine++;
            if (countNewLine == 5) {
                System.out.print("\n");
                countNewLine = 0;
            }
        }
        while (countNewLine < 5) {
            System.out.printf("%3s",0);
            countNewLine++;
        }

        System.out.print("\n\n №5 Проверка количества единиц на четность \n ");
        srcNum = 3141591;
        System.out.print("Число " + srcNum + " содержит ");
        int numberDigitsOne = 0;
        while (srcNum > 0) {
            if (srcNum % 10 == 1) {
                numberDigitsOne++;
            }
        srcNum /= 10;
        }
        if (numberDigitsOne % 2 == 0) {
            System.out.print("четное количество единиц");
        } else {
            System.out.print("нечетное количество единиц");
        }
        // По условию задачи не вполне понятно о каких единицах идет речь, о разряде единиц 
        // или о количестве цифр 1. Т.к проверить на четность разряд единиц слишком легко
        // и для этого не нужны циклы, полагаю что речь идет о количестве цифр 1.

        System.out.print("\n\n №6 Отображение фигур в консоли \n");
        for (int count = 1 ; count < 51 ; count++ ){
            System.out.print("*");
            if (count % 10 == 0) {
                System.out.print("\n");
            }
        }
        System.out.print("\n");
        int symbolСount = 0;
        int shiftCount = 5;
        int shiftTmp = shiftCount;
        while (symbolСount < 15) {
            System.out.print("#");
            shiftTmp -= 1;
                if (shiftTmp == 0) {
                System.out.print("\n");
                shiftCount -= 1;
                shiftTmp = shiftCount;
            }
            symbolСount++;
        }
        System.out.print("\n");

        symbolСount = 0;
        do{
            if (symbolСount == 1 | symbolСount == 3 | symbolСount == 6 | symbolСount == 8) {
                System.out.print("\n");
            }
        System.out.print("$");
        symbolСount++;
        } while (symbolСount < 9);

        //System.out.print("\n\n №7 Отображение ASCII-символов \n");
        //for (int count = 1; count <= 47; count += 2){
        //    System.out.printf("  %2s %2s \n",count,(char) count);
        //}
        //System.out.print("\n ");
        //for (int count = 98; count <= 122; count += 2){
        //    System.out.printf(" %2s %2s \n",count,(char) count);
        //}

        System.out.print("\n\n №8 Проверка, является ли число палиндромом \n");
        srcNum = 1234321;
        int tmpNum = srcNum;
        int digit = 1;
        int checkingNum = 0;
        while (tmpNum > 0) {
            digit *= 10;
            tmpNum /= 10;
        }
        tmpNum = srcNum;
        while (digit > 0) {
            digit /= 10;
            checkingNum += (tmpNum % 10) * digit;
            tmpNum /= 10;
        }
        if (srcNum == checkingNum) {
            System.out.print(" Число " + srcNum + " является палиндромом.");
        } else {
            System.out.print(" Число " + srcNum + " не является палиндромом.");
        }

        System.out.print("\n\n №9 Определение, является ли число счастливым \n");
        srcNum = 786498;
        System.out.print(" Число " + srcNum);
        int sum1 = 0;
        int sum2 = 0;
        for (int count = 1 ; count < 7 ; count++ ){
            if (count < 4) {
                sum1 += srcNum % 10;
            } else {
                sum2 += srcNum % 10;
            }
            srcNum /= 10;
        }
        if (sum1 == sum2) {
            System.out.print(" является счастливым.\n Сумма цифр: " + sum1 + " + " + sum2);
        } else {
            System.out.print(" не является счастливым.\n Сумма цифр: " + sum1 + " + " + sum2);
        }

        System.out.print("\n\n №10 Вывод таблицы умножения Пифагора \n");
        for (int factorY = 0 ; factorY < 9 ; factorY++ ){
            if (factorY == 1) {
                System.out.print("   __________________________\n");
            }
            for (int factorX = 0 ; factorX < 10 ; factorX++ ){
                if (factorX == 0) {
                    factorX++;
                    System.out.printf("%3s",factorX * (factorY + 1));
                    factorX--;
              } else if (factorX == 1) {
                    System.out.print(" |");
                } else {
                    System.out.printf("%3s",factorX * (factorY + 1));
                }
            }
        System.out.print("\n");
        }
    }
}
