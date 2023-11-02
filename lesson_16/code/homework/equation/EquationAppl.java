package homework.equation;
import homework.equation.model.QuadraticEquation;
import java.util.Scanner;

public class EquationAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a: ");
        double a = scanner.nextInt();
        System.out.println("Print b: ");
        double b = scanner.nextInt();
        System.out.println("Print c: ");
        double c = scanner.nextInt();

        QuadraticEquation.display(a, b, c);
        double delta = QuadraticEquation.delta(a, b, c);
        System.out.println("Delta is: " + delta);
        QuadraticEquation.quantityRoots(a, b, c);
    }
}
