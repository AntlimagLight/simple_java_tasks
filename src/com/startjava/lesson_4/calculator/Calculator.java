package com.startjava.lesson_4.calculator;

public class Calculator {

    private static int num1;
    private static int num2;
    private static char sign;

    public static void setNum1(int num1) {
        Calculator.num1 = num1;
    }

    public static void setNum2(int num2) {
        Calculator.num2 = num2;
    }

    public static void setSign(char sign) {
        Calculator.sign = sign;
    }

    public static int calculate() {
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> (num1 / num2);
            case '^' -> (int) Math.pow(num1, num2);
            default -> throw new IllegalArgumentException("Недопустимая операция!");
        };
    }
}

