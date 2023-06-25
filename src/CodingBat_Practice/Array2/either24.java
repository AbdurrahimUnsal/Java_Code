package CodingBat_Practice.Array2;

public class either24 {
    public static boolean main(String[] args) {

        boolean found22 = false;
        boolean found44 = false;

        double[] nums = new double[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                if (found44) {
                    return false;
                }
                found22 = true;
            }

            if (nums[i] == 4 && nums[i + 1] == 4) {
                if (found22) {
                    return false;
                }
                found44 = true;
            }
        }

        return found22 || found44;
    }
}
