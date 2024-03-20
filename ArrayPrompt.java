import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrompt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] temps = new int[4];
        System.out.println("Enter 4 temperatures: ");
        temps[0] = scan.nextInt();
        temps[1] = scan.nextInt();
        temps[2] = scan.nextInt();
        temps[3] = scan.nextInt();
        System.out.println(Arrays.toString(temps));
    }
}
