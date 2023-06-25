package CodingBat_Practice.String_2;

public class repeatFront {
    public static void main(String[] args) {
        String str = "Chocolate";
        int n = 4;
        String result = repeatFront(str, n);
        System.out.println(result);  // ChocChoChC
    }

    public static String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            result.append(str.substring(0, i));
        }
        return result.toString();
    }
}
