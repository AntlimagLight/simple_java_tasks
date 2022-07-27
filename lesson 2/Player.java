import java.util.Scanner;

public class Player {

    private String name;
    private int chosenNum;

    public Player() {
        this("Player1");
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getChosenNum() {
        return chosenNum;
    }

    public void choseNumber() {
        Scanner scanner = new Scanner(System.in);
        chosenNum = scanner.nextInt();
    }

}