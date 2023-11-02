package practice.arrays34.utils;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools34 {
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------------------------------------------");
    }
    public static <T> int search(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if(predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) { //comparable - сравниваемый
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j].compareTo(arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] = t;
                }
            }
        }
    }
    // мы перегружаем метод bubbleSort!
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) { //comapator - тот, кто сравнивает
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(comparator.compare(arr[j], arr[j+1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] = t;
                }
            }
        }
    }
}
