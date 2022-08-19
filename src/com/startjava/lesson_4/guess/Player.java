package com.startjava.lesson_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int tryNumber;
    private int wins = 0;
    private int[] chosenNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public int getChosenNum() {
        return chosenNums[tryNumber];
    }

    public int[] getChosenNums() {
        return Arrays.copyOf(chosenNums, tryNumber);
    }

    public void reset(int round) {
        if (round == 1) {
            wins = 0;
        }
        Arrays.fill(chosenNums, 0, tryNumber, 0);
    }

    public void addNum(int chosenNum) {
        if (chosenNum > 0 && chosenNum <= 100) {
            chosenNums[tryNumber] = chosenNum;
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
}
