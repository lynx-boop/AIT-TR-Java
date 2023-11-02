package homework;

public class ArrayMethodsHw15 {
    public static int[] getRandomArray(int[] arr, int min, int max){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * (max-min+1)) + min);
        }
        return arr;
    }
    public static int searchDuplicate(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
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
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // правый конец будет двигаться к началу
                if(arr[j] > arr[j + 1]) { // если левый из соседей больше правого, то их меняем местами
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static int[] positiveSort(int[] arr) {
        int counter = 0;
        for (int num : arr) {
            if (num >= 0) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int index = 0;
        for(int num : arr) {
            if(num >= 0) {
                newArray[index] = num;
                index++;
            }
        }
        return newArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void split() {
        System.out.println("--------------------------");
    }
}
