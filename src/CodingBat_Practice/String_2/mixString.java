package CodingBat_Practice.String_2;

public class mixString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "xyz";
        String result = mixString(a, b);
        System.out.println(result);  // "axbycz"
    }

    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        }

        if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }
}
