package homework.shape.main;

public class Square extends Shape {
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return side * 4;
    }
    @Override
    public double calcPerimeter() {
        return side * side;
    }
}
