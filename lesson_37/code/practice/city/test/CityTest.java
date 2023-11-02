package practice.city.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.city.model.City;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    //-------------------------------FIELDS-----------------------------------
    City[] cities;
    //-------------------------------METHODS----------------------------------
    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }
    private void printArray(Object[] arr, String title) {
        System.out.println("--------------------------" + title + "--------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //-------------------------------TESTS------------------------------------
    @Test
    void testIntegerDesc() {
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        Arrays.sort(actual, (n1, n2) -> Integer.compare(n2, n1));
        assertArrayEquals(expected, actual);
    }
    @Test
    void testCityComparable() {
        printArray(cities, "ORIGINAL ARRAY");
        Arrays.sort(cities);
        printArray(cities, "NATURAL ORDER");
        City pattern = new City(null, 1_200_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println("Index = " + index);
    }
    @Test
    void testCityNameComparator() {
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparator);
        printArray(cities, "SORT BY NAME");
        City pattern = new City("Chicago", 0);
        int index = Arrays.binarySearch(cities, pattern, comparator);
        System.out.println(index);
    }
    @Test
    void testArrayCopy() {
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
//        City[] citiesCopy = new City[cities.length];
//        for (int i = 0; i < citiesCopy.length; i++) {
//            citiesCopy[i] = cities[i];
//        } - этот код можно заменить встроенным методом:
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, "CITIES COPY BEFORE SORT");
        Arrays.sort(citiesCopy, 0, cities.length, comparator);
        printArray(citiesCopy, "CITIES COPY AFTER SORT");
        printArray(cities, "CITIES ARRAY");
        City pattern = new City("Yalta", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparator);
        System.out.println("Index = " + index);
    }
    @Test
    void testCopyOfRange() {
        City[] citiesCopy = Arrays.copyOfRange(cities, 1, cities.length - 1);
        printArray(citiesCopy, "COPY WITHOUT 0 AND LAST");
    }
    @Test
    void testSystemArrayCopy() {
        City[] citiesCopy = new City[cities.length * 2];
        System.arraycopy(cities, 1, citiesCopy, 4, 4);
        printArray(citiesCopy, "SYSTEM.ARRAY COPY");
    }
    @Test
    void testKeepSorted() {
        Arrays.sort(cities);
        printArray(cities, "NATURAL ORDER");
        City city = new City("Salem", 690_000);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length + 1);
        //wrong way!
//        citiesCopy[citiesCopy.length - 1] = city;
//        Arrays.sort(citiesCopy);
        //right way:
        //найти место
        int index = Arrays.binarySearch(citiesCopy, 0, citiesCopy.length - 1, city);
        // мы делаем так для элементов, чей индекс отрицательный
        index = index >= 0 ? index : -index - 1;
        //сдвинуть
        System.arraycopy(citiesCopy, index, citiesCopy, index + 1, citiesCopy.length - index - 1);
        //вставить
        citiesCopy[index] = city;
        cities = citiesCopy;
        printArray(cities, "NATURAL ORDER AFTER ADD CITY");
    }
}