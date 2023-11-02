package practice.binaty_search;

import practice.ArrayMethods;

public class ArrayApl15 {
    public static void main(String[] args) {
        int[] array = {-50, -10, 20, -100, 70, -10, 60, 40, -10, 30, 50};

        ArrayMethods15.printArray(array); // напечатать
        ArrayMethods15.bubbleSort(array); // отсортировать
        ArrayMethods15.printArray(array); // напечатать
        ArrayMethods15.split();

        int index = ArrayMethods15.binarySearch(array, 20);
        System.out.println(index);
        index = ArrayMethods15.binarySearch(array, -0);
        System.out.println(index);

        int count = ArrayMethods15.searchDuplicate(array, -10);
        System.out.println(count);
    }
}
