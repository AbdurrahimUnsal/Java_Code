package CodingBat_Practice.String_1;

public class lastTwo {
    public static String lastTwo(String str) {
        int length = str.length();
        if (length >= 2) {
            char lastChar = str.charAt(length - 1);
            char secondLastChar = str.charAt(length - 2);
            return str.substring(0, length - 2) + lastChar + secondLastChar;
        }
        return str;
    }

    public static void main(String[] args) {
        String str1 = "coding";
        String str2 = "cat";
        String str3 = "ab";

        System.out.println(lastTwo(str1));  // "codign"
        System.out.println(lastTwo(str2));  // "cta"
        System.out.println(lastTwo(str3));  // "ba"
    }
}
