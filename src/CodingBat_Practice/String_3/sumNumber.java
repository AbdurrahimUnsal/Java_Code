package CodingBat_Practice.String_3;

public class sumNumber {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));    // 123
        System.out.println(sumNumbers("aa11b33"));      // 44
        System.out.println(sumNumbers("7 11"));         // 18
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        int numberStart = -1;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (numberStart == -1) {
                    numberStart = i;
                }
            } else {
                if (numberStart != -1) {
                    String numberStr = str.substring(numberStart, i);
                    int number = Integer.parseInt(numberStr);
                    sum += number;
                    numberStart = -1;
                }
            }
        }

        if (numberStart != -1) {
            String numberStr = str.substring(numberStart);
            int number = Integer.parseInt(numberStr);
            sum += number;
        }

        return sum;
    }
}
