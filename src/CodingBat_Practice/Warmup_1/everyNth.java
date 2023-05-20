package CodingBat_Practice.Warmup_1;
public class everyNth {
    /*
    Given a non-empty string and an int N, return the string made starting with char 0,
     and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     everyNth("Miracle", 2) → "Mrce"
     everyNth("abcdefg", 2) → "aceg"
     everyNth("abcdefg", 3) → "adg"
     */
    public static String everyNth(String str, int N) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += N) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str1 = "Miracle";
        int N1 = 2;
        System.out.println(everyNth(str1, N1)); //Mrce
        String str2 = "abcdefg";
        int N2 = 2;
        System.out.println(everyNth(str2, N2)); //aceg
        String str3 = "abcdefg";
        int N3 = 3;
        System.out.println(everyNth(str3, N3)); // adg
    }
}