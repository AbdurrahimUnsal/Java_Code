package CodingBat_Practice.Warmup_2;

public class arrayFront9 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 9, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 9};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(arrayFront9(arr1));  // Output: true
        System.out.println(arrayFront9(arr2));  // Output: false
        System.out.println(arrayFront9(arr3));  // Output: false
    }

    public static boolean arrayFront9(int[] nums) {
        int end = Math.min(nums.length, 4);  // Consider only the first 4 elements

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }
}
