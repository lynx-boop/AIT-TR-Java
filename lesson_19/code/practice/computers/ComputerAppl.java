package practice.computers;

import practice.computers.model.Computer;
import practice.computers.model.Laptop;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer[] computer = new Computer[3];
        computer[0] = new Computer("i9", 16, 512, "Asus");
        System.out.println(computer[0]);

        computer[1] = new Laptop("i5", 8, 256, "Acer", 14, 1000, 2);
        System.out.println(computer[1]);

        computer[2] = new Laptop("M2", 16, 512, "MacBook", 14, 5000, 1.6);
        for (int i = 0; i < computer.length; i++) {
            System.out.println(computer[i]);
        }

        int sumHdd = 0;
        for (int i = 0; i < computer.length; i++) {
            sumHdd = sumHdd + computer[i].getHdd();
        }
        System.out.println("Total HDD = " + sumHdd);

    }
}
