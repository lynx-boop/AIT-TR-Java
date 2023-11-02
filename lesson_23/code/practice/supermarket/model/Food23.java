package practice.supermarket.model;

public class Food23 extends Product23{
    private String expDate;
    private boolean organic;
    public Food23(long barcode, String name, double price, String expDate, boolean organic) {
        super(barcode, name, price);
        this.expDate = expDate;
        this.organic = organic;
    }

    public String getExpDate() {
        return expDate;
    }

    public boolean isOrganic() {
        return organic;
    }

    @Override
    public String toString() {
        return super.toString() + "Food23{" +
                "expDate='" + expDate + '\'' +
                ", organic=" + organic +
                '}';
    }
}
