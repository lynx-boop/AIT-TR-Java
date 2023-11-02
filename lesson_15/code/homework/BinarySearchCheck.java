package homework;

public class BinarySearchCheck {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 11;
        System.out.println(binarySearch(array, num));
    }
    public static int binarySearch(int[] arr, int num) {
        int left = 0; // левый край массива
        int right = arr.length - 1; //правый край массива
        int middle = 0;

        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == num) {
                return middle;
            } else if (num < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            ;
        }
        return middle; //хотим вернуть -1, если элемент не нашелся
    }
}
