package CodingBat_Practice.String_3;

public class notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is test"));             // "is not test"
        System.out.println(notReplace("is-is"));              // "is not-is not"
        System.out.println(notReplace("This is right"));      // "This is not right"
    }

    public static String notReplace(String str) {
        StringBuilder result = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i + 1 < length && str.substring(i, i + 2).equals("is")) {
                // Check if "is" is not immediately preceded or followed by a letter
                boolean isPrevLetter = (i > 0) && Character.isLetter(str.charAt(i - 1));
                boolean isNextLetter = (i + 2 < length) && Character.isLetter(str.charAt(i + 2));

                if (!isPrevLetter && !isNextLetter) {
                    result.append("is not");
                    i++; // Skip the next character since "is" has been replaced
                } else {
                    result.append(str.charAt(i));
                }
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
