package javaCodingPractice;
public class C17 {
    public static boolean isPalindrome(long number) {
        /*
        Create a method that will accept a number (long) and determine if the number is palindrome or not.
         */
        long reverse = 0;
        long originalNumber = number;
        while (number != 0) {
            long remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return originalNumber == reverse;
    }
    public static void main(String[] args) {
        long number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
