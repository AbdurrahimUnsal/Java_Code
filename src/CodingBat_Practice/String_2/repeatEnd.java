package CodingBat_Practice.String_2;

public class repeatEnd {
    public static void main(String[] args) {

        String str = "Hello";
        int n = 3;
        String result = repeatEnd(str, n);
        System.out.println(result);  // llollollo
    }

    public static String repeatEnd(String str, int n) {
        int stringLength = str.length();
        String endSubstring = str.substring(stringLength - n);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(endSubstring);
        }

        return result.toString();



    }




    }


