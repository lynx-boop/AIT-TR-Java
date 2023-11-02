package homework;
import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your month by number from 1 to 12: ");
        int month = scanner.nextInt();
        int year;

        if (month >=1 && month <=12) {
            System.out.println("Input your year: ");
            year = scanner.nextInt();
        } else {
            System.out.println("Please input your month by number ONLY from 1 to 12: ");
            month = scanner.nextInt();
            System.out.println("Input your year: ");
            year = scanner.nextInt();
        }

        switch (month) {
            case 1: System.out.println("January, "+ year +" year. 31 days.");
            break;
            case 2:
                int daysOfYear = leapYear(year);
                System.out.println("February, "+ year +" year. " + daysOfYear + " days.");
                break;
            case 3: System.out.println("March, "+year+" year. 31 days ");
                break;
            case 4: System.out.println("April, "+year+" year. 30 days");
                break;
            case 5: System.out.println("May, "+year+" year. 31 days");
                break;
            case 6: System.out.println("June, "+year+" year. 30 days");
                break;
            case 7: System.out.println("July, "+year+" year. 31 days");
                break;
            case 8: System.out.println("August, "+year+" year. 31 days");
                break;
            case 9: System.out.println("September, "+year+" year. 30 days");
                break;
            case 10: System.out.println("October, "+year+" year. 31 days");
                break;
            case 11: System.out.println("November, "+year+" year. 30 days");
                break;
            case 12: System.out.println("December, "+year+" year. 31 days");
                break;
            default:
                System.out.println("Wrong number of month or year!");
                break;
        }
    }
    public static int leapYear(int year) {
        int condition4 = year%4;
        int condition100 = year%100;
        int condition400 = year%400;
        if (condition4 == 0 & condition100 != 0 ^ (condition100 == 0 & condition400 == 0) ) {
            return 29;
        } else return 28;
    }
}
