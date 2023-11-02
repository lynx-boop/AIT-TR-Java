package practice.city.model;

import java.util.Comparator;

public class City implements Comparable<City> {
    //-------------------------------FIELDS-----------------------------------
    private String name;
    private int population;
    //-----------------------------CONSTRUCTOR--------------------------------
    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }
    //--------------------------GETTERS AND SETTERS --------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    //-------------------------------METHODS----------------------------------
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return this.population - o.population;
    }
}
