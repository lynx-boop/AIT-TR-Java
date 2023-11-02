package practice;

import practice.string_builder.StringBuilderAppl;

public class Variables {
    public static void main(StringBuilderAppl[] args) {
        int a = 2;
        int b = 3;
        int res;
        if (a==b){
            res = (a+b)*5;
            System.out.println(res);
        } else {
            res = (a-b)*5;
            System.out.println(res);
        };
    }
}
