package practice.supermarket;

import practice.supermarket.dao.Supermarket23;
import practice.supermarket.model.Food23;
import practice.supermarket.model.Product23;

public class SupermarketAppl23 {
    public static void main(String[] args) {
        Supermarket23 kiosk = new Supermarket23(5);
        kiosk.addProduct(new Product23(1000, "Gift card", 20.0));
        kiosk.addProduct(new Food23(2000, "Sosis", 5.0, "20.10.2023", false));
        kiosk.addProduct(new Food23(3000, "Goat cheese", 13, "31.12.2023", true));
        kiosk.addProduct(new Food23(4000, "Pork fat", 3, "15.11.2023", true));
        kiosk.addProduct(new Product23(5000, "Book", 6));

        kiosk.printAllProducts();
        System.out.println("---------------------------");

        kiosk.updateProduct(1000, 100);
        kiosk.removeProduct(3000);
        kiosk.printAllProducts();
        System.out.println(kiosk.getQuantity());
    }
}
