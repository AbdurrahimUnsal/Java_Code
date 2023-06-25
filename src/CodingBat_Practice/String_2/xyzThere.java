package CodingBat_Practice.String_2;

public class xyzThere {
    public static void main(String[] args) {
        String str1 = "abcxyz";
        String str2 = "abc.xyz";
        String str3 = "xyz.abc";

        System.out.println(xyzThere(str1));  // true
        System.out.println(xyzThere(str2));  // false
        System.out.println(xyzThere(str3));  // true
    }

    public static boolean xyzThere(String str) {
        int length = str.length();

        for (int i = 0; i < length - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }

        return false;
    }
}
