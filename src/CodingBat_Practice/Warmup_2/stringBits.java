package CodingBat_Practice.Warmup_2;

public class stringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));       // Output: Hlo
        System.out.println(stringBits("Hi"));          // Output: H
        System.out.println(stringBits("Heeololeo"));   // Output: Hello
    }

    public static String stringBits(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
