package CodingBat_Practice.String_1;

public class witoutX2 {
    public static String withoutX2(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));   // "Hi"
        System.out.println(withoutX2("Hxi"));   // "Hi"
        System.out.println(withoutX2("Hi"));    // "Hi"
    }
}
