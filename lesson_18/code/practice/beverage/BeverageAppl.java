package practice.beverage;

import practice.beverage.model.Beer;
import practice.beverage.model.Beverage;

public class BeverageAppl {
    public static void main(String[] args) {
        Beverage beverage = new Beverage();
        beverage.displayStock();
        System.out.println();
        System.out.println("---------------------------------------");

        Beverage b1 = new Beverage("juice", "bottle", 12);
        b1.toBuy("juice", "bottle", 20);
        b1.displayStock();
        System.out.println();
        System.out.println("---------------------------------------");

        Beer beer = new Beer();
        beer.displayStock();
        System.out.println("---------------------------------------");

        Beer b2 = new Beer("Guinnes", "6 pack", 10, "elle");
        b2.toBuy("Guinnes", "6 pack", 10, "elle");
        b2.displayStock();
    }
}
