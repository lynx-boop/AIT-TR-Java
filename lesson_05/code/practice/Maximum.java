package practice;

import practice.string_builder.StringBuilderAppl;

public class Maximum {
    public static void main(StringBuilderAppl[] args) {
        int a = 20;
        int b = -50;
        int max = maximum2(a, b);
        System.out.println("Max = "+max);

        int c = 60;
        int max3 = maximum3(a, b, c);
        System.out.println(max3);
    }

    public static int maximum2(int a, int b) {
        int max = 0;
        if(a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int maximum3(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            max = a;
        } else if (b > c) {
            max = b;
        } else max = c;
        return max;
    }
}
