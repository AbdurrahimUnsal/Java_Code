package CodingBat_Practice.String_1;

public class maxTriple {
    public int maxTriple(int[] nums) {
        int max = nums[0];

        if(max < nums[nums.length / 2])
            max = nums[nums.length / 2];

        if(max < nums[nums.length - 1])
            max = nums[nums.length - 1];

        return max;
    }
}
