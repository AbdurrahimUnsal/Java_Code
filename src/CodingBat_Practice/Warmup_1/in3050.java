package CodingBat_Practice.Warmup_1;

public class in3050 {
    /*

Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
     */
    public static boolean in3050(int num1, int num2) {
        boolean range1 = (num1 >= 30 && num1 <= 40) && (num2 >= 30 && num2 <= 40);
        boolean range2 = (num1 >= 40 && num1 <= 50) && (num2 >= 40 && num2 <= 50);

        return range1 || range2;
    }

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 31;
        boolean result1 = in3050(num1, num2);
        System.out.println(result1);  // Output: true

        num1 = 30;
        num2 = 41;
        boolean result2 = in3050(num1, num2);
        System.out.println(result2);  // Output: false

        num1 = 40;
        num2 = 50;
        boolean result3 = in3050(num1, num2);
        System.out.println(result3);  // Output: true
    }
}
