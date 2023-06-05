package CodingBat_Practice.Warmup_2;

public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));  // Output: ChoCho
        System.out.println(frontTimes("Chocolate", 3));  // Output: ChoChoCho
        System.out.println(frontTimes("Abc", 3));        // Output: AbcAbcAbc
    }

    public static String frontTimes(String str, int n) {
        int frontLength = Math.min(str.length(), 3);
        String front = str.substring(0, frontLength);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(front);
        }

        return result.toString();
    }
}
