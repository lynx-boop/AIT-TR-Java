package homework.todolist;

import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        ToDoListMenu[] menu = ToDoListMenu.values();
        int id = 0;
        System.out.println("Welcome to the TaskManager!");
        ToDoListMenu.printMenu();

        while (true) {
            System.out.println("Input your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                //TODO change into methods (after theirs creation)
//                case 1: {
//                    scanner.nextLine();
//                    System.out.println("Input task: ");
//                    String task = scanner.nextLine();
//                    Task38 newTask = new Task38(id, task, id+1);
//                    ToDoListImpl.addTask(newTask);
//                    break;
//                }
//                case 2 -> System.out.println(menu[choice-1].getAction());
//                case 3 -> System.out.println(menu[choice-1].getAction());
//                case 4 -> System.out.println(menu[choice-1].getAction());
//                default -> System.out.println("Wrong choice");
            }
        }
    }
}
