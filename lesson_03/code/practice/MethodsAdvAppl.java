package practice;

import practice.string_builder.StringBuilderAppl;

public class MethodsAdvAppl {
    public static void main(StringBuilderAppl[] args) {
        //длина окружности L = 2*Pi*r
        double constant = pi();
        System.out.println(constant);
        printPi(constant);
        double res = circleLength(100); //in parentheses there are radius of a round
                                              //в круглых скобках указан радиус окружности
        System.out.println("L = "+res);
    }
    public static double pi() { //return only objects with type double
                                //возвращает только объект типа double
        double pi = 3.1415926;
        return pi;
    }

    public static void printPi(double pi){
        System.out.println("Pi = "+pi);
    };

    public static double circleLength(double radius) {

        double l = 2*pi()*radius;
        return l;
    };
}
