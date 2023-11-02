package homework;

public class ArraySort14 {
    public static void main(String[] args) {
        int[] array10 = {24, 6, 23, 14, 67, 88, 24, 8, 4, 2};
        int[] array20 = {15, 8, 435, 156, 74, 84, 11, 457, 21, 678, 23, 6, 8, 5, 90, 14, 8, 3, 0, 5};

        System.out.println("Selected sort: ");
        ArrayMethods14.printArray(array10);
        ArrayMethods14.selectedSort(array10);
        ArrayMethods14.printArray(array10);

        System.out.println("Bubble sort: ");
        ArrayMethods14.printArray(array20);
        ArrayMethods14.bubbleSort(array20);
        ArrayMethods14.printArray(array20);
    }
}
