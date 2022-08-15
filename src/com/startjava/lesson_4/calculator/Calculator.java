package com.startjava.lesson_4.calculator;

public class Calculator {
    public static int calculate(String mathAction) throws InvalidValuesException {
        String[] mathElements = mathAction.split(" ");
        float num1 = Float.parseFloat(mathElements[0]);
        float num2 = Float.parseFloat(mathElements[2]);
        char sign = mathElements[1].charAt(0);
        if (!(checkIntPosNum(num1) && checkIntPosNum(num2))) {
            throw new InvalidValuesException();
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
    private static boolean checkIntPosNum(float num) {
        return (num % 1 == 0 && num >= 0);
    }
}

class InvalidValuesException extends Exception {}