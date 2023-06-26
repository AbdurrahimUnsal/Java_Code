package CodingBat_Practice.String_1;

public class frontPiece {
    public int[] frontPiece(int[] nums) {
        int[] arr;
        if(nums.length < 2)
            arr = new int[nums.length];
        else
            arr = new int[2];

        if(nums.length > 0)
            arr[0] = nums[0];

        if(nums.length > 1)
            arr[1] = nums[1];

        return arr;
    }
}
