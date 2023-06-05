package CodingBat_Practice.Warmup_2;

public class stringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));     // Output: xHix
        System.out.println(stringX("abxxxcd"));    // Output: abcd
        System.out.println(stringX("xabxxxcdx"));  // Output: xabcdx
    }

    public static String stringX(String str) {
        if (str.length() < 3) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                result.append(str.charAt(i));
            }
        }

        result.append(str.charAt(str.length() - 1));
        return result.toString();
    }
}
