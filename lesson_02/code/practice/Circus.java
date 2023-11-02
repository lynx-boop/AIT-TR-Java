package practice;

import practice.string_builder.StringBuilderAppl;

public class Circus {
    public static void main(StringBuilderAppl[] args) {
        lightOn();
        entertainer();
        lightOff();
    }
    public static void lightOn() {
        System.out.println("Light ON!");
    };
    public static void entertainer() {
        jogger();
        singer();
        clown();
    };
    public static void lightOff(){
        System.out.println("Light OFF!");
    };

    public static void jogger(){
        System.out.println("My name is John");
        System.out.println("I`m jogging");
    };
    public static void singer(){
        System.out.println("My name is Philip");
        System.out.println("I`m singing");
    };
    public static void clown(){
        System.out.println("My name is Alia");
        System.out.println("I`m joking");
    };
}
