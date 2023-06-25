package CodingBat_Practice.String_1;

public class nTwice {
    public static String nTwice(String str, int n) {
        String firstNChars = str.substring(0, n);
        String lastNChars = str.substring(str.length() - n);
        return firstNChars + lastNChars;
    }

    public static void main(String[] args) {
        String str = "Hello";
        int n = 2;
        String result = nTwice(str, n);
        System.out.println(result);
    }
}
