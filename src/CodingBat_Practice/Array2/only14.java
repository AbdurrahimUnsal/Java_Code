package CodingBat_Practice.Array2;

public class only14 {
    public static boolean main(String[] args) {
        int[] nums = new int[0];
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
}
