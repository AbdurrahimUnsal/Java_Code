package CodingBat_Practice.String_1;

public class makeOutWord {
    public static String makeOutWord(String out, String word) {
        String start = out.substring(0, 2);
        String end = out.substring(2);
        return start + word + end;
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));      // "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));  // "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));    // "[[word]]"
    }
}
