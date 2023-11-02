package homework;
import java.util.Arrays;
import java.util.Scanner;
// Collect in array data of daytime temperatures in your city for the past week into an array.
// Print the temperature that was on Tuesday and then on Thursday.
// Find the average temperature for the past week.
public class Temperature {
    public static void main(String[] args) {
        int[] arrayTemperature = new int[7];
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        int sum = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Input your temperature of day " + i);
            temperature = scanner.nextInt();
            System.out.println("Temperature of day " + i + " is " + temperature);
            arrayTemperature[i-1] = temperature;
            sum += temperature;
        }
        System.out.println("Temperature on Tuesday was: " + arrayTemperature[1]);
        System.out.println("Temperature on Thursday was: " + arrayTemperature[3]);
        System.out.println("Average temperature of the week: " + sum/arrayTemperature.length);
    }
}
