package CodingBat_Practice.String_1;

public class right2 {
    public static String right2(String str) {
        if (str.length() <= 2) {
            return str;
        }
        String lastTwoChars = str.substring(str.length() - 2);
        String remainingChars = str.substring(0, str.length() - 2);
        return lastTwoChars + remainingChars;
    }

    public static void main(String[] args) {
        System.out.println(right2("Hello"));  // "loHel"
        System.out.println(right2("java"));   // "vaja"
        System.out.println(right2("Hi"));     // "Hi"
    }
}
