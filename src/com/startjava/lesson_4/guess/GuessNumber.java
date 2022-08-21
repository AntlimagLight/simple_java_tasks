package com.startjava.lesson_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber;

    private static final int COUNT_TRIES = 10;

    private static final int COUNT_ROUNDS = 3;

    private Player[] players;

    public GuessNumber(Player[] Players) {
        this.players = Players;
    }

    public static int getCountTries() {
        return COUNT_TRIES;
    }

    public void play() {
        System.out.println("Начинается игра между игроками: " + Arrays.toString(players));
        for (int round = 1; round <= COUNT_ROUNDS; round++) {
            System.out.println("\nРАУНД - " + round + "\nЗагадано новое число! У каждого игрока " + COUNT_TRIES + " попыток!");
            hiddenNumber = (int) (Math.random() * 100) + 1;
            for (Player player : players) {
                player.reset(round);
                player.setTryNumber(0);
            }
            castLots();
            boolean guessed = true;
            do {
                for (Player player : players) {
                    if (makeTurn(player)) {
                        guessed = false;
                        break;
                    }
                }
                if (players[players.length - 1].getTryNumber() >= COUNT_TRIES) {
                    System.out.println("У всех игроков закончились попытки! Победителя в раунде нет! " +
                            "Загаданное число " + "- " + hiddenNumber);
                    guessed = false;
                }
            } while (guessed);
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
        if (currentPlayer.getTryNumber() < COUNT_TRIES) {
            currentPlayer.addNumber(choseNumber(currentPlayer));
            currentPlayer.setTryNumber(currentPlayer.getTryNumber() + 1);
            if (currentPlayer.getChosenNumber() == 0) {
                System.out.println("Число должно быть в интервале от 1 до 100, попытка не засчитана, ход передан " +
                        "следующему " + "игроку!");
            } else if (checkNumber(currentPlayer.getChosenNumber())) {
                System.out.println("Победитель раунда - " + currentPlayer.getName() + " / угадано с попытки №" +
                        (1 + currentPlayer.getTryNumber()));
                currentPlayer.incrementWin(currentPlayer.getWins() + 1);
                return true;
            }
            System.out.println ("У " + currentPlayer.getName() + " осталось " + (COUNT_TRIES - currentPlayer.getTryNumber()) +
                    " попыток");
            return false;
        }
        System.out.println("> У " + currentPlayer.getName() + " закончились попытки!");
        return false;
    }

    private int choseNumber(Player currentPlayer) {
        System.out.println("> " + currentPlayer.getName() + ", ваш ход. Введите число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private boolean checkNumber(int enteredNumber) {
        if (enteredNumber == hiddenNumber) System.out.println("Поздравляем! Вы угадали число!");
        else System.out.println("Неверно! Число " + enteredNumber +
                (enteredNumber > hiddenNumber ? " больше" : " меньше") + " того, что загадал компьютер.");
        return enteredNumber == hiddenNumber;
    }

    private void outputPlayersTrys() {
        for (Player player : players) {
            int[] playerTrys = player.getChosenNumbers();
            System.out.println("Попытки игрока: " + player.getName());
            for (int playerTry : playerTrys) {
                System.out.print(playerTry + " ");
            }
            System.out.println();
        }
    }

    private void congratsWinners() {
        int winScore = -1;
        for (Player player : players) {
            System.out.println(player.getName() + " победил в " + player.getWins() + " раундах ");
            if (player.getWins() > winScore) {
                winScore = player.getWins();
            }
        }
        if (checkDraw()) {
            System.out.println("Счет всех игроков одинаков! Ничья, победила дружба!");
        } else {
            String winners = "Поздравляем с победой: ";
            for (Player player : players) {
                if (player.getWins() == winScore) {
                    winners = winners.concat(player.getName() + " ");
                }
            }
            System.out.println(winners);
        }
    }

     private boolean checkDraw() {
         for (int i = 1; i < players.length; i++) {
             if (players[i].getWins() != players[i - 1].getWins()) return false;
         }
         return true;
     }
}