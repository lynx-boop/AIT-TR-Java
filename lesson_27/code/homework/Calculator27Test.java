package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.sentence.Sentence;

import static org.junit.jupiter.api.Assertions.*;

class Calculator27Test {
    Calculator27 calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator27(); //вызвали пустой конструктор, который есть по умолчанию у всех объектов
    }

    @Test
    void addition() {
        int num1 = 50;
        int num2 = 3;
        assertEquals(53, calculator.addition(num1, num2));
    }

    @Test
    void subtraction() {
        int num1 = 5;
        int num2 = 35;
        assertEquals(30, calculator.subtraction(num1, num2));
    }

    @Test
    void multiplication() {
        int num1 = 5;
        int num2 = 8;
        assertEquals(40, calculator.multiplication(num1, num2));
    }

    @Test
    void division() {
        int num1 = 3;
        int num2 = 21;
        assertEquals(7, calculator.division(num1, num2));
    }

    @Test
    void remainder() {
        int num1 = 3;
        int num2 = 22;
        assertEquals(1, calculator.remainder(num1, num2));
    }
}