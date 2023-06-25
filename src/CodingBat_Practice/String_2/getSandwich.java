package CodingBat_Practice.String_2;

public class getSandwich {
    public static void main(String[] args) {
        String str = "breadjambread";
        String result = getSandwich(str);
        System.out.println(result);  // "jam"
    }

    public static String getSandwich(String str) {
        int firstBreadIndex = str.indexOf("bread");
        int lastBreadIndex = str.lastIndexOf("bread");

        if (firstBreadIndex != -1 && lastBreadIndex != -1 && firstBreadIndex < lastBreadIndex) {
            return str.substring(firstBreadIndex + 5, lastBreadIndex);
        }

        return "";
    }
}
