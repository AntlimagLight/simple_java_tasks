package com.startjava.lesson_4.calculator;

public class Calculator {
    public static int calculate(String expression) {
        String[] mathElements = expression.split(" ");
        float num1 = Float.parseFloat(mathElements[0]);
        float num2 = Float.parseFloat(mathElements[2]);
        char sign = mathElements[1].charAt(0);
        if (!(isNumValid(num1) && isNumValid(num2))) {
            throw new InvalidNumException();
        }
        return switch (sign) {
            case '+' -> Math.addExact((int) num1, (int) num2);
            case '-' -> Math.subtractExact((int) num1, (int) num2);
            case '*' -> Math.multiplyExact((int) num1, (int) num2);
            case '/' -> ((int) num1 / (int) num2);
            case '^' -> (int) Math.pow((int) num1, (int) num2);
            default -> throw new IllegalArgumentException("Недопустимая операция!");
        };
    }
    private static boolean isNumValid(float num) {
        return (num % 1 == 0 && num >= 0);
    }
}

class InvalidNumException extends RuntimeException {}