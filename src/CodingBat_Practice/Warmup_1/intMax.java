package CodingBat_Practice.Warmup_1;

public class intMax {
    /*

Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
     */
    public static int intMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int result1 = intMax(a, b, c);
        System.out.println(result1);  // Output: 3

        a = 1;
        b = 3;
        c = 2;
        int result2 = intMax(a, b, c);
        System.out.println(result2);  // Output: 3

        a = 3;
        b = 2;
        c = 1;
        int result3 = intMax(a, b, c);
        System.out.println(result3);  // Output: 3
    }
}
