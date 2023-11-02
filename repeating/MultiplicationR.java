import java.util.Arrays;

// Задача 5. Найти произведение двузначных нечетных чисел кратных 17.
public class MultiplicationR {
    public static void main(String[] args) {
        int multiDigit = 17;
        int multiplication = 1;
        int start = 10;
        //двузначных чисел всего 90
        int[] digitsD = new int[90];
        //создаем массив двузначных чисел, начинающийся с 10 (start = 10)
        for (int i = 0; i < digitsD.length; i++) {
            digitsD[i] = start++;
        }
        System.out.println(Arrays.toString(digitsD));

        for (int i = 0; i < digitsD.length; i++) {
            //элемент массива делится без остатка на 17 и не делится - на 2
            if (digitsD[i] % multiDigit == 0 && digitsD[i] % 2 != 0) {
                System.out.println(digitsD[i]);
                multiplication *= digitsD[i];
            }
        }
        System.out.println(multiplication);
    }
}