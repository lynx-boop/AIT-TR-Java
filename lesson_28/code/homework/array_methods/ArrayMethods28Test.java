package homework.array_methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethods28Test {
    ArrayMethods28 arrayMetods;

    @BeforeEach
    void setUp() {
        arrayMetods = new ArrayMethods28();
    }

    @Test
    void testArraySum() {
        int[] arr = {2, 5, 6, 7, 8, 1, 5, 7};
        assertEquals(41, arrayMetods.arraySum(arr));
    }

    @Test
    void testArrayFind() {
        int[] arr = {2, 5, 6, 7, 8, 1, 5, 7};
        assertEquals(true, arrayMetods.arrayFind(arr, 8));
    }
}