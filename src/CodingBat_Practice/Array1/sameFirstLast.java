package CodingBat_Practice.Array1;

public class sameFirstLast {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 1};
        int[] arr3 = {1, 2, 1};

        System.out.println(sameFirstLast(arr1));  // Output: false
        System.out.println(sameFirstLast(arr2));  // Output: true
        System.out.println(sameFirstLast(arr3));  // Output: true
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            return nums[0] == nums[nums.length - 1];
        }
        return false;
    }
}
