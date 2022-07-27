import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String continueCheck = "yes";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        while (continueCheck.equals("yes")) {
            GuessNumber currentGame = new GuessNumber();
            currentGame.randomizeNumber();
            while (true) {
                System.out.println(player1.getName() + ", ваш ход. Введите число: ");
                player1.choseNumber();
                currentGame.setEnteredNum(player1.getChosenNum());
                if (currentGame.tryToGuess() == true) {
                    System.out.println("Победитель - " + player1.getName());
                    break;
                }
                System.out.println(player2.getName() + ", ваш ход. Введите число: ");
                player2.choseNumber();
                currentGame.setEnteredNum(player2.getChosenNum());
                if (currentGame.tryToGuess() == true) {
                    System.out.println("Победитель - " + player2.getName());
                    break;
                }
            }
            do {
                System.out.println("Хотите продолжить игру? [yes / no] " );
                continueCheck = scanner.nextLine();
                if (!continueCheck.equals("yes") & !continueCheck.equals("no")) {
                    System.out.println("Некорректный ответ. Пожалуйста введите yes или no." ); 
                }
            } while (!continueCheck.equals("yes") & !continueCheck.equals("no")); 
        } 
    }
}