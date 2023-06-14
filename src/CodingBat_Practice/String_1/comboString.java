package CodingBat_Practice.String_1;

public class comboString {
    public static void main(String[] args) {

    }
    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}
