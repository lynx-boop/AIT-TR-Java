package homework;

public class LeapYear5 {
    public static void main(String[] args) {
        int year = 1700;//объявляем год
        int condition4 = year%4;//должен делиться без остатка на 4 (condition4 == 0)
        int condition100 = year%100;//не должен делиться без остатка на 100 (condition100 > 0)
        int condition400 = year%400;//если делится без остатка на 100, то так же должен делиться и на 400
                                    // (condition100 == 0 & condition400 == 0 )
        //собираем вышеописанные условия в логическое выражение, в соответствии с ДЗ, где ^ = это строгое или (XOR):
        if (condition4 == 0 & condition100 != 0 ^ (condition100 == 0 & condition400 == 0) ) {
            System.out.println("Год " + year + " високосный");
        } else System.out.println("Год " + year + " не високосный!");
    }
}//готово, вы великолепны, ваше домашнее задание выполнено, идите съешьте еще этих мягких французских булок!
