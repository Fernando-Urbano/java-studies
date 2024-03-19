public class Factorials {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + fac(n));
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
}
