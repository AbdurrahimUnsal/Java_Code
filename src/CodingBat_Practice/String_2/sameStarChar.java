package CodingBat_Practice.String_2;

public class sameStarChar {
    public static void main(String[] args) {
        String str = "xy*yzz";
        boolean result = sameStarChar(str);
        System.out.println(result);  // true
    }

    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
