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

    public int getChosenNum() {
        return chosenNums[10 - trys];
    }

    public int[] getChosenNums() {
        if (chosenNums[11 - trys] == 0) {
            return Arrays.copyOf(chosenNums, 10 - trys);
        }
        return Arrays.copyOf(chosenNums, 11 - trys);
    }

    public void resetChosenNums() {
        Arrays.fill(chosenNums, 0, 11 - trys, 0);
        if (chosenNums[11 - trys] == 0) {
            Arrays.fill(chosenNums, 0, 10 - trys, 0);
        }
    }

    public void addNum(int chosenNum, int i) {
        if (chosenNum > 0 && chosenNum <= 100) {
            chosenNums[i] = chosenNum;
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
