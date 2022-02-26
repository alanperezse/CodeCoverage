public class MathOperations {
    public static int multiply(int x) {
        return x * 2;
    }

    public static int powers(int x, int n) {
        int y = 1;

        for(int i = 0; i < n; i++) {
            y *= x;
        }

        return y;
    }

    public static int[] randEven(int[] numbers) {
        int size = 0;

        // Find number of even numbers
        for(int num: numbers) {
            if(num % 2 == 0) size++;
        }

        // Create rtn array
        int[] rtn = new int[size];

        // Populate rtn array
        int i = 0;
        for(int num: numbers) {
            if(num % 2 == 0) {
                rtn[i] = num;
                i++;
            }
        }

        return rtn;
    }
}
