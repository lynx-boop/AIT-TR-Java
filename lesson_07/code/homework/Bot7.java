package homework;
import java.util.Scanner;
public class Bot7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        String name = scanner.next();
        System.out.println("Nice to meet you, " + name + "! I`m Gennadiy, the Bot");
        System.out.println("What is your profession?");
        String profession = scanner.next();
        System.out.println("Oh, really? As a child I dreamed of becoming an " + profession);
        System.out.println("Do you like it? 1 - yes, 2 - no, 3 - uuuuuuumh....., 4 - your custom answer");
        int answer = scanner.nextInt();

        switch (answer) {
            case 1 :
                System.out.println("A person's happiness lies in doing what he loves");
                break;
            case 2 :
                System.out.println("Perhaps it's time to think about what you want to be when you grow up?");
                break;
            case 3 :
                System.out.println("Understand. Everything has its own nuances");
                break;
            case 4 :
                System.out.println("Type your answer below: ");
                String customAnswer = scanner.next();
                System.out.println("Ooooh, now I see. I will use your answer :\"" + customAnswer + "\" to learn it for better understanding people. Thank you!");
                break;
            default:
                System.out.println("If you want to say something to me, please choose number 4");
                break;
        }
    }
}
