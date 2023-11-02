package practice;
import practice.string_builder.StringBuilderAppl;

import java.util.Scanner;
//Task 2. Parents allow their child to play on the computer for 1 hour.
// Write a program that will respond to the grade received at school:
// 1 - “Well done!”, the time for playing games on the computer is increased by 30 minutes.
// 2 - “Okay”, you can play on the computer for the usual 60 minutes.
// 3 - “Mediocre.”, time for games is reduced by 30 minutes.
// 4 - “Bad!”, no games on the computer today.
// 5 - “Shame on the family!”, no games on the computer for 2 days.

public class Evaluation {
    public static void main(StringBuilderAppl[] args) {
        int timeOfGame = 60;
        int mark;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input today`s mark: ");
        mark = scanner.nextInt();

        switch (mark) {
            case (1):
                timeOfGame += 30;
                System.out.println("“Well done!”, your time for playng is: " + timeOfGame);
                break;
            case (2):
                System.out.println("“Okay”, your time for playng is: " + timeOfGame);
                break;
            case (3):
                timeOfGame -= 30;
                System.out.println("“Mediocre.”, your time for playng is: " + timeOfGame);
                break;
            case (4):
                timeOfGame -= timeOfGame;
                System.out.println("“Bad!”, your time for playng is: " + timeOfGame + "! No games today!");
                break;
            case (5):
                timeOfGame -= timeOfGame*2;
                System.out.println("“Shame on the family!”, your time for playng is: " + timeOfGame + "! No games for 2 days!");
                break;
        }
    }
}
