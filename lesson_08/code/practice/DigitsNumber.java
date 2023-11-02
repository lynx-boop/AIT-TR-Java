package practice;
import practice.string_builder.StringBuilderAppl;

import java.util.Scanner;

public class DigitsNumber {
    public static void main(StringBuilderAppl[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        System.out.println("Your number is: " + number);
        int count = 0;

        while (number > 0) {
            number = number/10;
            count++;
        }
        System.out.println("Digits in number " +number+ " is: "+count);
    }
}
