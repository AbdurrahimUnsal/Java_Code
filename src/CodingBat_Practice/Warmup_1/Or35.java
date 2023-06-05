package CodingBat_Practice.Warmup_1;

public class Or35 {
    /*

Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

or35(3) → true
or35(10) → true
or35(8) → false
     */
    public static boolean or35(int number) {
        return (number % 3 == 0) || (number % 5 == 0);
    }

    public static void main(String[] args) {
        int number1 = 3;
        boolean result1 = or35(number1);
        System.out.println(result1);  // Output: true

        int number2 = 10;
        boolean result2 = or35(number2);
        System.out.println(result2);  // Output: true

        int number3 = 8;
        boolean result3 = or35(number3);
        System.out.println(result3);  // Output: false
    }
}
