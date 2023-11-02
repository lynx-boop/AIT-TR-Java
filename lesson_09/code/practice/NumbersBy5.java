package practice;

import practice.string_builder.StringBuilderAppl;

//распечатать в консоли все числа от 1 до 100, которые делятся на 5
public class NumbersBy5 {
    public static void main(StringBuilderAppl[] args) {
        int min = 1;
        int max = 100;
        int dis = 5;
        while (min < max) {
            if (min % dis == 0) {
                System.out.print(min + ", ");
            }
            min++;
        }
    }
}
