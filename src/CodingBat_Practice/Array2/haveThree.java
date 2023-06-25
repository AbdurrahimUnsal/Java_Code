package CodingBat_Practice.Array2;

public class haveThree {
    public static boolean main(String[] args) {
        int count = 0;

        double[] nums = new double[0];
        if(nums.length >= 1 && nums[0] == 3)
            count++;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] == 3 && nums[i] == 3)
                return false;

            if(nums[i] == 3)
                count++;
        }

        return count == 3;
    }
}
