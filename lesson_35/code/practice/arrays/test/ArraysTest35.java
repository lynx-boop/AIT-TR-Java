package practice.arrays.test;

import homework.ArraySort14;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.soldier.model.Soldier35;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest35 {
    Integer[] arrNum;
    String[] arrStr;
    Soldier35[] arrSoldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[] {9, 7, 4, 7, 2, 10, 5, 1, 0, 10, 5, 15, 25};
        arrStr = new String[] {"one", "two", "three", "four", "five"};
        arrSoldiers = new Soldier35[] {
                new Soldier35("Miqad", 182, 74.2, 91),
                new Soldier35("Peter", 175, 77.1, 75),
                new Soldier35("Rabindranate", 162, 55.1, 91),
                new Soldier35("Mary", 159, 55.1, 91),
                new Soldier35("Ann", 162, 55, 88),
        };
    }
    @Test
    void testArraysSort() {
        Arrays.sort(arrNum);
        System.out.println(Arrays.toString(arrNum));
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));
    }
    @Test
    void testArraysSortComparator() {
        Arrays.sort(arrNum, (n1, n2) -> n2 - n1);
        System.out.println(Arrays.toString(arrNum));
        Arrays.sort(arrStr, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(arrStr));
    }
    @Test
    void testSortSoldiersNaturalOrder() {
        arrSoldiers[0].compareTo(arrSoldiers[2]);
        Arrays.sort(arrSoldiers);
        printArray(arrSoldiers);
    }
    @Test
    void testSortSoldiersByName() {
        Arrays.sort(arrSoldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        printArray(arrSoldiers);
    }
    @Test
    void testSortSoldiersByProfile() {
        Arrays.sort(arrSoldiers, (n1, n2) -> {
            int res = n2.getProfile() - n1.getProfile();
            return res != 0? res: n1.getHeight() - n2.getHeight(); //если профили разные - сортируем по профилю, а если одинаковые, то сортируем по росту в одном и том же профиле
        });
        printArray(arrSoldiers);
    }
    @Test
    void testSortAoldiersByWeight() {
        Arrays.sort(arrSoldiers, (s1, s2) -> {
            double res = s1.getWeight() - s2.getWeight();
            if(res < 0) {
                return -1;
            }
            if (res > 0) {
                return 1;
            }
            return 0;
        });
        printArray(arrSoldiers);
    }

    @Test
    void testOdEvenComparator1() {
        //Четные целые числа должны идти перед нечетными числами.
        Integer[] origin = { 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };
        Comparator<Integer> comparator = (n1, n2) -> {
            if(n1 % 2 == 0 && n2 % 2 != 0) {
                return -1;
            }
            if(n2 % 2 == 0 && n1 % 2 != 0) {
                return 1;
            }
            return 0;
        };
        Arrays.sort(origin, comparator);
        System.out.println(Arrays.toString(origin));
    }

    @Test
    void testOdEvenComparator2() {
        //Четные целые числа должны идти перед нечетными числами в порядке возрастания.
        // Нечетные целые числа должны идти после четных в порядке убывания.
        // Напишите тестовый пример Junit для OddEvenComparator.
        Integer[] origin = { 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };
        Comparator<Integer> comparator = (n1, n2) -> {
            if(n1 % 2 == 0 && n2 % 2 != 0) {
                return -1;
            }
            if(n2 % 2 == 0 && n1 % 2 != 0) {
                return 1;
            }
            if(n1 % 2 == 0 && n2 % 2 == 0) {
                return n1 - n2;
            }
            if(n1 % 2 != 0 && n2 % 2 != 0) {
                return n2 - n1;
            }
            return 0;
        };
        Arrays.sort(origin, comparator);
        System.out.println(Arrays.toString(origin));
    }
    private void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------------------------------");
    }
}
