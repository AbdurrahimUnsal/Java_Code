package CodingBat_Practice.String_2;

public class countCode {
    public static void main(String[] args) {
        String str = "AAxyzBB";
        boolean isMiddle = xyzMiddle(str);
        System.out.println(isMiddle);  // true
    }

    public static boolean xyzMiddle(String str) {
        int length = str.length();
        if (length < 3) {
            return false;
        }

        int midIndex = length / 2;
        if (length % 2 == 0) {
            midIndex--;
            return str.substring(midIndex - 1, midIndex + 2).equals("xyz");
        } else {
            return str.substring(midIndex - 1, midIndex + 2).equals("xyz")
                    || str.substring(midIndex, midIndex + 2).equals("xyz");
        }
    }
}
