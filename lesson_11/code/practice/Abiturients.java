package practice;

import practice.string_builder.StringBuilderAppl;

public class Abiturients {
    public static void main(StringBuilderAppl[] args) {
        int[] marks = {2, 3, 3, 1, 4, 5, 3, 2, 1, 3, 3};
        int sumOfMarks = 0;

        for (int i = 0; i < marks.length; i++) {
            sumOfMarks += marks[i];
            System.out.println(marks[i]);
            System.out.println(sumOfMarks);
        }

        double averageMark = (double)sumOfMarks/marks.length;
        System.out.println(averageMark);
    }
}
