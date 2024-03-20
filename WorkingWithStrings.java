public class WorkingWithStrings {
    
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world!";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        int numChars = s3.length();
        System.out.println("The string s3 has " + numChars + " characters.");
        s2 = s3.substring(0, 5) + s3.charAt(numChars - 1);
        System.out.println(s2);
        String s4 = s2.toUpperCase();
        System.out.println(s4);
    }
}
