package CodingBat_Practice.Array2;

public class has77 {
    public static boolean main(String[] args) {
        double[] nums = new double[0];
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 7 && nums[i+1] == 7)
                return true;

            if(i <= nums.length - 3 && nums[i] == 7 && nums[i+2] == 7)
                return true;
        }

        return false;
    }
}
