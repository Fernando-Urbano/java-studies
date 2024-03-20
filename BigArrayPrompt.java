import java.util.Arrays;
import java.util.Scanner;

public class BigArrayPrompt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] temps = new int[100];
        System.out.println("Enter 100 temperatures: ");
        for (int i = 0; i < temps.length; i++) {
            temps[i] = scan.nextInt();
            System.out.println(Arrays.toString(temps));
        }
    }
}
