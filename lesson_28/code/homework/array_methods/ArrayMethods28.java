package homework.array_methods;

public class ArrayMethods28 {
    public int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public boolean arrayFind(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
