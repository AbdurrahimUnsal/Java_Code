package CodingBat_Practice.Array2;

public class no14 {
    public static boolean main(String[] args) {

        boolean hasOne = false;
        boolean hasFour = false;

        int[] nums = new int[0];
        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            }
            if (num == 4) {
                hasFour = true;
            }
        }

        return !hasOne || !hasFour;
    }
}
