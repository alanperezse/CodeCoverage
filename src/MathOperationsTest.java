import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    void multiply() {
        // Negative number
        int rtn = MathOperations.multiply(-1);
        assertEquals(rtn, -2);

        // Zero
        rtn = MathOperations.multiply(0);
        assertEquals(rtn, 0);

        // Positive
        rtn = MathOperations.multiply(5);
        assertEquals(rtn, 10);
    }

    @Test
    void powers() {
        // N = 0
        int rtn;

        for(int i = 0; i < 5; i++) {
            rtn = MathOperations.powers(i, 0);
            assertEquals(1, rtn);
        }
        assertTrue(true);

        // X = 0
        for(int i = 1; i < 5; i++) {
            rtn = MathOperations.powers(0, i);
            assertEquals(0, rtn);
        }
        assertTrue(true);

        // X > 0
        rtn = MathOperations.powers(5, 2);
        assertEquals(25, rtn);
        rtn = MathOperations.powers(2, 3);
        assertEquals(8, rtn);

        // x < 0
        rtn = MathOperations.powers(-3, 2);
        assertEquals(9, rtn);
        rtn = MathOperations.powers(-3, 3);
        assertEquals(-27, rtn);
    }

    @Test
    void randEven() {
        // Standard
        int[] param1 = {0, 2, 3, 5, 7, 8, 11};
        int[] rtn1 = MathOperations.randEven(param1);
        int[] exp1 = {0, 2, 8};
        assertArrayEquals(exp1, rtn1);

        // Negative numbers
        int[] param2 = {-100, -1, 2, 6, 8, 9, 10};
        int[] rtn2 = MathOperations.randEven(param2);
        int[] exp2 = {-100, 2, 6, 8, 10};
        assertArrayEquals(exp2, rtn2);
    }
}