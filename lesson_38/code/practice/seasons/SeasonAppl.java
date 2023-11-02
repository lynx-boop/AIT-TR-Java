package practice.seasons;

public class SeasonAppl {
    public static void main(String[] args) {
        // Опробовать на нем методы:
        // .values()
        // .toString
        // .ordinal()
        // .valueOf()
        Season[] seasons = Season.values(); //заносим значение enum в массив
        System.out.println(seasons.length);
        System.out.println("--------------------VALUES 1--------------------");
        // for loop: 
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i].getName());
        }

        System.out.println("---------------------VALUES 2--------------------");
        // for each:
        for(Season s : seasons) {
            System.out.println(s.getNumber());
        }

        System.out.println("--------------------TO STRING--------------------");
        // to string:
        String str = Season.WINTER.toString();
        System.out.println(str);

        System.out.println("--------------------ORDINAL()--------------------");
        // ordinal:
        int n = Season.AUTUMN.ordinal();
        System.out.println(n);

        System.out.println("--------------------VALUEOF()--------------------");
        //        Для обратного преобразования (строки в объект `Day`) можно воспользоваться статическим методом `valueOf()`:
        //```java
        //        Day day = Day.valueOf("MONDAY"); // day = Day.MONDAY
        Season s = Season.valueOf("SUMMER");
        System.out.println(s.getName() + " - is the best time of the year");
        //```
    }
}
