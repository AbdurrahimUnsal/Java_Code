package CodingBat_Practice.String_1;

public class hasBad {
    public static boolean hasBad(String str) {
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("bad")) {
                return true;
            }
            if (str.length() > 3 && str.substring(1, 4).equals("bad")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "badxx";
        String str2 = "xbadxx";
        String str3 = "xxbadxx";

        System.out.println(hasBad(str1));  // true
        System.out.println(hasBad(str2));  // true
        System.out.println(hasBad(str3));  // false
    }
}
