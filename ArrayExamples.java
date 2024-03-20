import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] temps = {51, 50, 36, 29, 30};
        int first = temps[0];
        System.out.println("The first temperature is " + first);
        int numTemps = temps.length;
        int last = temps[numTemps - 1];
        System.out.println("The last temperature is " + last);

        // Assign new values of elements in the array
        temps[2] = 40;
        System.out.println("New temps[2]: " + temps[2]);
        System.out.println("Old temps[3]: " + temps[3]);
        temps[3] += 5;
        System.out.println("New temps[3]: " + temps[3]);
        System.out.println(temps);
        System.out.println("Print array properly:");
        System.out.println(Arrays.toString(temps));
    }
}
