import java.util.Scanner;

public class GuessNumberTest {

    public static boolean checkContinue(String option) {
        return (!option.equals("yes") && !option.equals("no"));
    }

    public static void main(String[] args) {
        String option = "yes";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        while (option.equals("yes")) {
            GuessNumber currentGame = new GuessNumber(player1, player2);
            currentGame.playGame();
            do {
                System.out.println("Хотите продолжить игру? [yes / no] " );
                option = scanner.nextLine();
                if (checkContinue(option)) {
                    System.out.println("Некорректный ответ. Пожалуйста введите yes или no." ); 
                }
            } while (checkContinue(option)); 
        } 
    }
}