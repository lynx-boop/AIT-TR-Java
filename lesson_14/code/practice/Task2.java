package practice;

import practice.string_builder.StringBuilderAppl;

public class Task2 {
    public static void main(StringBuilderAppl[] args) {
        int n = 31;
        int f = factorial(n);
        System.out.println("Factorial " + n + " = " + f);
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n ; i++) {
            f = f * i;
        }
        return f;
    }
}
