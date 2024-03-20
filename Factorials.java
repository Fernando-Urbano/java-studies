public class Factorials {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + fac(n));
        System.out.println("Fibonacci sequence up to " + n + " is: " + fib(n));
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = 1;
            for (int x = 2; x <= n; x++) {
                result *= x;
            }
            return result;
        }
    }

    public static String fib(int n) {
        if (n <= 0) {
            return "";
        } else {
            int a = 0, b = 1;
            StringBuilder sequence = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sequence.append(a).append(" ");
                int sum = a + b;
                a = b;
                b = sum;
            }
            return sequence.toString().trim();
        }
    }
}
