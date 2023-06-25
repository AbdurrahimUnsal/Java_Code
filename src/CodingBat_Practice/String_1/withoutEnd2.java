package CodingBat_Practice.String_1;

public class withoutEnd2 {
    public static String withoutEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    public static void main(String[] args) {
        String str = "Hello";
        String result = withoutEnd2(str);
        System.out.println(result);
    }
}
