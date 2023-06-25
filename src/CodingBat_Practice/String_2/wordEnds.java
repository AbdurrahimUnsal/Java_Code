package CodingBat_Practice.String_2;

public class wordEnds {
    public static void main(String[] args) {
        String str = "abcXY123XYijk";
        String word = "XY";
        String result = wordEnds(str, word);
        System.out.println(result);  // c13i
    }

    public static String wordEnds(String str, String word) {
        int wordLength = word.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - wordLength + 1; i++) {
            if (str.substring(i, i + wordLength).equals(word)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i + wordLength < str.length()) {
                    result.append(str.charAt(i + wordLength));
                }
            }


        }
        return result.toString();
    }
}