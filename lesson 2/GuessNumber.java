public class GuessNumber {

    private int hiddenNum;
    private int enteredNum;

    public void setEnteredNum(int enteredNum) {
        this.enteredNum = enteredNum;
    }

    public void randomizeNumber() {
        hiddenNum = (int) (Math.random() * 100) + 1;
        System.out.println("Число " + hiddenNum + " Загадано."); // Вспомогательно
    }

    public boolean tryToGuess() {
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

}