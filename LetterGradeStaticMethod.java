import java.util.Scanner;

public class LetterGradeStaticMethod {
    public static String grade(int avg){
        String grade;
        // it is okay to have the same name for the method and the variable
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the average: ");
        int avg = scan.nextInt();
        System.out.println("Letter Grade: " + grade(avg));
    }
}
