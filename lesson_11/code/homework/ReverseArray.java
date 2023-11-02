package homework;

import java.util.Arrays;

// Написать метод, принимающий массив целых чисел, и разворачивающий его.
// Последний элемент становится нулевым, предпоследний, первым, и т. д.
// Подсказка: этот метод должен изменить полученный массив.

// заводим переменную, в которую будем сохранять значения из массива
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = getRandomArray(array);
        System.out.println(Arrays.toString(array));

        //создаем цикл, в котором каждый элемент первой половины массива будет "сохранен" в переменную
        for (int i = 0; i < array.length / 2; i++) {
            //сохраняем элемент массива в переменную
            int replaced = array[i];
            //заменяем элемент массива из первой половины на элемент из второй
            array[i] = array[array.length - i - 1];
            //достаем из "заначки" элемент первой половины и записываем во вторую
            array[array.length - i - 1] = replaced;
        }
        System.out.println(Arrays.toString(array));
    }
    public static int[] getRandomArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (10 - (-10) + 1) + (-10));
        }
        return arr;
    }
}
