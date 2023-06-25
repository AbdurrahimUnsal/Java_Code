package CodingBat_Practice.String_2;

public class xyzMiddle {
    public static void main(String[] args) {
        String str = "aaxbby";
        boolean isBalanced = xyBalance(str);
        System.out.println(isBalanced);  // true
    }

    public static boolean xyBalance(String str) {
        boolean balanced = true;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                return true;
            }
            if (str.charAt(i) == 'x') {
                balanced = false;
            }
        }

        return balanced;
    }
}
