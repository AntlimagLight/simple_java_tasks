import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String continueCheck = "yes";
        int num1;
        int num2;
        char sign;
        while (continueCheck.equals("yes")) {
            Calculator operation = new Calculator();
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Введите первое число: ");
            num1 = scanner.nextInt();
            operation.setNum1(num1);
            System.out.println(" Введите знак математической операции: ");
            sign = (char) scanner.next().charAt(0);
            operation.setSign(sign);
            System.out.println(" Введите второе число: ");
            num2 = scanner.nextInt();
            scanner.nextLine();
            operation.setNum2(num2);
            operation.calculation();
            System.out.println(" Результат вычислений: " + num1 + " " + sign + " " + num2 + " = " +
                    operation.getResult() + "\n");
            do {
                System.out.println(" Хотите продолжить вычисление? [yes / no] " );
                continueCheck = scanner.nextLine();
                if (!continueCheck.equals("yes") & !continueCheck.equals("no")) {
                    System.out.println(" Некорректный ответ. Пожалуйста введите yes или no." ); 
                }
            } while (!continueCheck.equals("yes") & !continueCheck.equals("no")); 
        } 
    }
}