package practice;

import practice.string_builder.StringBuilderAppl;

public class AgeOfStudents {
    public static void main(StringBuilderAppl[] args) {
        int[] ageOfStudents = {30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 45, 47, 34, 29, 45, 18};
        int max = ageOfStudents[0]; //первый кандидат на максимум
        int indexMax = 0;

        for (int i = 0; i < ageOfStudents.length; i++) {
            if(ageOfStudents[i] > max){
                max = ageOfStudents[i];
                indexMax = i;
            };
        }
        System.out.println("Maximal age of student: "+max);
        System.out.println("Index of maximal age: "+indexMax);

        int min = ageOfStudents[0];
        int indexMin = 0;

        for (int i = 0; i < ageOfStudents.length; i++) {
            if(ageOfStudents[i] < min) {
                min = ageOfStudents[i];
                indexMin = i;
            }
        }
        System.out.println("Minimal age of student: "+min);
        System.out.println("Index of minimal age: "+indexMin);
        
        int duplicate = ageOfStudents[0];
        int dCount = 0;
        int indexi = 0;
        int indexj = 0;

        for (int i = 0; i < ageOfStudents.length ; i++) {
            for (int j = i+1; j < ageOfStudents.length ; j++) {
                if (ageOfStudents[i] == ageOfStudents[j]) {
                    duplicate = ageOfStudents[i];
                    dCount++;
                    indexj = j;
                    indexi = i;
                    System.out.println("Duplicate: " + duplicate + ". Index: " + indexi + " ," + indexj);
                }
            }
        }
        System.out.println("Quality of duplicate: " + dCount);
    }
}
