package homework;
import java.util.Scanner;
// The program receives as input a string and the number of repetitions of this string.
// The program should print this string required number of times.
public class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your phrase below: ");
        String str = scanner.nextLine();
        System.out.println("Input your number of repetitions: ");
        int repetitions = scanner.nextInt();

        while (repetitions > 0) {
            System.out.println(str);
            repetitions--;
        }
    }
}
