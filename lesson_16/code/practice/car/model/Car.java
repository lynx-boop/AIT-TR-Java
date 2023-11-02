package practice.car.model;

public class Car {
    private String brand;
    private String color;
    private String model;
    private int year;
    private double enginePower;
    private String fuelType;

    //анонсируем конструктор класса Car
    public Car(String brand, String color, String model, int year, double enginePower, String fuelType) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getBrand() {
        return brand;
    }

    // метод для печати
    public void displayCar() {
        System.out.println("Brand: " + brand + " Model " + model + " Engine " + enginePower);
    }
}
