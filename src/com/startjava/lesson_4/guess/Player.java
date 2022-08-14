package com.startjava.lesson_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int trys;
    private int wins;
    private int[] chosenNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getChosenNum(int i) {
        return chosenNums[i];
    }

    public int[] getChosenNums(int i) {
        return Arrays.copyOf(chosenNums, i);
    }

    public void resetChosenNums(int length) {
        Arrays.fill(chosenNums, 0, length, 0);
    }

    public void setChosenNum(int chosenNum, int i) {
        if (chosenNum > 0 && chosenNum <= 100) {
            this.chosenNums[i] = chosenNum;
        }
    }

    public int getTrys() {
        return trys;
    }

    public void setTrys(int trys) {
        this.trys = trys;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
