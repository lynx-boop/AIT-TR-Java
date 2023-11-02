package homework;

import java.util.Arrays;
// Написать метод, принимающий массив целых чисел,
// и возвращающий произведение всех его элементов с четными индексами.
public class Even {
    public static void main(String[] args) {
        int[] array = new int[10];
        int mult = 1;
        System.out.println("Array is: " + Arrays.toString(getRandomArray(array)));

        System.out.println("Even numbers of array: ");
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                mult *= array[i];
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Sum of even numbers: " + mult);
    }
    public static int[] getRandomArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (10 - (-10) + 1) + (-10));
        }
        return arr;
    }
}
