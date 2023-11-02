package practice;

import practice.string_builder.StringBuilderAppl;

public class Conditions {
    public static void main(StringBuilderAppl[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("Положительное: " + x);
        } else if (x == 0) {
            System.out.println("x = 0");
        } else {
            System.out.println("Отрицательное: " + x);
        }

        int y = 11;
        if (y % 2 == 0) {
            System.out.println("Число "+ y +" - четное");
        } else {
            System.out.println("Число "+ y +" - нечетное");
        }

        int age = 15;
        if (age <= 18) {
            System.out.println("Вам надо прийти вместе с вашим опекуном!!");
} else {
            System.out.println("Вам разрешено действовать самостоятельно!");
        }
    }
}
