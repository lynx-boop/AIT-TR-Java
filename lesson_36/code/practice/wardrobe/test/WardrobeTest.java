package practice.wardrobe.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.RandomNums;
import practice.wardrobe.model.Wardrobe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class WardrobeTest {
    //-------------------------------FIELDS-----------------------------------
    private static final int SIZE = 10;
    private static final int MAX = 6;
    private static final int MIN = 1;
    static Random random = new Random();
    Wardrobe[] wardrobes;
    //------------------------------METHODS-----------------------------------
    @BeforeEach
    void setUp() {
        wardrobes = new Wardrobe[SIZE];
        for (int i = 0; i < wardrobes.length; i++) {
            double height = random.nextInt(MIN, MAX);
            double width = random.nextInt(MIN, MAX);
            double depth = random.nextInt(MIN, MAX);
            wardrobes[i] = new Wardrobe(height, width, depth);
        }
    }
    private void printArray(Object[] arr, String title) {
        System.out.println("----------------------------------" + title + "----------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //-------------------------------TESTS------------------------------------
    @Test
    void testNaturalOrderWardrobe() {
        printArray(wardrobes, "TEST COMPARABLE BEFORE SORT");
        Arrays.sort(wardrobes);
        printArray(wardrobes, "TEST COMPARABLE AFTER SORT");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2, 4, 1));
        System.out.println("Index = " + index);
    }
    @Test
    void testAreaComparator() {
        printArray(wardrobes, "TEST AREA COMPARATOR BEFORE SORT");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.area(), w2.area());
        Arrays.sort(wardrobes, comparator);
        printArray(wardrobes, "TEST AREA COMPARATOR AFTER SORT");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(5, 2, 2), comparator);
        System.out.println("Index = " + index);
    }
    @Test
    void testVolumeComparator() {
        printArray(wardrobes, "TEST HEIGHT VOLUME COMPARATOR BEFORE SORT");
        Comparator<Wardrobe> comparator = (w1, w2) -> {
            int res = Double.compare(w1.getHeight(), w2.getHeight());
            return res != 0 ? res : Double.compare(w1.volume(), w2.volume());
        };
        Arrays.sort(wardrobes, comparator);
        printArray(wardrobes, "TEST HEIGHT VOLUME COMPARATOR AFTER SORT");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(5, 2, 2), comparator);
        System.out.println("Index = " + index);
    }
}