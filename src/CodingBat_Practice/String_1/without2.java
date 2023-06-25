package CodingBat_Practice.String_1;

public class without2 {

    public static String without2(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));   // "lloHe"
        System.out.println(without2("HelloHi"));   // "HelloHi"
        System.out.println(without2("Hi"));        // ""
    }
}
