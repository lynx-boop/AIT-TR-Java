package practice;

import practice.string_builder.StringBuilderAppl;

import java.util.Scanner;

public class Task1 {
    public static void main(StringBuilderAppl[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) 1 / i;
        }
        System.out.printf("Sum = %.2f", sum);
    }
}
