package practice.supermarket.model;

public class Product23 {
    //поля класса
    private long barcode; //штрих-код
    private String name;
    private double price;
    //конструктор класса
    public Product23(long barcode, String name, double price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }
    // геттеры и сеттеры
    public long getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // наследуем от object
    @Override
    public String toString() {
        return "Product23{" +
                "barcode=" + barcode +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // наследуем от object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //нам попался под руку тот самы объект
        if (o == null || getClass() != o.getClass()) return false;
        Product23 product23 = (Product23) o; // downcasting
        return barcode == product23.barcode; // возвращаем результат сравнения результатом будет true или false
    }

    @Override
    public int hashCode() {
        return (int) (barcode ^ (barcode >>> 32));
    }
}
