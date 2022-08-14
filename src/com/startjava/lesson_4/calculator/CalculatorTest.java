package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String option = "yes";
        while (option.equals("yes")) {
            Scanner scanner = new Scanner(System.in);
            float num1 = 0;
            float num2 = 0;
            try {
                do {
                    System.out.println("Введите математическое выражение: ");
                    String mathAction = scanner.nextLine();
                    String[] mathElements = mathAction.split(" ");
                    num1 = Float.parseFloat(mathElements[0]);
                    num2 = Float.parseFloat(mathElements[2]);
                    Calculator.setSign(mathElements[1].charAt(0));
                    if (!(checkIntPosNum(num1) && checkIntPosNum(num2))) {
                        System.out.println("Введенные числа должны быть положительными и целыми. Попробуйте еще раз.");
                    }
                } while (!(checkIntPosNum(num1) && checkIntPosNum(num2)));
                Calculator.setNum1((int) num1);
                Calculator.setNum2((int) num2);
            System.out.print("= " + Calculator.calculate() + "\n");
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Неверный формат выражения! [Вводите в формате X + Y]");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("Несуществующая операция! [доступные операции + - / * ^]");
                continue;
            }
            do {
                System.out.println("Хотите продолжить вычисление? [yes / no] " );
                option = scanner.nextLine();
                if (checkContinue(option)) {
                    System.out.println("Некорректный ответ. Пожалуйста введите yes или no." );
                }
            } while (checkContinue(option)); 
        } 
    }

    private static boolean checkContinue(String option) {
        return (!option.equals("yes") && !option.equals("no"));
    }

    private static boolean checkIntPosNum(float num) {
        return (num % 1 == 0 && num >= 0);
    }
}

