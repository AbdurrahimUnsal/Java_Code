package CodingBat_Practice.String_1;

public class seeColor {
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    public static void main(String[] args) {
        String str1 = "redxx";
        String str2 = "xxred";
        String str3 = "blueTimes";

        System.out.println(seeColor(str1));  // "red"
        System.out.println(seeColor(str2));  // ""
        System.out.println(seeColor(str3));  // "blue"
    }
}
