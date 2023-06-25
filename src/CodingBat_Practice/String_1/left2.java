package CodingBat_Practice.String_1;

public class left2 {
    public static String left2(String str) {
        if (str.length() < 2) {
            return str;
        }
        String firstTwoChars = str.substring(0, 2);
        String remainingChars = str.substring(2);
        return remainingChars + firstTwoChars;
    }

    public static void main(String[] args) {
        System.out.println(left2("Hello"));  // "lloHe"
        System.out.println(left2("java"));   // "vaja"
        System.out.println(left2("Hi"));     // "Hi"
    }
}
