package com.startjava.lesson_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String option = "yes";
        Player[] players = createPlayers();
        Scanner scanner = new Scanner(System.in);
        while (option.equals("yes")) {
            GuessNumber game = new GuessNumber(players);
            game.play();
            do {
                System.out.println("Хотите сыграть еще раз? [yes / no] " );
                option = scanner.nextLine();
                if (checkContinue(option)) {
                    System.out.println("Некорректный ответ. Пожалуйста введите yes или no." ); 
                }
            } while (checkContinue(option)); 
        } 
    }

    private static boolean checkContinue(String option) {
        return (!option.equals("yes") && !option.equals("no"));
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите имя игрока № " + (i + 1) + " :");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }


}