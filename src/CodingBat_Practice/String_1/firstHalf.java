package CodingBat_Practice.String_1;

public class firstHalf {
    public static void main(String[] args) {

    }
    public static String firstHalf(String str) {
        int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
    }


}
