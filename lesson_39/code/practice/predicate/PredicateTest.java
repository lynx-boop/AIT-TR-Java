package practice.predicate;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<Integer> isOdd = n -> n % 2 == 1;
        System.out.println(isOdd.test(5)); // true

        Predicate<String> isStartsWithW = s -> s.charAt(0) == 'W';
        System.out.println(isStartsWithW.test("Wolf")); //true
        System.out.println(isStartsWithW.test("Fox")); //false

        Predicate<String> containsJava = s -> s.contains("Java");
        System.out.println(containsJava.test("JavaClass")); //true
        System.out.println(containsJava.test("Class")); //false
    }
}
