package CodingBat_Practice.String_2;

public class zipZap {
    public static void main(String[] args) {
        String str = "zipXzap";
        String result = zipZap(str);
        System.out.println(result);  // zpXzp
    }

    public static String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i < length - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append('z');
                result.append('p');
                i += 2;  // Skip the next character
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
