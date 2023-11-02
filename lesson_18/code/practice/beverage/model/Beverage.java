package practice.beverage.model;

public class Beverage {
    // поля - что о напитках в целом мы можем сказать
    private String title;
    private String packing;
    private int quantity;

    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }
    // пустой конструктор
    public Beverage() {
    }

    public String getTitle() {
        return title;
    }

    public String getPacking() {
        return packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void toBuy(String title, String packing, int quantity) {
        // связываем текущий объект с методом
        this.packing = packing;
        this.quantity = quantity;
        this.title = title;
        System.out.println("Go to market and buy: " + title + " " + packing + " " + quantity);
    }

    public void displayStock(){
        System.out.print("We have: " + quantity + " " + packing + " of " + title);
    }

}
