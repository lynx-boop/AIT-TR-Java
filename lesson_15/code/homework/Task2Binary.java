package homework;

import practice.binaty_search.ArrayApl15;
import practice.binaty_search.ArrayMethods15;

public class Task2Binary {
    public static void main(String[] args) {
        int[] array = new int[20];
        ArrayMethodsHw15.getRandomArray(array, -100, 100);
        ArrayMethodsHw15.printArray(array);
        ArrayMethodsHw15.bubbleSort(array);
        ArrayMethodsHw15.printArray(array);
        int index = ArrayMethodsHw15.binarySearch(array, 0);
        if (index > 0) System.out.println("Index is: " + index);
        else System.out.println("This element is not represented in the array, " +
                "but if it were, its index would be " + index);
    }
}
