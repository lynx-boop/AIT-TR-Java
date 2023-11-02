import java.util.Scanner;

// Задача 3. В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет. Использовать цикл for.
public class Sber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of contribution: ");
        double amount = scanner.nextDouble();
        System.out.println("Input term: ");
        int term = scanner.nextInt();
        double percent = 0.03;
        calculate(amount, term, percent);
    }
    // заводим метод, который будет принимать кол-во лет (term)], сумму вклада (amount) и процент
    // в цикле умножаем сумму вклада с каждым годом (i)
    public static double calculate(double amount, int term, double percent) {
        for (int i = 1; i <= term ; i++) {
            amount = amount + amount*percent;
        }
        System.out.print("Your amount after " + term);
        System.out.printf(" years will be: %.2f", amount); //выводим сумму с двумя точками после запятой
        return amount;
    }
}
