package practice.computer;

import practice.computer.model.Computer;
import practice.computer.model.Laptop;
import practice.computer.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer[] shop = new Computer[5];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);//upper casting from Laptop to Computer
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15, 1388908213974L);
        printArray(shop);
        System.out.println("===========================================");
        Computer computer = new Computer("i5", 12, 512, "HP");
        boolean checker = shop[0].equals(computer);
        System.out.println("1 " + checker);
        Smartphone smartphone = new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15, 27348327482789579L);
        checker = smartphone.equals(shop[3]);
        System.out.println("2 " + checker);
    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }
}
