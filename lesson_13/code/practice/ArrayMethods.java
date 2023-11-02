package practice;

import practice.string_builder.StringBuilderAppl;

public class ArrayMethods {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(StringBuilderAppl[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //максимальный элемент массива целых чисел
    //сигнатура метода:
    public static int maxArray(int[] arr) {
        int max = arr[0]; //первое приближение для максимума
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxArrayIndex(int[] arr) {
        int max = arr[0]; //первое приближение для минимума
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int minArray(int[] arr) {
        int min = arr[0]; //первое приближение для минимума
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int minArrayIndex(int[] arr) {
        int min = arr[0]; //первое приближение для минимума
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    //пузырьковая сортировка от меньшего к большему
    public static int[] sortArrayAsc(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            //переставляем инимальный элемент  начало
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
    // создаем метод, который будет сортировать массив по убыванию
    // у нас есть цикл for, который перебирает элементы массива по одному
    // сначала идет элемент с индексом 0, проверяем для него максимум вложенным циклом
    // начинаем вложенный цикл с этого элемента, и если он больше максимума, записываем его в переменную max
    // а его индекс равен j, записываем
    // далее цикл начинает работать по следующему элементу, сравнивая его с максимумом, в котором теперь лежит
    // предыдущий элемент и если он больше, перезаписыает максимум и его индекс
    // таким образом мы получаем максимальный элемент в конце длины массива и поднимаемся до первого for
    // первый for продолжает работу и записывает во временную переменную элемент i, чтобы не потерять
    // далее переписывает его на значения максимального элемента
    // и чтобы поменять эти значения местами, в индекс максимального значения записывается значение "из заначки"
    public static int[] sortArrayDesc(int[] arr) {
        int max = arr[0]; //объявляем переменную дл максимума
        int maxIndex = 0; //объявляем переменную для его индекса

        // цикл, который проходит по каждому элементу массива
        for (int i = 0; i < arr.length; i++) {
            max = arr[i]; //присваивает переменной текущий элемент массива i
            maxIndex = i; //индекс совпадает со счетчиком, записываем его в переменную индекса
            for (int j = i; j < arr.length; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            //переставляем максимальный элемент  начало
            int tmp = arr[i]; //сохраняем элемент, чтобы не переписать его случайно
            arr[i] = arr[maxIndex]; //переписываем первый элемент на максимальный
            arr[maxIndex] = tmp;
        }
        return arr;
    }
    //метод только печатает строку-разделитель
    public static void split() {
        System.out.println("--------------------------");
    }

    public static int[] getRandomArray(int[] arr, int min, int max){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * (max-min+1)) + min);
        }
        return arr;
    }
}
