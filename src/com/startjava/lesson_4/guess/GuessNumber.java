package com.startjava.lesson_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNum;

    private Player[] players;

    public GuessNumber(Player[] Players) {
        this.players = Players;
    }

    public void play() {
        System.out.println("Начинается игра между игроками: " + Arrays.toString(players));
        for (int round = 1; round <= 3; round++) {
            System.out.println("\nРАУНД - " + round + "\nЗагадано новое число! У каждого игрока 10 попыток!");
            hiddenNum = (int) (Math.random() * 100) + 1;
            for (Player player : players) {
                player.reset(round);
                player.setTryNumber(0);
            }
            castLots();
            boolean endChecker = true;
            while (endChecker) {
                for (Player player : players) {
                    if (makeTurn(player)) {
                        endChecker = false;
                        break;
                    }
                }
                int countLooses = 0;
                for (Player player : players) {
                    if (player.getTryNumber() >= 10) {
                        countLooses++;
                    }
                    if (countLooses >= players.length) {
                        System.out.println("У всех игроков закончились попытки! Победителя в раунде нет! " +
                                "Загаданное число " + "- " + hiddenNum);
                        endChecker = false;
                    }
                }
            }
            outputPlayersTrys();
        }
        congratsWinners();
    }

    private void castLots() {
        Random rnd = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Player tmp = players[index];
            players[index] = players[i];
            players[i] = tmp;
        }
        System.out.println("Брошен жребий: Порядок хода игроков на этот раунд: " + Arrays.toString(players));
    }

    private boolean makeTurn(Player currentPlayer) {
        if (currentPlayer.getTryNumber() < 10) {
            currentPlayer.addNum(choseNumber(currentPlayer));
            if (currentPlayer.getChosenNum() == 0) {
                System.out.println("Число должно быть в интервале от 1 до 100, попытка не засчитана, ход передан " +
                        "следующему " + "игроку!");
                currentPlayer.setTryNumber(currentPlayer.getTryNumber() - 1);
            } else {
                if (checkNumber(currentPlayer.getChosenNum())) {
                    System.out.println("Победитель раунда - " + currentPlayer.getName() + " / угадано с попытки №" +
                            (1 + currentPlayer.getTryNumber()));
                    currentPlayer.incrementWin(currentPlayer.getWins() + 1);
                    return true;
                }
            }
            currentPlayer.setTryNumber(currentPlayer.getTryNumber() + 1);
            System.out.println ("У " + currentPlayer.getName() + " осталось " + (10 - currentPlayer.getTryNumber()) +
                    " попыток");
            return false;
        } else {
            System.out.println ("> У " + currentPlayer.getName() + " закончились попытки!");
            return false;
        }
    }

    private int choseNumber(Player currentPlayer) {
        System.out.println("> " + currentPlayer.getName() + ", ваш ход. Введите число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private boolean checkNumber(int enteredNum) {
        System.out.println (enteredNum == hiddenNum ? "Поздравляем! Вы угадали число!" : "Неверно! Число " + enteredNum
                + (enteredNum > hiddenNum ? " больше" : " меньше") + " того, что загадал компьютер.");
        return enteredNum == hiddenNum;
    }

    private void outputPlayersTrys() {
        for (Player player : players) {
            int[] playerTrys = player.getChosenNums();
            System.out.println("Попытки игрока: " + player.getName());
            for (int num : playerTrys) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private void congratsWinners() {
        int winScore = -1;
        for (int i = 0; i < 3; i++) {
            System.out.println(players[i].getName() + " победил в " + players[i].getWins() + " раундах ");
            if (players[i].getWins() > winScore) {
                winScore = players[i].getWins();
            }
        }
        if (players[0].getWins() == players[1].getWins() && players[0].getWins() == players[2].getWins()) {
            System.out.println("Счет всех игроков одинаков! Ничья, победила дружба!");
        } else {
            String winners = "Поздравляем с победой: ";
            for (int i = 0; i < 3; i++) {
                if (players[i].getWins() == winScore) {
                    winners = winners.concat(players[i].getName() + " ");
                }
            }
            System.out.println(winners);
        }
    }
}