package CodingBat_Practice.String_1;

public class deFront {
    public static String deFront(String str) {
        if (str.length() >= 2) {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
                return str;
            } else if (str.charAt(0) == 'a') {
                return "a" + str.substring(2);
            } else if (str.charAt(1) == 'b') {
                return str.substring(1);
            } else {
                return str.substring(2);
            }
        } else if (str.length() == 1 && str.charAt(0) == 'a') {
            return "a";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));   // "llo"
        System.out.println(deFront("java"));    // "va"
        System.out.println(deFront("away"));    // "aay"
    }
}
