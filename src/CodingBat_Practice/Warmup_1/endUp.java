package CodingBat_Practice.Warmup_1;

public class endUp {
    /*
    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
     */
    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String start = str.substring(0, str.length() - 3);
            String end = str.substring(str.length() - 3).toUpperCase();
            return start + end;
        }
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String result1 = endUp(str1);
        System.out.println(result1);  // Output: HeLLO

        String str2 = "hi there";
        String result2 = endUp(str2);
        System.out.println(result2);  // Output: hi thERE

        String str3 = "hi";
        String result3 = endUp(str3);
        System.out.println(result3);  // Output: HI
    }
}
