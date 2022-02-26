public class MathOperations {
    public static int multiply(int x) {
        return x * 2;
    }

    public static int powers(int x, int n) {
        int y = 1;

        for(int i = 0; i < n; i++) {
            System.out.println(y);
            y *= x;
        }

        return y;
    }

    public static void randEven(int[] numbers) {
        for(int num: numbers) {
            System.out.println(num % 2 == 0 ? num : "Not even");
        }
    }
}
