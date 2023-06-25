package CodingBat_Practice.String_1;

public class startWord {
    public static String startWord(String str, String word) {
        if (str.length() >= word.length()) {
            if (str.substring(1, word.length()).equals(word.substring(1))) {
                return str.substring(0, word.length());
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi"));    // "hi"
        System.out.println(startWord("hippo", "xip"));   // "hip"
        System.out.println(startWord("hippo", "i"));     // "h"
    }
}
