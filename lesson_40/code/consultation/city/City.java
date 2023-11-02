package consultation.city;

import java.util.Objects;

public class City implements Comparable<City> {
    //fields
    private String name;
    private int population;
    private String country;
    private double index; //какой-то рейтинг
    //constructor
    public City(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }
    //getters and setters
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    //будем сортировать по названию города (как более нативный способ сортировки)
    @Override
    public int compareTo(City o) {
        //если то число, которое он вернет в результате сравнения, положительное, то при сортировке
        //объекты будут поменяны местами, в противном случае оставляем все как есть
        int res =  this.name.compareTo(o.name);
        if (res != 0) {
            return res; //если строки не совпали, вернули res
        } else { //когда названия городов совпали, то сравниваем по популяции
            res = Integer.compare(this.population, o.population);
            return res;
        }
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (population != city.population) return false;
        if (Double.compare(index, city.index) != 0) return false;
        if (!Objects.equals(name, city.name)) return false;
        return Objects.equals(country, city.country);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + population;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        temp = Double.doubleToLongBits(index);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
