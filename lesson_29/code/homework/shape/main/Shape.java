package homework.shape.main;

public abstract class Shape {
    public double side;

    public Shape(double side) {
        this.side = side;
    }

    // -----------GETTERS AND SETTERS------------
    public double getNum() {
        return side;
    }
    public void setNum(double num) {
        this.side = num;
    }
    // ------------------------------------------

    public abstract double calcArea();
    public abstract double calcPerimeter();
}
