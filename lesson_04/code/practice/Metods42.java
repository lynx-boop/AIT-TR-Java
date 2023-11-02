package practice;

import practice.string_builder.StringBuilderAppl;

public class Metods42 {
    public static void main(StringBuilderAppl[] args) {
        System.out.println(sumDigits(76));
    }
    public static int sumDigits(int n){
        //первую цифру
        int c1 = n/10;
        //вторую цийру
        int c2 = n%10;
        //сложить цифры
        //получить
        return c1+c2;
    }
}
