package practice.seasons;

public enum Season {
    //-------------------------------VALUES-----------------------------------
    WINTER(1, "Winter"),
    SPRING (2, "Spring"),
    SUMMER(3, "Summer"),
    AUTUMN(4, "Autumn");
    //-------------------------------FIELDS-----------------------------------
    private int number;
    private String name;
    //-----------------------------CONSTRUCTOR--------------------------------
    Season(int number, String name) {
        this.number = number;
        this.name = name;
    }
    //--------------------------GETTERS AND SETTERS --------------------------
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //-------------------------------METHODS----------------------------------
}
