package homework.array_targets;

public class ArrayTargets {
    int countPositive = 0;
    int countNegative = 0;
    int evenCount = 0;
    public int positiveIntCount(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                countPositive++;
            }
        }
        return countPositive;
    }
    public int negativeIntCount(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                countNegative++;
            }
        }
        return countNegative;
    }
    public int zeroesCount(int[] arr) {
        return arr.length - negativeIntCount(arr) + positiveIntCount(arr);
    }
    public int evenIntCount(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
