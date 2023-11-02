package practice;

import practice.string_builder.StringBuilderAppl;

public class Homework2 {
    public static void main(StringBuilderAppl[] args) {
        sandwich();
    }

    public static void sandwich() {
        bread();
        egg();
        ham();
        System.out.println("Match all ingredients together");
        System.out.println("Your sandwich is done! Congratulations! You`re awesome!");
    }
    public static void bread() {
        System.out.println("Take one piece of bread");
    }
    public static void egg() {
        System.out.println("Take one egg");
        boil();
        slice();
    }
    public static void ham() {
        System.out.println("Take some ham");
        slice();
    }
    public static void boil(){
        System.out.println("Place it into boil water");
        System.out.println("Wait 5 min");
        System.out.println("Remove it from water");
    }
    public static void slice() {
        System.out.println("Slice it on thin pieces");
    }
}
