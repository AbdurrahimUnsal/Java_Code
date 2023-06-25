package CodingBat_Practice.String_1;

public class atFirst {
    public static String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str.charAt(0) + "@";
        } else {
            return "@@";
        }
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hi";
        String str3 = "h";

        System.out.println(atFirst(str1));  // "he"
        System.out.println(atFirst(str2));  // "hi"
        System.out.println(atFirst(str3));  // "h@"
    }
}
