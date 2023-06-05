package CodingBat_Practice.Warmup_1;

public class loneTeen {
    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
     */
    public static boolean loneTeen(int num1, int num2) {
        boolean isTeen1 = (num1 >= 13 && num1 <= 19);
        boolean isTeen2 = (num2 >= 13 && num2 <= 19);

        return (isTeen1 && !isTeen2) || (!isTeen1 && isTeen2);
    }

    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 99;
        boolean result1 = loneTeen(num1, num2);
        System.out.println(result1);  // Output: true

        num1 = 21;
        num2 = 19;
        boolean result2 = loneTeen(num1, num2);
        System.out.println(result2);  // Output: true

        num1 = 13;
        num2 = 13;
        boolean result3 = loneTeen(num1, num2);
        System.out.println(result3);  // Output: false
    }
}
