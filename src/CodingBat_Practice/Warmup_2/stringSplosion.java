package CodingBat_Practice.Warmup_2;

public class stringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));  // Output: CCoCodCode
        System.out.println(stringSplosion("abc"));   // Output: aababc
        System.out.println(stringSplosion("ab"));    // Output: aab
    }

    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0, i + 1));
        }

        return result.toString();
    }
}
