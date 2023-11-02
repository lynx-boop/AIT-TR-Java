package homework.cube;

import homework.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        Cube cube2 = new Cube(3);
        Cube cube3 = new Cube(7);

        System.out.println("Куб 1:");
        System.out.println("Периметр: " + cube1.calculatePerimeter());
        System.out.println("Площадь: " + cube1.calculateSurfaceArea());
        System.out.println("Объем: " + cube1.calculateVolume());

        System.out.println("\nКуб 2:");
        System.out.println("Периметр: " + cube2.calculatePerimeter());
        System.out.println("Площадь: " + cube2.calculateSurfaceArea());
        System.out.println("Объем: " + cube2.calculateVolume());

        System.out.println("\nКуб 3:");
        System.out.println("Периметр: " + cube3.calculatePerimeter());
        System.out.println("Площадь: " + cube3.calculateSurfaceArea());
        System.out.println("Объем: " + cube3.calculateVolume());
    }
}
