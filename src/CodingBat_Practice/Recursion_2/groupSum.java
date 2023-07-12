package CodingBat_Practice.Recursion_2;

public class groupSum {
    public boolean groupSum(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        if(groupSum(start+1, nums, target - nums[start]))
            return true;

        if(groupSum(start+1, nums, target))
            return true;

        return false;
    }
}
