package homework;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your coffee:");
        System.out.println(" Espresso - 1 \n Americano - 2 \n Latte - 3 \n Cappuccino - 4");
        int coffee = scanner.nextInt();

        switch (coffee) {
            case 1: System.out.println("Espresso - 1$. Are you agree?");
                    String choice = scanner.next().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.println("Here your espresso!");
                } else System.out.println("Okay, you can return when you will receive the money!");
                break;
            case 2: System.out.println("Americano - 2$. Are you agree?");
                choice = scanner.next().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.println("Here your Americano!");
                } else System.out.println("Okay, you can return when you will receive the money!");
                break;
            case 3: System.out.println("Latte - 3.50$. Are you agree?");
                choice = scanner.next().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.println("Here your Latte!");
                } else System.out.println("Okay, you can return when you will receive the money!");
                break;
            case 4: System.out.println("Cappuccino - 3.50$. Are you agree?");
                choice = scanner.next().toLowerCase();
                if (choice.equals("yes")) {
                    System.out.println("Here your Cappuccino!");
                } else System.out.println("Okay, you can return when you will receive the money!");
                break;
            default: System.out.println("Something went wrong. Please chose one option between 1 and 4");
        }
    }
}
