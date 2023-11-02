package practice;

import practice.string_builder.StringBuilderAppl;

//распечатать в консоль таблицу умножения от 1 до 10
public class Multiply09 {
    public static void main(StringBuilderAppl[] args) {
        int a = 1;
        int b = 1;

        while (a <= 10) {
            while(b <= 10) {
                System.out.print(a + " * " + b + " = " + a * b + " | ");
                b++;
            }
            System.out.println();
            b = 1;
            a++;
        }
    }
}
