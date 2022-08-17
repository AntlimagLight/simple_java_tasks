package com.startjava.lesson_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNum;

    private Player[] Players;

    public GuessNumber(Player[] Players) {
        this.Players = Players;
    }

    public void play() {
        System.out.println("Начинается игра между игроками: " + Players[0].getName() + ", " +
                Players[1].getName() + " и " + Players[2].getName() + "!");
        for (int i = 0; i < 3; i++) {
            Players[i].setWins(0);
        }
        for (int round = 1; round <=3; round++) {
            System.out.println("\nРАУНД - " + round + "\nЗагадано новое число! У каждого игрока 10 попыток!");
            hiddenNum = (int) (Math.random() * 100) + 1;
            for (int i = 0; i < 3; i++) {
                Players[i].setTrys(10);
            }
            shufflePlayers();
            turns:
            while (true) {
                for (int i = 0; i < 3; i++) {
                    if (makeTurn(Players[i])) {
                        break turns;
                    }
                }
                if (Players[0].getTrys() <= 0 && Players[1].getTrys() <= 0 && Players[2].getTrys() <= 0) {
                    System.out.println("У всех игроков закончились попытки! Победителя в раунде нет! Загаданное число "
                            + "- " + hiddenNum);
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                outputPlayerTrys(Players[i]);
            }
        }
        congratsWinners();
    }

    private int choseNumber(Player currentPlayer) {
        System.out.println("> " + currentPlayer.getName() + ", ваш ход. Введите число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private boolean checkNumber(int enteredNum) {
        System.out.println (enteredNum > hiddenNum ? "Неверно! Число " + enteredNum + " больше того, что загадал " +
                "компьютер." : (enteredNum < hiddenNum ? "Неверно! Число " + enteredNum + " меньше того, что загадал " +
                "компьютер." : "Поздравляем! Вы угадали число!"));
        return enteredNum == hiddenNum;
    }

    private void outputPlayerTrys(Player currentPlayer) {
        int [] playerTrys = currentPlayer.getChosenNums();
        System.out.println("Попытки игрока: " + currentPlayer.getName());
        for (int oneTry : playerTrys) {
            System.out.print(oneTry + " ");
        }
        currentPlayer.resetChosenNums();
        System.out.println();
    }

    private boolean makeTurn(Player currentPlayer) {
        if (currentPlayer.getTrys() > 0) {
            currentPlayer.addNum(choseNumber(currentPlayer), 10 - currentPlayer.getTrys());
            if (currentPlayer.getChosenNum() == 0) {
                System.out.println("Число должно быть в интервале от 1 до 100, попытка не засчитана, ход передан " +
                        "следующему " + "игроку!");
                currentPlayer.setTrys(currentPlayer.getTrys() + 1);
            } else {
                if (checkNumber(currentPlayer.getChosenNum())) {
                    System.out.println("Победитель раунда - " + currentPlayer.getName() + " / угадано с попытки №" +
                            (11 - currentPlayer.getTrys()));
                    currentPlayer.setWins(currentPlayer.getWins() + 1);
                    return true;
                }
            }
            currentPlayer.setTrys(currentPlayer.getTrys() - 1);
            System.out.println ("У " + currentPlayer.getName() + " осталось " + currentPlayer.getTrys() + " попыток");
            return false;
        } else {
            System.out.println ("> У " + currentPlayer.getName() + " закончились попытки!");
            return false;
        }
    }

    private void congratsWinners() {
        int winScore = -1;
        for (int i = 0; i < 3; i++) {
            System.out.println(Players[i].getName() + " победил в " + Players[i].getWins() + " раундах ");
            if (Players[i].getWins() > winScore) {
                winScore = Players[i].getWins();
            }
        }
        if (Players[0].getWins() == Players[1].getWins() && Players[0].getWins() == Players[2].getWins()) {
            System.out.println("Счет всех игроков одинаков! Ничья, победила дружба!");
        } else {
            String winners = "Поздравляем с победой: ";
            for (int i = 0; i < 3; i++) {
                if (Players[i].getWins() == winScore) {
                    winners = winners.concat(Players[i].getName() + " ");
                }
            }
            System.out.println(winners);
        }
    }

    private void shufflePlayers() {
        Random rnd = new Random();
        for (int i = Players.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Player tmp = Players[index];
            Players[index] = Players[i];
            Players[i] = tmp;
        }
        System.out.println (Players[0].getName() + " выиграл жребий и ходит первым, " + Players[1].getName() +
                " ходит вторым, " + Players[2].getName() + " ходит третьим.");
    }

}