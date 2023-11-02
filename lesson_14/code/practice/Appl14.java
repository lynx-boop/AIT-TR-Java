package practice;

import practice.string_builder.StringBuilderAppl;

public class Appl14 {
    public static void main(StringBuilderAppl[] args) {
        int[] array = {-12, 5, 36, 28, -16, 100, 82, 64 , 57, 5};
        BubbleSortV2.printArray(array);
        BubbleSortV2.bublleSort(array);
        BubbleSortV2.printArray(array);
    }
}
