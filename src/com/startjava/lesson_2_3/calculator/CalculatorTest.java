package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String option = "yes";
        while (option.equals("yes")) {
            Calculator operation = new Calculator();
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Введите первое число: ");
            int num1 = scanner.nextInt();
            operation.setNum1(num1);
            System.out.println(" Введите знак математической операции: ");
            char sign = (char) scanner.next().charAt(0);
            operation.setSign(sign);
            System.out.println(" Введите второе число: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();
            operation.setNum2(num2);
            System.out.println(" Результат вычислений: " + num1 + " " + sign + " " + num2 + " = " +
                    operation.calculate() + "\n");
            do {
                System.out.println(" Хотите продолжить вычисление? [yes / no] " );
                option = scanner.nextLine();
                if (checkContinue(option)) {
                    System.out.println(" Некорректный ответ. Пожалуйста введите yes или no." ); 
                }
            } while (checkContinue(option)); 
        } 
    }

    private static boolean checkContinue(String option) {
        return (!option.equals("yes") && !option.equals("no"));
    }


}