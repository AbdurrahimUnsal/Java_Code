package CodingBat_Practice.Warmup_1;

public class startOz {
    /*

Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
     */
    public static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += 'o';
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += 'z';
        }

        return result;
    }

    public static void main(String[] args) {
        String str1 = "ozymandias";
        String result1 = startOz(str1);
        System.out.println(result1);  // Output: oz

        String str2 = "bzoo";
        String result2 = startOz(str2);
        System.out.println(result2);  // Output: z

        String str3 = "oxx";
        String result3 = startOz(str3);
        System.out.println(result3);  // Output: o
    }
}
