package practice;

import practice.string_builder.StringBuilderAppl;

public class Rocket {
    public static void main(StringBuilderAppl[] args) {
        int countDown = 10;
        while (countDown >= 0) {
            System.out.println(countDown);
            countDown--;//изменение параметра цикла
        }
        System.out.println("Let`s fly!");
    }
}
