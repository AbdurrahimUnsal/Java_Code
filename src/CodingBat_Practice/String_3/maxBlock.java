package CodingBat_Practice.String_3;

public class maxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));           // 2
        System.out.println(maxBlock("abbCCCddBBBxx"));    // 3
        System.out.println(maxBlock(""));                 // 0
    }

    public static int maxBlock(String str) {
        int maxLength = 0;
        int currentLength = 1;
        int length = str.length();

        for (int i = 1; i < length; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
