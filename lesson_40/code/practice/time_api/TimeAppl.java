package practice.time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

//        **Работа с датами:**
//        - узнать текущую дату и время
//        - есть дата, какой это был день недели? день месяца? день года?
//        - есть дата, как узнать, это было раньше? или позже?
//
//          **Путешествие во времени**
//        - в будущее currentDay.plus
//        - в прошлое currentDay.minus
//        - использование ChronoUnit
//
//          **Получение интервала времени**
//
//          **Сортировка массива по времени**
//
//         **Date Formatter**
//
//          **Парсинг даты из строки**
public class TimeAppl {
    public static void main(String[] args) {
        LocalDate currentDay = LocalDate.now();
        System.out.println(currentDay); //international date format
        //лексико-графическая сортировка - сравниваются строки
        //математическая сортировка - сравниваются числа

        LocalTime currentTime = java.time.LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate gagarin = LocalDate.of(1961, 4, 12);
        System.out.println(gagarin);
        System.out.println("Year of Gagarin: " + gagarin.getYear());
        System.out.println("Month of Gagarin: " + gagarin.getMonth());
        System.out.println("Day of Gagarin: " + gagarin.getDayOfMonth());
        System.out.println("Day of year of Gagarin: " + gagarin.getDayOfYear());
        System.out.println("Day of week of Gagarin: " + gagarin.getDayOfWeek());

        System.out.println(gagarin.isBefore(currentDay)); //ожидаем true (да, эта дата раньше текущей)
        System.out.println(gagarin.isAfter(currentDay)); //ожидаем false

        System.out.println("----------------------TRAVELING IN TIME----------------------");
        LocalDate newDate = currentDay.plusDays(50);
        System.out.println("Plus days: " + newDate);

        newDate = currentDay.plusWeeks(12);
        System.out.println("Plus weeks: " + newDate);

        newDate = currentDay.minusMonths(2);
        System.out.println("Two month ago: " + newDate);

        newDate = LocalDate.now();

        // operations with chronounits
        System.out.println("How much half days past (12h): " + localDateTime.plus(9, ChronoUnit.HALF_DAYS));
        System.out.println("If 2 centuries past: " + newDate.plus(2, ChronoUnit.CENTURIES));
        System.out.println("It will be day of week: " + newDate.getDayOfWeek());

        // get time interval (how much time passed? how old person is?)
        LocalDate einstein = LocalDate.of(1879, 3, 14); //date of Einstein's birth)

        //let's find how much time passed between Gagarin's flied to space and Einstein's birth
        long res = ChronoUnit.YEARS.between(einstein, gagarin);
        System.out.println("Passed: " + res + " years");
        res = ChronoUnit.DAYS.between(einstein, gagarin);
        System.out.println("Passed: " + res + " days");

        System.out.println("Compare dates: ");
        System.out.println(einstein.compareTo(gagarin));
        LocalDate yesterday = LocalDate.of(2023, 10, 30);
        System.out.println(currentDay.compareTo(yesterday));

        //sorting time!
        LocalDate[] dates = {yesterday, einstein, gagarin, currentDay}; //array with dates
        System.out.println("Unsorted dates: " + Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println("Sorted dates: " + Arrays.toString(dates));

        System.out.println("----------------------DateTime Formatter----------------------");
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE; //определили формат даты по константе, ISO_DATE - по умолчанию yyyy-MM-dd
        System.out.println(gagarin.format(df));
        df = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ENGLISH); //задали другой формат отображения даты
        System.out.println(gagarin.format(df));

        System.out.println("---------------------Parsing date from string---------------------");
        String str = "01/11/2023";
        System.out.println(str);

        System.out.println("------------------------------------------------------------------");
        LocalDate date1 = dateParse(str); //делаем метод для конвертации строки в дату
        System.out.println(date1);

        System.out.println("------------------------------------------------------------------");
        str = "01.11.2023";
        date1 = dateParse(str);
        System.out.println(date1);
    }
    private static LocalDate dateParse(String date) {//строка на входе
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyyy][dd:MM:yyyy][dd MM yyyy]"); //определяем как преобразуется строка в дату
        return LocalDate.parse(date, df); //преобразование в дату
    }
}
