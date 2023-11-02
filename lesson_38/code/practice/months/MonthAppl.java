package practice.months;

import java.util.Arrays;

public class MonthAppl {
    public static void main(String[] args) {
        Month month = Month.FEB;
        System.out.println(month);
        System.out.println(month.plusMonth(2));
        System.out.println(month.plusMonth(13));
        System.out.println(month.plusMonth(6));
    }
}
