package javaCodingPractice;
import java.util.Scanner;
public class C03  {

    public static void main(String[] args) {
        /*
        Given any String determine if itis Palindrome. Print“Palindrome”if itis and “Not Palindrome”if
itis not:
         */

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    if (isPalindrome(input)) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome");
    }
}
    private static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare the string with its reverse
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }
}
