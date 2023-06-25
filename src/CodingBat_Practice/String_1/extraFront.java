package CodingBat_Practice.String_1;

public class extraFront {
    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars + firstTwoChars + firstTwoChars;
        }
    }

    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));  // "HeHeHe"
        System.out.println(extraFront("ab"));     // "ababab"
        System.out.println(extraFront("H"));      // "HHH"
    }
}
