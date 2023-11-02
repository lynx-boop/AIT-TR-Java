import java.util.Scanner;
// Задача 1. Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
// Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.
public class SumR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = scanner.nextInt();
        double sum = 0;

        //в цикле проходимся по всем значениям, включая n, суммируем их результаты деления
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
            System.out.printf("%.2f", sum);
            System.out.println();
        }
        System.out.printf("Final sum: %.2f", sum);
    }
}
