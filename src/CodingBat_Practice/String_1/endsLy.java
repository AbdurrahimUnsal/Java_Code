package CodingBat_Practice.String_1;

public class endsLy {
    public static boolean endsLy(String str) {
        if (str.length() < 2) {
            return false; // String length is less than 2, cannot end with "ly"
        }
        return str.endsWith("ly");
    }

    public static void main(String[] args) {
        String str = "oddly";
        boolean result = endsLy(str);
        System.out.println(result);
    }

}
