package CodingBat_Practice.String_3;

public class witoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));    // "He there"
        System.out.println(withoutString("Hello there", "e"));      // "Hllo thr"
        System.out.println(withoutString("Hello there", "x"));      // "Hello there"
    }

    public static String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        int removeLength = remove.length();
        int baseLength = base.length();
        int i = 0;

        while (i < baseLength) {
            if (i <= baseLength - removeLength &&
                    base.substring(i, i + removeLength).equalsIgnoreCase(remove)) {
                i += removeLength;
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
