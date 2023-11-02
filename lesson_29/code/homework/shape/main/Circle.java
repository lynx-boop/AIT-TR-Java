package homework.shape.main;

public class Circle extends Shape {
    private double pi;

    public Circle(double side, double pi) {
        super(side);
        this.pi = pi;
    }

    // -----------GETTERS AND SETTERS------------
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    // ------------------------------------------

    @Override
    public double calcArea() {
        // S = 3.14 × r^2 - area
        return pi * side * side;
    }
    @Override
    public double calcPerimeter() {
        // C = 2 · 3.14 · r - perimeter
        return 2 * pi * side;
    }
}
