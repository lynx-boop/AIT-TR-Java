package homework;

public class Triangle5 {
    public static void main(String[] args) {
        //объявляем стороны
        int a = 8;
        int b = 6;
        int c = 9;
        //объявляем их суммы и записываем в переменные
        int ab = a+b;
        int ac = a+c;
        int bc = b+c;
        //объявляем условие
        if (a<bc & b<ac & c<ab) {//__любая__ из сторон должна быть меньше суммы двух других
            System.out.println("Такой треугольник существует!");//если оно соблюдено, треугольник существует
        } else System.out.println("Такого треугольника нет");//а __иначе (else)__ - не существует
    }
}
