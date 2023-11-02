package homework;

public class Square {
    public static void main(String[] args) {
        //S = a × a = a2, where S is square of a square, a is side
        //S = a × a = a2, где S это площадь квадрата, a - его сторона
        int square = squareSquare(20);
        printSquare(square);
    }
    public static int squareSquare(int side) { //возвращает объект строго типа int
        return side*side; //вычисляет площадь квадрата
    };

    public static void printSquare(int square) {
        System.out.println("Square of your square = "+square);
    };
}
