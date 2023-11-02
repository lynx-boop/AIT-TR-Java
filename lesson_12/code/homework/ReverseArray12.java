package homework;
import java.util.Arrays;
// Задача 1. Напишите метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т.д.

// Измените (лучше скопируйте и сделайте еще один метод) метод так, чтобы он работал с массивом,
// заполненном "цифрами прописью": zero, one, two, three, ..., nine Выполните "разворот" это массива.
public class ReverseArray12 {
    public static void main(String[] args) {
        //создаем интовый массив
        int[] array = new int[10];
        //создаем стринговый массив
        String[] stringArray = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"
        };
        //здесь метод заполняет интовый массив случайными числами в диапазоне от 1 до 11
        array = getRandomArray(array);
        //печатает массив
        System.out.println(Arrays.toString(array));
        //печатает развернутый массив
        System.out.println(Arrays.toString((getReverseArray(array))));
        //печатает стринговый массив
        System.out.println(Arrays.toString((stringArray)));
        //и его развернутый вариант
        System.out.println(Arrays.toString(getReverseStringArray(stringArray)));
    }
    //заводим метод для разворачиваниы массива
    public static int[] getReverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            //сохраняем элемент массива в переменную
            int replaced = arr[i];
            //заменяем элемент массива из первой половины на элемент из второй
            arr[i] = arr[arr.length - i - 1];
            //достаем из "заначки" элемент первой половины и записываем во вторую
            arr[arr.length - i - 1] = replaced;
        }
        return arr;
    };
    public static String[] getReverseStringArray(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            //сохраняем элемент массива в переменную
            String replaced = arr[i];
            //заменяем элемент массива из первой половины на элемент из второй
            arr[i] = arr[arr.length - i - 1];
            //достаем из "заначки" элемент первой половины и записываем во вторую
            arr[arr.length - i - 1] = replaced;
        }
        return arr;
    };
    public static int[] getRandomArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (10 - (-10) + 1) + (-10));
        }
        return arr;
    }
}

