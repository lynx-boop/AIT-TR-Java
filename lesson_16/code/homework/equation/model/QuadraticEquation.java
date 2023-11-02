package homework.equation.model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void display(double a, double b, double c) {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
    public static double delta(double a, double b, double c) {
        double d = b*b - 4*a*c;
        return d;
    }
    public static void quantityRoots(double a, double b, double c) {
        double d = b*b - 4*a*c;
        if (d > 0) {
            System.out.println("2 solutions");
        } else if (d == 0) {
            System.out.println("1 solution");
        } else System.out.println("There is no solutions");
    }
}
