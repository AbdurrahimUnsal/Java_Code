package CodingBat_Practice.Array2;

public class has22 {
    public static boolean main(String[] args) {

        double[] nums = new double[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }
}
