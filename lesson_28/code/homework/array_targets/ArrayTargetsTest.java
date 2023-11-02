package homework.array_targets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTargetsTest {
    ArrayTargets arrayTargets;
    int[] arr = {2, -4, 6, -2, 0, 5, 1, 0, -1, 0, -3, 10, -7, 8};

    @BeforeEach
    void setUp() {
        arrayTargets = new ArrayTargets();
    }

    @Test
    void positiveIntCount() {
        assertEquals(6, arrayTargets.positiveIntCount(arr));
    }

    @Test
    void negativeIntCount() {
        assertEquals(5, arrayTargets.negativeIntCount(arr));
    }

    @Test
    void zeroesCount() {
        assertEquals(3, arrayTargets.zeroesCount(arr));
    }

    @Test
    void evenIntCount() {
        assertEquals(9, arrayTargets.evenIntCount(arr));
    }
}