package CodingBat_Practice.String_2;

public class oneTwo {
    public static void main(String[] args) {
        String string1 = "abc";
        String result1 = oneTwo(string1);
        System.out.println(result1);  // "bca"

        String string2 = "tca";
        String result2 = oneTwo(string2);
        System.out.println(result2);  // "cat"

        String string3 = "tcagdo";
        String result3 = oneTwo(string3);
        System.out.println(result3);  // "catdog"
    }

    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        // Process each group of three characters
        for (int i = 0; i < str.length() - 2; i += 3) {
            // Get the three characters in the group
            String group = str.substring(i, i + 3);

            // Move the first character to the end
            String rotatedGroup = group.substring(1) + group.charAt(0);

            // Append the rotated group to the result
            result.append(rotatedGroup);
        }

        return result.toString();
    }
}
