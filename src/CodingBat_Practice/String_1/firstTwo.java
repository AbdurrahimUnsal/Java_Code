package CodingBat_Practice.String_1;

public class firstTwo {
    public static void main(String[] args) {

    }
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);


    }

}
