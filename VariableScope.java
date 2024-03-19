public class VariableScope {
    public static void printResults(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        double avg = sum / 2.0;
        System.out.println("Average: " + avg);
    }
}
