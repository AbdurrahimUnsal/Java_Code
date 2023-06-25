package CodingBat_Practice.String_2;

public class repeatSeparator {
    public static void main(String[] args) {
        String word1 = "Word";
        String sep1 = "X";
        int count1 = 3;

        String word2 = "This";
        String sep2 = "And";
        int count2 = 2;

        String word3 = "This";
        String sep3 = "And";
        int count3 = 1;

        System.out.println(repeatSeparator(word1, sep1, count1));  // "WordXWordXWord"
        System.out.println(repeatSeparator(word2, sep2, count2));  // "ThisAndThis"
        System.out.println(repeatSeparator(word3, sep3, count3));  // "This"
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            result.append(word);

            if (i < count) {
                result.append(sep);
            }
        }

        return result.toString();
    }
}
