package homework;
import java.util.Scanner;
// Determining the time of day.
// Write a program that takes the current hour (0 to 23)
// and displays a greeting depending on the time of day (morning, afternoon, evening, night)
public class TimeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the current time (from 0 to 23): ");
        int num = scanner.nextInt();

        while (num < 0 || num >= 24) {
            System.out.println("Wrong number, try again!");
            System.out.println("Input the current time (from 0 to 23): ");
            num = scanner.nextInt();
        }

        switch(num) {
            case 0, 1, 2, 3, 4 -> System.out.println("Good night!");
            case 5, 6, 7, 8, 9, 10, 11 -> System.out.println("Good morning!");
            case 12, 13, 14, 15, 16, 17 -> System.out.println("Good day!");
            default ->  System.out.println("Good evening!");
        }

    }
}
