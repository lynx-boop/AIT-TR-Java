package practice;

import practice.string_builder.StringBuilderAppl;

import java.util.Scanner;

public class RandomNums {
    public static void main(StringBuilderAppl[] args) {
        int[] randomInt = new int [10];
        int a = -20;
        int b = 20;

        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int)(Math.random() * (b - a + 1) + a);
        }

        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num: ");
        int num = scanner.nextInt();
        boolean isNumExist = searchInArray(randomInt, num);
        if (isNumExist) {
            System.out.println("Number " + num + " is present in array");
        } else {
            System.out.println("Number " + num + " is not present in array");
        }
    }

    public static boolean searchInArray(int[] arr, int num) {
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                res = true;
            }
        }
        return res;
    }
}
