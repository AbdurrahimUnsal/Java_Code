package CodingBat_Practice.String_2;

public class starOut {
    public static String starOut(String str) {
        StringBuilder result = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
                result.setLength(result.length() - 1);
                continue;
            }

            if (i < length - 1 && str.charAt(i) == '*' && str.charAt(i + 1) != '*') {
                i++;
                continue;
            }

            if (str.charAt(i) != '*') {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));      // "ad"
        System.out.println(starOut("ab**cd"));     // "ad"
        System.out.println(starOut("sm*eilly"));   // "silly"
    }
}
