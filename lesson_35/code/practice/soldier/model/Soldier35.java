package practice.soldier.model;

//чтобы класс был сравниваемый, имплементируем интерфейс comparable
public class Soldier35 implements Comparable<Soldier35> {
    //-------------------------------FIELDS-----------------------------------
    private String name;
    private int height;
    private double weight;
    private int profile;
    //-----------------------------CONSTRUCTOR--------------------------------
    public Soldier35(String name, int height, double weight, int profile) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.profile = profile;
    }
    //--------------------------GETTERS AND SETTERS---------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }
    //------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Soldier35{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", profile=" + profile +
                '}';
    }
    @Override
    public int compareTo(Soldier35 other) {
        return this.height - other.height;
    }
}
