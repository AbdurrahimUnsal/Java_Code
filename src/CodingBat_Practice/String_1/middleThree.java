package CodingBat_Practice.String_1;

public class middleThree {
    public static String middleThree(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex - 1, middleIndex + 2);
    }

    public static void main(String[] args) {
        String str = "Candy";
        String result = middleThree(str);
        System.out.println(result);
    }
}
