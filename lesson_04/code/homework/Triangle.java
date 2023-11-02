package homework;

public class Triangle {
    public static void main(String[] args) {
        // S = 1/2 (a × h), where a is base of triangle and h is height
        // S = 1/2 (a × h), где a - это основание и h это высотa
        System.out.println("Squad of triangle = "+ triangleSquare(10, 26));
    }
    public static double triangleSquare(int a, int h) {
        return a*h*0.5;
    }
}
