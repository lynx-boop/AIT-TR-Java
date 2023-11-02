//package practice.to_do_list;
//
//import practice.to_do_list.model.Menu;
//import practice.to_do_list.model.Task;
//import practice.to_do_list.model.ToDoListImpl;
//
//import java.util.Scanner;
//
//public class ToDoListAppl {
//    public static void main(String[] args) {
//        // greeting
//        System.out.println("Welcome to ToDo Application!");
//        ToDoListImpl toDoList = new ToDoListImpl(10);
//        // начало цикла
//        while (true) {
//            // print menu
//            Menu.printMenu(); // статический метод вызывается по имени класса
//            // ask choice
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Input your choice: ");
//            int choice = scanner.nextInt();
//            // execute
//            switch (choice) {
//                case 1: {
//                    scanner.nextLine();
//                    System.out.println("Input task: ");
//                    String task = scanner.nextLine();
//                    Task newTask = new Task(task);
//                    toDoList.addTask(newTask);
//                    break;
//                }
//                case 2: {
//                    System.out.println("Your tasks: ");
//                    toDoList.printTasks();
//                    break;
//                }
//                case 3: {
//                    System.out.println("Input task ID: ");
//                    int id = scanner.nextInt();
//                    Task removedTask = toDoList.removeTask(id -1);
//                    System.out.println(removedTask + " is removed.");
//                    break;
//                }
//                case 4:
//                    return;
//                default: {
//                    System.out.println("Wrong input.");
//                }
//            }
//        }
//    }
//}
