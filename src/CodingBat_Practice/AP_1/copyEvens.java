package CodingBat_Practice.AP_1;

public class copyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for(int i = 0; index < count; i++) {
            if(nums[i] % 2 == 0) {
                arr[index] = nums[i];
                index++;
            }
        }

        return arr;
    }
}
