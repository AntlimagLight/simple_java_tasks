package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String option = "yes";
        while (option.equals("yes")) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите математическое выражение: ");
                String expression = scanner.nextLine();
                System.out.println(expression + " = " + Calculator.calculate(expression));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Неверный формат выражения! [Вводите в формате X + Y]");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("Несуществующая операция! [доступные операции + - / * ^]");
                continue;
            } catch (InvalidNumException e) {
                System.out.println("Введенные числа должны быть положительными и целыми. Попробуйте еще раз.");
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
}