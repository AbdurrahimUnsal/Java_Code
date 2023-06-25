package CodingBat_Practice.String_2;

public class countHi {
    public static void main(String[] args) {
        String str = "ABChi hi";
        int count = countHi(str);
        System.out.println(count);  // 2
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }
}
