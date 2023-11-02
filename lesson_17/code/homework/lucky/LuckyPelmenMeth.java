package homework.lucky;
import java.util.Random;

public class LuckyPelmenMeth {
    public static int[] getRandomArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (max - min + 1)) + min);
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int num) {
        int left = 0; // левый край массива
        int right = arr.length - 1; //правый край массива
        int middle = 0;

        while(left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == num) {
                return middle;
            } else if (num < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            };
        }
        return -left-1; //хотим вернуть -1, если элемент не нашелся
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int randomNumberGenerator(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
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
}