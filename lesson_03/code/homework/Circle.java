package homework;

public class Circle {
    public static void main(String[] args) {
        //S = π * r * r, где r — это радиус, π — это константа,
        // которая выражает отношение длины окружности к диаметру, она приблизительно равна 3,14
        double pi = pi(); //передаем сюда результат выполнения метода pi()
        double square = circleSquare(pi,5); //передаем сюда результат выполнения метода circleSquare()
        printCircleSquare(square); //вызываем метод printCircleSquare и передаем в него square
    };
    public static double pi() { //return only objects with type double
        //возвращает только объект типа double
        return 3.1415926;
    }
    public static double circleSquare(double pi, double radius) { //возвращает объект строго типа double
        return pi*radius*radius;
    };
    public static void printCircleSquare(double square){
        System.out.println("Sircle square = " + square);
    };
}
