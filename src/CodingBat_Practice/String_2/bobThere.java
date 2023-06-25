package CodingBat_Practice.String_2;

public class bobThere {
    public static void main(String[] args) {
        String str = "abcbob";
        boolean result = bobThere(str);
        System.out.println(result);  // true
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("bob") || str.substring(i, i + 3).matches("b.b")) {
                return true;
            }
        }
        return false;
    }
}
