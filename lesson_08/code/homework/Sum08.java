package homework;
import java.util.Scanner;
//Enter a positive integer, find the sum of its digits
public class Sum08 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your positive integer: ");
            int integer = scanner.nextInt();
            System.out.println("Your integer is: " + integer);
            int integerInCycle = integer;
            int sum = 0;

            while (integerInCycle > 0) {
                int digit = integerInCycle%10;
                sum = sum + digit;
                integerInCycle = integerInCycle/10;
            }
        System.out.println("Sum of digits of your integer is: " + sum);
    }
}
