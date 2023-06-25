package CodingBat_Practice.String_2;

public class prefixAgain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int N = 1;
        boolean result = prefixAgain(str, N);
        System.out.println(result);  // true
    }

    public static boolean prefixAgain(String str, int N) {
        String prefix = str.substring(0, N);
        for (int i = N; i < str.length() - N + 1; i++) {
            if (str.substring(i, i + N).equals(prefix)) {
                return true;
            }
        }
        return false;
    }
}
