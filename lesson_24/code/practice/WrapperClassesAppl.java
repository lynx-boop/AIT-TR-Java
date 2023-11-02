package practice;

import practice.string_builder.StringBuilderAppl;

public class WrapperClassesAppl {
    public static void main(StringBuilderAppl[] args) {
        //кол-во цифр в числе версия (делим на 10 до получения 0, цикл while)
        Integer x = 987654321; //это объект типа Integer
        String st = x.toString(); //преобразование цифр в строку
        int l = st.length(); //у строки есть длина, узнали ее длину
        System.out.println("Number of digits in = " + l);
        System.out.println("Max value of Integer = " + x.MAX_VALUE);
        System.out.println("Min value of Integer = " + x.MIN_VALUE);

        Double y = 2375.24;
        String st2 = y.toString();
        int l2 = st2.length();
        System.out.println("Number of digits in = " + l2);
        System.out.println("Max value of Double = " + y.MAX_VALUE);
        System.out.println("Min value of Double = " + y.MIN_VALUE);

        //присвоения и вычисления
        int n = 10;
        Integer m = 20;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        m = m + n; //произошли автораспаковка и автоупаковка
        System.out.println("m + n = " + m);

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.printf("Circle length = %.2f", circleLength);
        System.out.println();

        //константы классов оберток
        System.out.println("-----------------------Constants of Wrapper Classes");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Long MAX " + Long.MIN_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);
        System.out.println("Double MIN " + Double.MIN_VALUE);

        //обработка деления на 0
        System.out.println("-----------------------Not a number (Nan)");
        double a = 20.0/0;
        if(Double.isInfinite(a) || Double.isNaN(a)) { //получилась бесконечность или несуществующее ичисло
            System.out.println("Wrong operation or wrong result");
        } else System.out.println(a);

        //перевод String to number
        System.out.println("-----------------------Parsing String to number");
        String str = "07846545";
        int num = Integer.parseInt(str);
        System.out.println("String " + str + " = num " + num);

        String str2 = "2.7118281828";
        double e = Double.parseDouble(str2);
        System.out.println("E = " + e);
    }
}
