package homework;

public class Rectangle {
    public static void main(String[] args) {
        //S = a × b, where S is square of rectangle; a, b — length and width
        //S = a × b, где S это площадь прямоугольника; a,b - длина и ширина соответсвенно
       int square = rectangleSquare(22,1);
        printRectangleSquare(square);
    };
    public static int rectangleSquare(int length, int width) { //возвращает объект строго типа int
       return length*width;
    };
    public static void printRectangleSquare(int square){
        System.out.println("Rectangle square = "+square);
    };
}
