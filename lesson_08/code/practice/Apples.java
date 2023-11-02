package practice;

import practice.string_builder.StringBuilderAppl;

public class Apples {
    public static void main(StringBuilderAppl[] args) {
        int apples = 30;
        int counter = 0;//счетчик
        int applesInCycle = apples;//параметр

        while(applesInCycle > 0) {
            System.out.println("Take 1 apple from basket");
            applesInCycle = applesInCycle - 1;//изменяем параметр цикла
            //applesInCycle--
            counter = counter + 1;//кол-во выполненных операций
            //counter++
            System.out.println("The rest of apples: " + applesInCycle);
        }
        System.out.println("The job is done. Total apples: " + counter + " added in pie from " + apples + " which was in the basket");
    }
}
