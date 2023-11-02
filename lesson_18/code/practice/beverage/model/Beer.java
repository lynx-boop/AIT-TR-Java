package practice.beverage.model;

import java.sql.SQLOutput;

public class Beer extends Beverage {
    // поле класса
    private String type;

    //конструктор
    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public Beer() {
    }

    public void toBuy(String title, String packing, int quantity, String type){
        super.toBuy(title, packing, quantity);
        this.type = type;
    }

    public void displayStock() {
        super.displayStock();
        System.out.println(" " + type + " beer.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
