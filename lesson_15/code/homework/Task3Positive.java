package homework;

public class Task3Positive {
    public static void main(String[] args) {
        int[] array = new int[20];
        ArrayMethodsHw15.getRandomArray(array, -100, 100);
        ArrayMethodsHw15.printArray(array);
        int[] positiveArray = ArrayMethodsHw15.positiveSort(array);
        ArrayMethodsHw15.printArray(positiveArray);
        ArrayMethodsHw15.bubbleSort(positiveArray);
        ArrayMethodsHw15.printArray(positiveArray);
    }
}
