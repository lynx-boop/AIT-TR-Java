package homework;
import java.util.Arrays;
// Задача 1. Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его нечетных элементов
// (не индексы!, а сами элементы).
public class Odds {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Array is: " + Arrays.toString(getRandomArray(array)));
        System.out.println("Odd numbers of array: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println("Sum of array: " + sum);
    }
    // пишем метод, который будет возвращать массив случайных элементов, в диапазоне от -10 до 10
    // аргумент всего один, т.к. по условиям всех задач домашнего задания нам не нужно менять диапазон
    public static int[] getRandomArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (10 - (-10) + 1) + (-10));
        }
        return arr;
    }
}
