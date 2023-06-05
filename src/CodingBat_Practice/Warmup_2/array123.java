package CodingBat_Practice.Warmup_2;

public class array123 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 1};
        int[] arr2 = {1, 1, 2, 4, 1};
        int[] arr3 = {1, 1, 2, 1, 2, 3};

        System.out.println(array123(arr1));  // Output: true
        System.out.println(array123(arr2));  // Output: false
        System.out.println(array123(arr3));  // Output: true
    }

    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }
        return false;
    }
}
