package CodingBat_Practice.String_1;

public class middleTwo {
    public static String middleTwo(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex - 1, middleIndex + 1);
    }

    public static void main(String[] args) {
        String str = "string";
        String result = middleTwo(str);
        System.out.println(result);
    }
}
