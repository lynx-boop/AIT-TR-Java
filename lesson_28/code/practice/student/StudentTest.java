package practice.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    @DisplayName("В этом тесте мы тестируем рассчет среднего балла")
    void averageMark() {
        int[] marks = {1, 2, 1, 3, 2, 1, 6, 5, 4, 2};
        assertEquals(2.7, student.averageMark(marks));
    }
}