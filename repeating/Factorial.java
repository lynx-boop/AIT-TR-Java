import java.util.Scanner;
// Задача 2. Вводится n - натуральное число.
// Напишите метод, который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
// Вызовите полученный метод. При каком значении n происходит переполнение памяти, выделяемой для n типа int?
// Использовать цикл for.
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n = scanner.nextInt();
        //вызываем метод, в каестве аргумента передаем ему введенное с клавиатуры число
        System.out.println(getFactorial(n));
    }
    // пишем метод, где для каждого числа, начиная с 1, заканчивая n будет производится умножение
    // на произведение предыдущих чисел
    public static int getFactorial(int n) {
        int mult = 1;
        for (int i = 1; i <= n ; i++) {
            mult *= i;
        }
        return mult;
    }
}
