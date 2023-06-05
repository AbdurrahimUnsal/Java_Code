package CodingBat_Practice.Warmup_1;

public class max1020 {
    /*

Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
     */
    public static int max1020(int a, int b) {
        boolean aInRange = (a >= 10 && a <= 20);
        boolean bInRange = (b >= 10 && b <= 20);

        if (aInRange && bInRange) {
            return Math.max(a, b);
        } else if (aInRange) {
            return a;
        } else if (bInRange) {
            return b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int a = 11;
        int b = 19;
        int result1 = max1020(a, b);
        System.out.println(result1);  // Output: 19

        a = 19;
        b = 11;
        int result2 = max1020(a, b);
        System.out.println(result2);  // Output: 19

        a = 11;
        b = 9;
        int result3 = max1020(a, b);
        System.out.println(result3);  // Output: 11
    }
}
