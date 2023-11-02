package homework.date_operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {
    String[] array = {"25/09/1994", "21/05/1990", "1/02/2000"};
    String[] expectedArray = {"1990-05-21", "1994-09-25", "2000-02-01"};
    String birthDate = "26/09/1994";

    @Test
    void getAgeTest() {
        assertEquals(29, DateOperation.getAge(birthDate));
    }

    @Test
    void sortStringDatesTest() {
        assertArrayEquals(expectedArray, DateOperation.sortStringDates(array));
    }
}