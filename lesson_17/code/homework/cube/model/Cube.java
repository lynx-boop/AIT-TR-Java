package homework.cube.model;

public class Cube {
    public int a;
    public Cube(int a) {
        this.a = a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }

    public int calculatePerimeter() {
        return 12 * a;
    }

    public int calculateSurfaceArea() {
        return 6 * a * a;
    }

    public int calculateVolume() {
        return a * a * a;
    }
}
