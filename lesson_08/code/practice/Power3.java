package practice;

import practice.string_builder.StringBuilderAppl;

public class Power3 {
    public static void main(StringBuilderAppl[] args) {
        int count = 0;
        int res = 1;

        while(count < 10) {
            res = res * 3;
            System.out.println(res + " 3 in power " + count);
            count++;
        }
    }
}
