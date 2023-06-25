package CodingBat_Practice.String_2;

public class plusOut {
    public static void main(String[] args) {
        String str = "12xy34";
        String word = "xy";
        String result = plusOut(str, word);
        System.out.println(result);  // ++xy++
    }

    public static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }

        return result.toString();
    }
}
