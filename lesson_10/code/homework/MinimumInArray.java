package homework;
import java.util.Arrays;
// Given an array of integers:
// 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Find the maximum array element and its index.
public class MinimumInArray {
    public static void main(String[] args) {
        int[] arr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max array element: " + max + ".");
        //пишу этот цикл, т.к. не сработал int index = Arrays.indexOf(arr, max); почему не сработал?
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.println("Index of max array element: " + i);
            }
        }
    }
}
