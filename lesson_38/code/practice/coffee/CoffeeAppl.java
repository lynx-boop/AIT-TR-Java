package practice.coffee;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to CoffeeShop!");
        // offer a menu for costumer
        Coffee[] coffeeMenu = Coffee.values(); //положили в меню все виды доступного кофе из Coffee

        for (int i = 0; i < coffeeMenu.length; i++) {
            System.out.println((i + 1) + " - " + coffeeMenu[i].getType()); //TODO refactor number of choice as a separate field in enum
        }

        while (true) {
            System.out.println("Input number of your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt(); //received keyboard input

            switch (choice) {
                case 1 -> System.out.println(coffeeMenu[0].getType() + ", price " + coffeeMenu[0].getPrice());
                case 2 -> System.out.println(coffeeMenu[1].getType() + ", price " + coffeeMenu[1].getPrice());
                case 3 -> System.out.println(coffeeMenu[2].getType() + ", price " + coffeeMenu[2].getPrice());
                case 4 -> System.out.println(coffeeMenu[3].getType() + ", price " + coffeeMenu[3].getPrice());
                default -> System.out.println("Wrong choice");
            }
        }
    }
}
