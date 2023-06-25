package CodingBat_Practice.String_1;

public class extraEnd {
    public static String extraEnd(String str) {
        String lastTwoChars = str.substring(str.length() - 2);
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));     // "lololo"
        System.out.println(extraEnd("ab"));        // "ababab"
        System.out.println(extraEnd("Hi"));        // "HiHiHi"
    }
}
