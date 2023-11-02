package homework;
import java.util.Scanner;
//On the first day the athlete ran s kilometers,
//and then every day he increased his mileage by 10% of previous value.
//Determine the number of the day for which the athlete’s mileage will be at least target kilometers.
//The program receives real numbers s and target as input and must output one natural number.
public class Athlete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first`s day result: ");
        int firstDay = scanner.nextInt();
        System.out.println("Input your target result: ");
        int target = scanner.nextInt();
        double currentResult = firstDay;
        int daysCount = 0;

        while (currentResult < target) {
            currentResult = currentResult + currentResult * 0.1;
            daysCount++;
            System.out.printf("Your current result today is: %.2f", currentResult);
            System.out.println();
        }
        System.out.println("You will reach your target in: " + daysCount + " days.");
    }
}