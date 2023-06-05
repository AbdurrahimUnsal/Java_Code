package CodingBat_Practice.Warmup_2;

public class doubleX {
    /*
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
     */
    public static boolean doubleX(String str) {
        int index = str.indexOf("x");

        if (index != -1 && index < str.length() - 1) {
            return str.charAt(index + 1) == 'x';
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "axxbb";
        boolean result1 = doubleX(str1);
        System.out.println(result1);  // Output: true

        String str2 = "axaxax";
        boolean result2 = doubleX(str2);
        System.out.println(result2);  // Output: false

        String str3 = "xxxxx";
        boolean result3 = doubleX(str3);
        System.out.println(result3);  // Output: true
    }
}
