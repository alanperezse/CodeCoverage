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
        System.out.println("Please manually check this method");
        int[] param = {0, 2, 3, 5, 7, 8, 11};
        MathOperations.randEven(param);
        assertTrue(true);
    }
}