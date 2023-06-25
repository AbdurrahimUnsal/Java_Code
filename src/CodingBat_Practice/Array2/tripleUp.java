package CodingBat_Practice.Array2;

public class tripleUp {
    public boolean tripleUp(int[] nums) {
        for(int i = 0; i <= nums.length - 3; i++) {
            if(nums[i] + 1 == nums[i+1] && nums[i+1] + 1 == nums[i+2])
                return true;
        }

        return false;
    }
}
