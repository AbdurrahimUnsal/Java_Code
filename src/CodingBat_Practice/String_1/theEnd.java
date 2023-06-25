package CodingBat_Practice.String_1;

public class theEnd {
    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public static void main(String[] args) {
        String str = "Hello";
        boolean front = true;
        String result = theEnd(str, front);
        System.out.println(result);
    }
}
