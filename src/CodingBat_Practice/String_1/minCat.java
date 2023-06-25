package CodingBat_Practice.String_1;

public class minCat {
    public static String minCat(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        if (aLen > bLen) {
            a = a.substring(aLen - bLen);
        } else if (bLen > aLen) {
            b = b.substring(bLen - aLen);
        }

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));      // "loHi"
        System.out.println(minCat("Hello", "java"));   // "ellojava"
        System.out.println(minCat("java", "Hello"));   // "javaello"
    }
}
