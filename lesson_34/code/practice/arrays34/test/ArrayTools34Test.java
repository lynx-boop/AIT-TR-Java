package practice.arrays34.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.arrays34.utils.ArrayTools34;

import java.util.Comparator;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTools34Test {
    Integer[] arrNum;
    String[] arrStr;
    @BeforeEach
    void setUp() {
        arrNum = new Integer[] {9, 7, 4, 7, 2, 10, 5, 1, 0, 10, 5, 15, 25};
        arrStr = new String[] {"one", "two", "three", "four", "five"};
    }

    @Test
    void testPrintArray() {
        System.out.println("-----------------TEST PRINT ARRAY---------------------");
        ArrayTools34.printArray(arrNum);
        ArrayTools34.printArray(arrStr);
    }

    @Test
    void testSearch() {
        System.out.println("-----------------TEST SEARCH------------------------");
        int index = ArrayTools34.search(arrStr, "four");
        System.out.println("index = " + index);
        int index1 = ArrayTools34.search(arrStr, "six");
        System.out.println("index doesn`t exist = " + index1);
        int index2 = ArrayTools34.search(arrNum, 2);
        System.out.println("index = " + index2);
        int index3 = ArrayTools34.search(arrNum, 6);
        System.out.println("index doesn`t exist = " + index3);
    }

    @Test
    void testFindByPredicate() {
        System.out.println("-------------TEST SEARCH BY PREDICATE---------------");
//        Predicate predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 5;
//            }
//        }; - перепишем с помощью лямбда выражения

//        Predicate predicate = (Predicate<Integer>) integer -> integer < 5; - переписали
//        Integer num = ArrayTools34.findByPredicate(arrNum, predicate);
        // но можно сделать и короче!
        Integer num = ArrayTools34.findByPredicate(arrNum, n -> n < 5); //сделали
        System.out.println(num);
        Integer num1 = ArrayTools34.findByPredicate(arrNum, n -> n % 5 == 0); //повторили с другим условием
        System.out.println(num1);
        String str = ArrayTools34.findByPredicate(arrStr, s -> s.length() == 4); //можно воспринимать лямбда-выражения как функции, в данном случае это функция-предикат
        System.out.println(str);
    }
    @Test
    void testBubbleSort() {
        System.out.println("-------------TEST BUBBLE SORT---------------");
        ArrayTools34.bubbleSort(arrNum);
        ArrayTools34.printArray(arrNum);
        ArrayTools34.bubbleSort(arrStr);
        ArrayTools34.printArray(arrStr);
    }
    @Test
    void testBubbleSortComparator() {
        System.out.println("-------------TEST BUBBLE SORT COMPARATOR---------------");
        ArrayTools34.bubbleSort(arrNum, (n1, n2) -> n2 - n1); //сортировка в обратном порядке
        ArrayTools34.printArray(arrNum);
        ArrayTools34.bubbleSort(arrStr, (s1, s2) -> s1.length() - s2.length());
        ArrayTools34.printArray(arrStr);
    }

}