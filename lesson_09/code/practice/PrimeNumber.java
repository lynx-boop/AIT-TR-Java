package practice;
import practice.string_builder.StringBuilderAppl;

import java.util.Scanner;
//Пользователь вводит натуральное число n.
//Определите, является ли оно простым.
//Простое число - это такое число, которое делится только на себя и на 1.
//Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
public class PrimeNumber {
    public static void main(StringBuilderAppl[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();

        boolean isPrime = true;
        int division = 2;

        while (division < num) {
            if (num % division == 0) {
                isPrime = false;
                break;
            }
            division++;
        }
        System.out.println(num + " is prime: " + isPrime);
        }
    }
