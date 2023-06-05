package CodingBat_Practice.Warmup_2;

public class countXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));  // Output: 1
        System.out.println(countXX("xxx"));    // Output: 2
        System.out.println(countXX("xxxx"));   // Output: 3
    }

    public static int countXX(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }

        return count;
    }
}
