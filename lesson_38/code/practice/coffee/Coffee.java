package practice.coffee;

public enum Coffee {
    //-------------------------VALUES (CONSTANTS)-----------------------------
    ESP("Espresso", 3.25),
    AMR("Americano",3.85),
    CAP("Cappucino", 4.50),
    LAT("Latte", 4.85);
    //-------------------------------FIELDS-----------------------------------
    private String type;
    private double price;
    //-----------------------------CONSTRUCTOR--------------------------------
    Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }
    //--------------------------GETTERS AND SETTERS --------------------------
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //-------------------------------METHODS----------------------------------

}
