package homework;
import java.util.Scanner;
// Enter a six-digit number (bus ticket number).
// Determine whether this ticket is "lucky"
// (the sum of the first three digits is equal to the sum last three digits).
public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your 6-digits ticket number: ");
        int ticket = scanner.nextInt();
        System.out.println("Your ticket is: " + ticket  + "...");
        int ticketInCycle = ticket;
        int firstSum = 0;
        int secondSum = 0;
        int count = 0;
        int digit;

        while (ticketInCycle > 0 && count < 3) {
            digit = ticketInCycle % 10;
            ticketInCycle = ticketInCycle / 10;
            count++;
            firstSum = firstSum + digit;
        }

        while (ticketInCycle > 0) {
            digit = ticketInCycle % 10;
            ticketInCycle = ticketInCycle / 10;
            count++;
            secondSum = secondSum + digit;
        }

        if (firstSum == secondSum) {
            System.out.println("...LUCKY! " + firstSum + " = " + secondSum + "Congratulations!");
        } else {
            System.out.println("...UNLUCKY: " + firstSum + " != " + secondSum + ".\nUnlucky in tickets - lucky in love!");
        }
    }
}