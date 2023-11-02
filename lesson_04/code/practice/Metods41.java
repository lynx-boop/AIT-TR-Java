package practice;

import practice.string_builder.StringBuilderAppl;

public class Metods41 {
    public static void main(StringBuilderAppl[] args) {
        int a,b; //определили переменные
        a = 3;
        b = 4;
        int c = hypotenuse(a, b); //квадрат гипотенузы
        System.out.println(c);

        int d;
        d = -46;
        int mod = module(d);
        System.out.println(mod);

        int f;
        f = 10;
        int cube = getCube(f);
        System.out.println(cube);
    };
    public static int hypotenuse(int a, int b){
        return a*a+b*b;
    };
    public static int module(int d) {
        return -d;
    };

    public static int getCube(int f){
        return f*f*f;
    };
}
