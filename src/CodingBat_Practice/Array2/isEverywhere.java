package CodingBat_Practice.Array2;

public class isEverywhere {
    public static boolean main(String[] args) {
        int[] nums = new int[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int val = 0;
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }
}
