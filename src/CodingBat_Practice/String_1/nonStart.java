package CodingBat_Practice.String_1;

public class nonStart {
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));   // "ellohere"
        System.out.println(nonStart("java", "code"));     // "avaode"
        System.out.println(nonStart("shotl", "java"));    // "hotlava"
    }
}
