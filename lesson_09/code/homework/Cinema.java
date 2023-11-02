package homework;
import java.util.Scanner;
// The cinema has different types of tickets: standard, student and for seniors.
// Each type of ticket has its own cost.
// The client can also choose a seat in the VIP area, which will increase the ticket price by 25%.
// Create a calculateTicketPrice method that accepts the customer's age, student status and a VIP seat flag.
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int standard = 50;
        double student = 0.1;
        double senior = 0.25;
        double vip = 0.25;
        double price = standard;
        int age;
        int isVip;

        System.out.println("Input your age: ");
        age = scanner.nextInt();

        System.out.println("Do you want upgrade to VIP? 0 - no, 1 - yes: ");
        isVip = scanner.nextInt();

        System.out.println(calculateTicketPrice(price, student, senior, age, isVip, vip));
    }
    public static double calculateTicketPrice(double price, double student, double senior, int age, int isVip, double vip) {
        if (age <= 55) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Are you a student? 0 - no, 1 - yes: ");
                int isStudent = scanner.nextInt();

                if (isStudent == 1) {
                    price -= price*student;
                }
            } else price -= price*senior;

        if (isVip == 1) {
            price += price*vip;
        }

        return price;
    }
}
