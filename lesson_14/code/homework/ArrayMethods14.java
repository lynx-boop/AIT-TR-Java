package homework;

public class ArrayMethods14 {
    public static int[] selectedSort(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { //правый конец будет двигаться к началу
                if (arr[j] > arr[j + 1]) { //если левый из соседей больше правого, то меняем их местами
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }
    public static void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

