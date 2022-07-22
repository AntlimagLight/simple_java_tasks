public class MyFirstGame {
    public static void main(String[] args) {
        int i = 0;
        int hiddenNum = (int) (Math.random() * 100) + 1; //Загаданное число
        // Симулятор потуг игрока
        int enteredNum = 50;
        do {
            if (enteredNum > hiddenNum) {
                System.out.println("Число " + enteredNum + " больше того, что загадал компьютер.");
                enteredNum--;
            } else if (enteredNum < hiddenNum) {
                System.out.println("Число " + enteredNum + " меньше того, что загадал компьютер.");
                enteredNum++;
            }
        } while (enteredNum != hiddenNum);
        // Признание игрой фантастического успеха игрока
        System.out.println("Вы победили! Загаданное число: " + hiddenNum);
    }
}