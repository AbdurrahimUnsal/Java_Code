package CodingBat_Practice.String_2;

public class endOther {
    public static void main(String[] args) {
        String a = "Hiabc";
        String b = "abc";
        boolean result = endOther(a, b);
        System.out.println(result);  // true
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }
}
