package practice;

import practice.string_builder.StringBuilderAppl;

public class ArrayAlphabet {
    public static void main(StringBuilderAppl[] args) {
        int[] arrayNum = new int[19];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = i + 1;//заполняем элементы массива
        }

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + ", ");
        }

        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)(65 + i);//(char) - приведение int в тип char
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + ", ");
        }
    }
}
