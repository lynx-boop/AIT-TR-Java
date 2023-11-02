package homework.date_operation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {
    public static long getAge(String birthDateString) {
        String[] birthDateComponents = birthDateString.split("/");
        if (birthDateComponents.length == 3) {
            int day = Integer.parseInt(birthDateComponents[0]);
            int month = Integer.parseInt(birthDateComponents[1]);
            int year = Integer.parseInt(birthDateComponents[2]);

            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();
            return ChronoUnit.YEARS.between(birthDate, currentDate);
        }
        return -1;
}

    public static String[] sortStringDates(String[] dates) {
        LocalDate[] datesArray = new LocalDate[dates.length];
        for (int i = 0; i < dates.length; i++) {
            String[] birthDateComponents = dates[i].split("/");
            int day = Integer.parseInt(birthDateComponents[0]);
            int month = Integer.parseInt(birthDateComponents[1]);
            int year = Integer.parseInt(birthDateComponents[2]);
            LocalDate birthDate = LocalDate.of(year, month, day);
            datesArray[i] = birthDate;
        }

        Arrays.sort(datesArray);

        String[] datesArrayString = new String[datesArray.length];
        for (int i = 0; i < datesArray.length; i++) {
            datesArrayString[i] = datesArray[i].toString();
        }
        return datesArrayString;
    }
}
