package CodingBat_Practice.Warmup_1;

public class lastDigit {
    /*
    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
     */
    public static boolean lastDigit(int num1, int num2) {
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        return lastDigit1 == lastDigit2;
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 17;
        boolean result1 = lastDigit(num1, num2);
        System.out.println(result1);  // Output: true

        num1 = 6;
        num2 = 17;
        boolean result2 = lastDigit(num1, num2);
        System.out.println(result2);  // Output: false

        num1 = 3;
        num2 = 113;
        boolean result3 = lastDigit(num1, num2);
        System.out.println(result3);  // Output: true
    }
}
