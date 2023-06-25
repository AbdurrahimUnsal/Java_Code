package CodingBat_Practice.String_1;

public class lastChars {
    public static String lastChars(String a, String b) {
        char firstChar = a.length() > 0 ? a.charAt(0) : '@';
        char lastChar = b.length() > 0 ? b.charAt(b.length() - 1) : '@';
        return String.valueOf(firstChar) + lastChar;
    }

    public static void main(String[] args) {
        String a1 = "last";
        String b1 = "chars";
        String a2 = "yo";
        String b2 = "java";
        String a3 = "hi";
        String b3 = "";

        System.out.println(lastChars(a1, b1));  // "ls"
        System.out.println(lastChars(a2, b2));  // "ya"
        System.out.println(lastChars(a3, b3));  // "h@"
    }
}
