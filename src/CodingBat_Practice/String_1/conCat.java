package CodingBat_Practice.String_1;

public class conCat {
    public static String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public static void main(String[] args) {
        String a1 = "abc";
        String b1 = "cat";
        String a2 = "dog";
        String b2 = "cat";
        String a3 = "abc";
        String b3 = "";

        System.out.println(conCat(a1, b1));  // "abcat"
        System.out.println(conCat(a2, b2));  // "dogcat"
        System.out.println(conCat(a3, b3));  // "abc"
    }
}
