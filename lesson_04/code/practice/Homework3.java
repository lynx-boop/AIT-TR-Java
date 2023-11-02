package practice;

import practice.string_builder.StringBuilderAppl;

public class Homework3 {
    public static void main(StringBuilderAppl[] args) {
        //КУБ
        // V = a*a*a where a is a side of cube
        // V = a*a*a, где а - это сторона куба

        //S = 6a^2 Площадь поверхности куба равна квадрату длины его грани умноженному на шесть
        int a = 4;
        System.out.println("Обьем куба = " + cubeVolume(a));
        System.out.println("Площадь куба = " + cubeSquare(a));
        //ТРЕУГОЛЬНИК
        // S = 1/2 (a × h), where a is base of triangle and h is height
        // S = 1/2 (a × h), где a - это основание и h это высотa
        System.out.println("Площадь треугольника = " + triangleSquare(5,9));
    }
    public static double cubeVolume(double a) {
        return Math.pow(a,3);
    }

    public static double cubeSquare(double a){
        return Math.pow(a,2)*6;
    }
    public static double triangleSquare(double a, double h) {
        return a*h/2;
    }
    }
