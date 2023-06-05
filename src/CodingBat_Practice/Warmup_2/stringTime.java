package CodingBat_Practice.Warmup_2;

public class stringTime {
    /*

Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
     */
    public static String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "Hi";
        int n1 = 2;
        String result1 = stringTimes(str1, n1);
        System.out.println(result1);  // Output: HiHi

        String str2 = "Hi";
        int n2 = 3;
        String result2 = stringTimes(str2, n2);
        System.out.println(result2);  // Output: HiHiHi

        String str3 = "Hi";
        int n3 = 1;
        String result3 = stringTimes(str3, n3);
        System.out.println(result3);  // Output: Hi
    }
}
