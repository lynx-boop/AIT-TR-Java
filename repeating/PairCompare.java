import java.util.Arrays;
import java.util.Scanner;

// Задача 4. Ввести с клавиатуры 10 пар целых чисел.
// Сравните числа в каждой паре и напечатайте большие из них.
// Использовать цикл for.
public class PairCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // заводим массив, будем записывать в него пары цифр
        int[] arrayOfPairs = new int[20];
        int count = 1;
        for (int i = 0; i < arrayOfPairs.length; i++) {
            //чтобы сделать предложение пользователю внести цифру в пару было правильным,
            //выводим разные сообщения, в зависимости от четности i
            if(i%2 != 0) {
                System.out.println("Input second digit of " + (count) + " pair");
            } else System.out.println("Input first digit of " + (count--) + " pair");
            arrayOfPairs[i] = scanner.nextInt();
            count++;
        }
        System.out.println(Arrays.toString(arrayOfPairs));
        for (int i = 0; i < arrayOfPairs.length; i++) {
            if (arrayOfPairs[i] > arrayOfPairs[i+1]) {
                System.out.println(arrayOfPairs[i] + " more, than " + arrayOfPairs[i+1]);
            } else if (arrayOfPairs[i] < arrayOfPairs[i+1]) {
                System.out.println(arrayOfPairs[i] + " less, than " + arrayOfPairs[i+1]);
            } else System.out.println(arrayOfPairs[i] + " and " + arrayOfPairs[i+1] + " are similar");
            i++; // пропускаем следующий i, т.к. нам нужно сравнивать пары, а не числа
        }
    }
}
