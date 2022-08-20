package com.startjava.lesson_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int tryNumber;
    private int wins = 0;
    private int[] chosenNumbers = new int[GuessNumber.getChances()];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getChosenNumber() {
        return chosenNumbers[tryNumber];
    }

    public int[] getChosenNumbers() {
        return Arrays.copyOf(chosenNumbers, tryNumber);
    }

    public void reset(int round) {
        if (round == 1) {
            wins = 0;
        }
        Arrays.fill(chosenNumbers, 0, tryNumber, 0);
    }

    public void addNumber(int chosenNumber) {
        if (chosenNumber > 0 && chosenNumber <= 100) {
            chosenNumbers[tryNumber] = chosenNumber;
        }
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public void setTryNumber(int tryNumber) {
        this.tryNumber = tryNumber;
    }

    public int getWins() {
        return wins;
    }

    public void incrementWin(int win) {
        wins = win;
    }

    public String toString() {
        return name;
    }
}
