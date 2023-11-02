package practice;

import practice.string_builder.StringBuilderAppl;

import java.util.Arrays;

public class StringAppl {
    public static void main(StringBuilderAppl[] args) {
        System.out.println("------------------------------");
        String str = "Hello";
        char[] chars = {32, 'w', 'o', 'r', 'l', 'd'}; //32 - это код пробела
        String str1 = new String(chars);
        str = str + str1;
        System.out.println(str);
        System.out.println("------------------------------");
        str = str.concat(str1); //аналогичная операция, добавили слово world еще раз
        System.out.println(str);

        int l = str.length(); //выясняем длину строки
        System.out.println("Length of string " + str + " : " + l);
        char c = str.charAt(str.length() - 1); //определяем последний символ строки
        System.out.println("Last symbol of string: " + c);
        System.out.println("------------------------------"); //печать по буквам
        System.out.println("Print by letters: ");
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("------------------------------");

        String str2 = "World"; //будем его сравнивать с str1, который равен "world"
        System.out.println("Without ignore case: " + str1.equals(str2));
        System.out.println("With ignore case: " + str1.equalsIgnoreCase(str2));

        String str3 = str1.toUpperCase(); //переводим строку в uppercase
        System.out.println(str3);
        System.out.println(str3.toLowerCase());

        System.out.println("------------------------------");
        // index - позиция символа в строке
        int index = str.indexOf("l"); //str = Hello
        System.out.println("Index of l = " + index);
        index = str.indexOf("world"); //с какого индекса начинается подстрока or
        System.out.println(index);
        index = str.indexOf('l', 4); //сдвигается место, с которого мы будем искать букву 'l'
        System.out.println(index);
        index = str.lastIndexOf('l'); //индекс последнего нахождения 'l'
        System.out.println(index);
        index = str.indexOf('a'); //индекс отсутсвующей буквы
        System.out.println(index); //ожидаемо: -1

        System.out.println("------------------------------");
        System.out.println(str.substring(3)); //выделится подстрока, начиная с 3-го индекса
        System.out.println(str); //сам str не меняется!
        System.out.println(str.substring(1, 8)); //выделится подстрока с индекса по индекс (первый захватываем, последний - нет)
        System.out.println(str.replace("o", "o-o-o")); //заменяем выбранный символ

        System.out.println("------------------------------");
        String str4 = "                    Bill           ";
        System.out.println(str4);
        str4 = str4.trim();
        System.out.println(str4); //"бритая" строка возвращается без лишних пробелов

        System.out.println("------------------------------");
        String str5 = "I love string in Java!";
        String[] words = str5.split(" "); //разделяем строку на элементы массива типа String
        System.out.println("Quantity of words in string: " + words.length); //узнали длину массива
        System.out.println(Arrays.toString(words)); //напечатали массив

        System.out.println("------------------------------");
        String str6 = "Я помню чудное мгновенье...";
        String[] letters = str6.split(""); //разделителя нет, чтобы получить буквы
        System.out.println("Quantity of words in string: " + letters.length); //узнали длину массива
        System.out.println(Arrays.toString(letters));
    }
}
