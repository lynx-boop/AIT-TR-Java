package practice;

import practice.string_builder.StringBuilderAppl;

public class Division {
    public static void main(StringBuilderAppl[] args) {
        int m = 100;
        int n = 7;

        int cel = m/n; //выведет 14, т.к. остаток от деления 100 на 7 опускается
        System.out.println(cel);

        int ost = m%n; //выведет 2, т.к. остаток от деления 100 на 7 будет 2
        System.out.println(ost);

        int a = 27;
        int b = 9;

        int ost0 = a%b; //ввыедет 0, т.к. остаток от деления 27 на 9 будет 0
        System.out.println(ost0);
    }
}
