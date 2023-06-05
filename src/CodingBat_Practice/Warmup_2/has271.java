package CodingBat_Practice.Warmup_2;

public class has271 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 1};
        int[] arr2 = {1, 2, 8, 1};
        int[] arr3 = {2, 7, 1};

        System.out.println(has271(arr1));  // Output: true
        System.out.println(has271(arr2));  // Output: false
        System.out.println(has271(arr3));  // Output: true
    }

    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i+1] == val + 5 && Math.abs(nums[i+2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }
}
