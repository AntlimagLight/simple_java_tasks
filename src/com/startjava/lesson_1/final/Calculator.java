package com.startjava.lesson_1;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char sign = '+'; //Знак операции
        int result = 1;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        } else if (sign == '^') {
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}