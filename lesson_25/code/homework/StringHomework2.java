package homework;

import java.util.Scanner;
//печатает строку задом наперед, начиная с последнего слова.
public class StringHomework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your string!");
        String string = scanner.nextLine();

        printResults(string);
        reverseString(string);
    }

    public static int wordsInString(String str) {
        String[] words = str.split(" "); //разделяем строку на элементы массива типа String
        return words.length;
    }

    public static int symbolsInString(String str) {
        String[] letters = str.split("");
        return letters.length;
    }

    public static void reverseString(String str) {
        System.out.print("Your reversed string is: \"");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("\"");
    }
    public static void printResults(String str) {
        System.out.print("Your string \"" + str + "\"" + " contains " + wordsInString(str) + " words");
        System.out.println(" and " + symbolsInString(str) + " symbols!");
    }
}
