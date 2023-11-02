package homework.product.model;

public class MilkFood extends Food{
    private String milkType;
    private double fat;

    public MilkFood(String name, long barCode, double price, String milkType, String expDate, double fat) {
        super(name, barCode, price, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Milk type: " + milkType + ", Fat: " + fat;
    }
}
