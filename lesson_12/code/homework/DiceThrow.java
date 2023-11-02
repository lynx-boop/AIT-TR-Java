package homework;

import java.util.Arrays;

public class DiceThrow {
    public static void main(String[] args) {
        int[] diceThrows = new int[20];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        System.out.println(Arrays.toString(getRandomArray(diceThrows)));

        for (int i = 0; i < diceThrows.length; i++) {
            if (diceThrows[i] == 1) {
                count1++;
            };
            if (diceThrows[i] == 2) {
                count2++;
            };
            if (diceThrows[i] == 3) {
                count3++;
            };
            if (diceThrows[i] == 4) {
                count4++;
            };
            if (diceThrows[i] == 5) {
                count5++;
            };
            if (diceThrows[i] == 6) {
                count6++;
            };
        }
        System.out.println("Counts of numbers: ");
        System.out.println("Num 1: " + count1);
        System.out.println("Num 2: " + count2);
        System.out.println("Num 3: " + count3);
        System.out.println("Num 4: " + count4);
        System.out.println("Num 5: " + count5);
        System.out.println("Num 6: " + count6);
    }
    public static int[] getRandomArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 6 + 1);
        }
        return arr;
    }
}
