package practice.computer;
import practice.computer.model.Computer21 ;
import practice.computer.model.Laptop21;
import practice.computer.model.Smartphone21;

public class ComputerAppl21 {
    public static void main(String[] args) {
        Computer21[] shop = new Computer21[5];
        System.out.println(shop);
        shop[0] = new Computer21("i5", 12, 512, "HP");
        shop[1] = new Laptop21("i7", 16, 512, "Asus", 3, 2.1);
        shop[0].setRam(24);
        shop[2] = new Laptop21("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Laptop21("i4", 212, 1024, "Dragon", 3, 2.1);
        shop[4] = new Smartphone21("i1", 200, 512, "Nokia", 10, 0.7, 11.4);
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);
        }
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total SSD capacity = " + total);
        Laptop21 laptop1 = (Laptop21) shop[1];
        laptop1.setHours(2.4);
        System.out.println(laptop1);

        double totalHours = getTotalTime(shop);
        System.out.println(totalHours);

        int totalLaptopSSD = getTotalLaptopSSD(shop);
        System.out.println(totalLaptopSSD);
    }

    public static void printArray(Computer21[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int getTotalSSDCapacity(Computer21[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                res += arr[i].getSsd();
            }
        }
        return res;
    }
    public static double getTotalTime(Computer21[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop21) {
                Laptop21 laptop21 = (Laptop21) arr[i];
                res += laptop21.getHours();
            }
        }
        return res;
    }

    public static int getTotalLaptopSSD(Computer21[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop21 & !(arr[i] instanceof Smartphone21)) { //c instanceof на null можно не проверять - оно не проходит автоматически
                Laptop21 laptop21 = (Laptop21) arr[i];
                res += laptop21.getSsd();
            }
        }
        return res;
    }
}
