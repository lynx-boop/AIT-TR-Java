package homework.shape.main;

public class Triangle extends Shape {
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return side * 3;
    }
    @Override
    public double calcPerimeter() {
        // s = Math.sqrt(3)/4*a*a
        return Math.sqrt(3) / 4 * side * side;
    }
}
