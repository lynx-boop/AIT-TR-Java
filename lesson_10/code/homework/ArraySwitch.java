package homework;
import java.util.Arrays;
// Create an array of random integers ranging from 10 to 30.
// Print the array.
// Swap the first and last elements of the array and print the array again.
public class ArraySwitch {
    public static void main(String[] args) {
        int[] array = new int[21];
        int min = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = min++;
        }
        System.out.println("Array is:\n" + Arrays.toString(array));
        int a = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = a;
        System.out.println("Modified array is:\n" + Arrays.toString(array));
    }
}
