import java.util.Scanner;

public class GuessNumber {

    private int hiddenNum;
    private Player player1;
    private Player player2;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int choseNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean checkNumber(int enteredNum) {
            if (enteredNum > hiddenNum) {
                System.out.println("Число " + enteredNum + " больше того, что загадал компьютер.");
                return false;
            } else if (enteredNum < hiddenNum) {
                System.out.println("Число " + enteredNum + " меньше того, что загадал компьютер.");
                return false;
            } else {
                System.out.println("Поздравляем! Вы угадали число!");
                return true;
            }
    }

    public void playGame() {
        System.out.println("Начинается игра между игроками: " + player1.getName() + " и " + 
                player2.getName() + " Загадано новое число!");
        hiddenNum = (int) (Math.random() * 100) + 1;
        while (true) {
            System.out.println(player1.getName() + ", ваш ход. Введите число: ");
            player1.setChosenNum(this.choseNumber());
            if (this.checkNumber(player1.getChosenNum()) == true) {
                System.out.println("Победитель - " + player1.getName());
                break;
            }
            System.out.println(player2.getName() + ", ваш ход. Введите число: ");
            player2.setChosenNum(this.choseNumber());
            if (this.checkNumber(player2.getChosenNum()) == true) {
                System.out.println("Победитель - " + player2.getName());
                break;
            }
        }
    }

}