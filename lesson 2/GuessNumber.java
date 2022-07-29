import java.util.Scanner;

public class GuessNumber {

    private int hiddenNum;
    private Player player1;
    private Player player2;
    private int turnOrder;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("Начинается игра между игроками: " + player1.getName() + " и " + 
                player2.getName() + " Загадано новое число!");
        hiddenNum = (int) (Math.random() * 100) + 1;
        turnOrder = 1;
        while (true) {
            player1.setChosenNum(choseNumber());
            if (checkNumber(player1.getChosenNum())) {
                System.out.println("Победитель - " + player1.getName());
                break;
            }
            turnOrder++;
            player2.setChosenNum(choseNumber());
            if (checkNumber(player2.getChosenNum())) {
                System.out.println("Победитель - " + player2.getName());
                break;
            }
            turnOrder--;
        }
    }

    private int choseNumber() {
        if (turnOrder == 1) {
            System.out.println(player1.getName() + ", ваш ход. Введите число: ");
        } else {
            System.out.println(player2.getName() + ", ваш ход. Введите число: ");
        }
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private boolean checkNumber(int enteredNum) {
        if (enteredNum > hiddenNum) {
            System.out.println("Число " + enteredNum + " больше того, что загадал компьютер.");
        } else if (enteredNum < hiddenNum) {
            System.out.println("Число " + enteredNum + " меньше того, что загадал компьютер.");
        } else {
            System.out.println("Поздравляем! Вы угадали число!");
            return true;
        }
        return false;
    }

}