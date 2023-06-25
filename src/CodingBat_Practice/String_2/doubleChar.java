package CodingBat_Practice.String_2;

public class doubleChar {
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));           // "TThhee"
        System.out.println(doubleChar("AAbb"));          // "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));      // "HHii--TThheerree"
    }

}
