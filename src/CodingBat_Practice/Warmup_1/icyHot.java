package CodingBat_Practice.Warmup_1;

public class icyHot {
    /*

Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
     */
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
    public static void main(String[] args) {
        int temp1 = 120;
        int temp2 = -1;
        boolean result1 = icyHot(temp1, temp2);
        System.out.println(result1);  // Output: true

        temp1 = -1;
        temp2 = 120;
        boolean result2 = icyHot(temp1, temp2);
        System.out.println(result2);  // Output: true

        temp1 = 2;
        temp2 = 120;
        boolean result3 = icyHot(temp1, temp2);
        System.out.println(result3);  // Output: false
    }
}
