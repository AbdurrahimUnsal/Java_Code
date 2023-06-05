package CodingBat_Practice.Warmup_2;

public class noTriples {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 1};
        int[] arr2 = {1, 1, 2, 2, 2, 1};
        int[] arr3 = {1, 1, 1, 2, 2, 2, 1};

        System.out.println(noTriples(arr1));  // Output: true
        System.out.println(noTriples(arr2));  // Output: false
        System.out.println(noTriples(arr3));  // Output: false
    }

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
                return false;
            }
        }
        return true;
    }
}
