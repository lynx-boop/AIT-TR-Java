package practice;
import practice.string_builder.StringBuilderAppl;

import java.util.Scanner;

//Task 1. The program specifies two integers. Find the minimum of them using the ternary operator.
//Supplement the program with the ability to enter numbers by the user.

public class TerOperator {
    public static void main(StringBuilderAppl[] args) {
        int a = 123;
        int b = -745;

        int min1 = (a < b) ? a : b;
        System.out.println("Минимум = " + min1);

        Scanner scanner = new Scanner(System.in); //включаем считывание с клавиатуры
        System.out.println("Input first number:");
        int num1 = scanner.nextInt();//получает число, введенное с клавиатуры пользователем
        System.out.println("Input second number:");
        int num2 = scanner.nextInt();

        int min2 = (num1 < num2) ? num1 : num2;
        System.out.println("Минимум = " + min2);
    }
};
