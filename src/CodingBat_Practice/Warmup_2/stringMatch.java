package CodingBat_Practice.Warmup_2;

public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));  // Output: 3
        System.out.println(stringMatch("abc", "abc"));        // Output: 2
        System.out.println(stringMatch("abc", "axc"));        // Output: 0
    }

    public static int stringMatch(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);

            if (subA.equals(subB)) {
                count++;
            }
        }

        return count;
    }
}
