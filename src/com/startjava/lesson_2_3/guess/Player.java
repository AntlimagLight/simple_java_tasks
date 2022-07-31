package com.startjava.lesson_2_3.guess;

public class Player {

    private String name;
    private int chosenNum;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getChosenNum() {
        return chosenNum;
    }

    public void setChosenNum(int chosenNum) {
        this.chosenNum = chosenNum;
    }

}