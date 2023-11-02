package homework.shape;

import homework.shape.main.Circle;
import homework.shape.main.Shape;
import homework.shape.main.Square;
import homework.shape.main.Triangle;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(10, 3.14);
        shapes[1] = new Circle(7, 3.14);
        shapes[2] = new Triangle(19);
        shapes[3] = new Square(21);

        total(shapes);
        totalCircle(shapes);
    }
    public static void total(Shape[] shapes) {
        double totalArea = 0;
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].calcArea();
            totalPerimeter += shapes[i].calcPerimeter();
        }
        System.out.println("Total area of all shapes is: " + totalArea + ". Total perimeter is: " + totalPerimeter);
    }

    public static void totalCircle(Shape[] shapes) {
        double total = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Circle) {
                total += shapes[i].calcArea();
            }
        }
        System.out.println("Total area of all circles only is: " + total);
    }
}
