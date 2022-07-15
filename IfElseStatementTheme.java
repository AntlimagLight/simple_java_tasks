public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.print(" №1 Перевод псевдокода на язык Java \n");
        int age = 30;
        String gender = "female";
        float height = 1.9f;
        char firstNameLetter = "Марина".charAt(0);
        if (age < 20) {
            System.out.print(" Данные материалы не доступны для лиц младше 20 лет. \n");
        } else {
            System.out.print(" Вы можете включить отображение скрытого контента. \n");
        }
        if (gender != "male") {
            System.out.print(" Подписывайся на канал \"КОСМЕТИЧЕСКИЙ КОСМОС\" \n");
        }
        if (height < 1.8) {
            System.out.print(" Предлагаем вам сыграть за высоких и статных эльфов \n");
        } else {
            System.out.print(" Предлагаем вам сыграть за низкорослых и коренастых гномов \n");
        }
        if (firstNameLetter == 'М') {
            System.out.print(" Ваше имя начинается на М, скидка 25% на магические товары \n");
        } else if (firstNameLetter == 'I') {
            System.out.print(" Your name starts with I, +5% bonus income \n");
        } else {
            System.out.print(" Вы получаете стандартный набор бонусов \n");
        }

        System.out.print("\n №2 Поиск max и min числа \n");
        int num1 = 200;
        int num2 = 100;
        if (num1 == num2) {
            System.out.print(" Значения указанных чисел равны! \n " + num1 + "=" + num2);
        } else if (num1 > num2) {
            System.out.print(" Максимальное число: " + num1 + " | Минимальное число: " + num2);
        } else {
            System.out.print(" Максимальное число: " + num2 + " | Минимальное число: " + num1);
        }

        System.out.print("\n\n №3 Работа с числом \n");
        int num = -53;
        System.out.print(" Число " + num);
        if (num == 0) {
            System.out.print(" равняется нулю. ");
        } else {
            if (num % 2 == 0) {
                System.out.print(" является четным ");
            } else {
                System.out.print(" является нечетным ");
            }
            if (num > 0) {
                System.out.print("и положительным ");
            } else {
                System.out.print("и отрицательным ");
            }
        }

        System.out.print("\n\n №4 Поиск одинаковых цифр в числах \n");
        num1 = 966;
        num2 = 966;
        int hundredsNum1 = num1 / 100;
        int tensNum1 = num1 / 10 % 10;
        int unitsNum1 = num1  % 10;
        int hundredsNum2 = num2 / 100;
        int tensNum2 = num2 / 10 % 10;
        int unitsNum2 = num2  % 10;
        System.out.print(" Рассмотрим числа: " + num1 + " и " + num2 + 
        "\n Разряды первого числа: сотни - " + hundredsNum1 + " , десятки - "+ tensNum1 +
        " , единицы - " + unitsNum1 + "\n Разряды второго числа: сотни - "+ hundredsNum2 +
        " , десятки - "+ tensNum2 + " , единицы - " + unitsNum2 +"\n");
        if (unitsNum1 == unitsNum2) {
            System.out.print(" Цифра " + unitsNum1 + " одинакова в разряде единиц обоих чисел \n");
        }
        if (tensNum1 == tensNum2) {
            System.out.print(" Цифра " + tensNum1 + " одинакова в разряде десятков обоих чисел \n");
        }
        if (hundredsNum1 == hundredsNum2) {
            System.out.print(" Цифра " + hundredsNum1 + " одинакова в разряде сотен обоих чисел \n");
        }

        System.out.print("\n №5 Определение буквы, числа или символа по их коду \n");
        char srcSymbol = '\u0057';
        System.out.print(" Символ: \"" + srcSymbol);
        if (srcSymbol > (char) 47 && srcSymbol < (char) 58) {
            System.out.print("\" является цифрой \n ");
        } else if (srcSymbol > (char) 64 && srcSymbol < (char) 91) {
            System.out.print("\" является большой буквой \n");
        } else if (srcSymbol > (char) 96 && srcSymbol < (char) 123) {
            System.out.print("\" является маленькой буквой \n");
        } else {
            System.out.print("\" не является цифрой, или буквой английского алфавита \n");
        }

        System.out.print("\n №6 Определение суммы вклада и начисленных банком % \n");
        int deposit = 300000;
        int percentIncome;
        if (deposit < 100000) {
            percentIncome = 5;
        } else if (deposit >= 100000 & deposit <= 300000) {
            percentIncome = 7;
        } else {
            percentIncome = 10;
        }
        System.out.print(" Сумма вклада: " + deposit + " рублей \n Процент годовых: " +
                percentIncome + "%\n Итоговая сумма: " + (deposit + deposit / 100 * percentIncome) 
                + " рублей");

        System.out.print("\n\n №7 Определение оценки по предметам \n");
        int percentHistory = 59;
        int percentProgramming = 91;
        int gradeHistory;
        int gradeProgramming;
        if (percentHistory <= 60) {
            gradeHistory = 2;
        } else if (percentHistory <= 74) {
            gradeHistory = 3;
        } else if (percentHistory <= 91) {
            gradeHistory = 4;
        } else {
            gradeHistory = 5;
        }
        if (percentProgramming <= 60) {
            gradeProgramming = 2;
        } else if (percentProgramming <= 74) {
            gradeProgramming = 3;
        } else if (percentProgramming <= 91) {
            gradeProgramming = 4;
        } else {
            gradeProgramming = 5;
        }
        System.out.print(" История - " + gradeHistory + " баллов \n Программирование - " +
                gradeProgramming + " баллов \n Средний балл: " +
                (float) (( gradeHistory + gradeProgramming ) / 2) + " баллов \n Средний процент: " +
                (( percentHistory + percentProgramming ) / 2) + "%");

        System.out.print("\n\n №8 Расчет прибыли \n");
        int monthlyIncome = 13000;
        int monthlyRent = 5000;
        int monthlyPrimeСost = 9000;
        int yearlyProfit = (monthlyIncome - monthlyRent - monthlyPrimeСost) * 12;
        System.out.print(" Прибыль за год: " + (yearlyProfit > 0 ? "+" : "") + yearlyProfit
                 + " руб.");

        System.out.print("\n\n №9 подсчет количества банкнот \n");
        int totalBanknotes10USD = 5;
        int issuedAmount = 567;
        int issueBanknotes100USD = issuedAmount / 100;
        int issueBanknotes10USD = issuedAmount / 10 % 10;
        int issueBanknotes1USD = issuedAmount  % 10;
        if (issueBanknotes10USD > totalBanknotes10USD) {
            issueBanknotes1USD += (issueBanknotes10USD - totalBanknotes10USD) * 10;
            issueBanknotes10USD = totalBanknotes10USD;
        }
        System.out.print(" Выдано: 100$ - " + issueBanknotes100USD + " шт." + " 10$ - " +
                issueBanknotes10USD + " шт." + "1$ - " + issueBanknotes1USD + " шт. \n " +
                (issueBanknotes1USD + issueBanknotes10USD * 10 + issueBanknotes100USD * 100) + 
                "$ - общая сумма");
    }
}