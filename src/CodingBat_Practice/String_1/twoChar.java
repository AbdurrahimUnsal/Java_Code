package CodingBat_Practice.String_1;

public class twoChar {
    public static String twoChar(String str, int index) {
        if (index < 0 || index > str.length() - 2) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    public static void main(String[] args) {
        String str = "java";
        int index = 0;
        String result = twoChar(str, index);
        System.out.println(result);
    }
}
