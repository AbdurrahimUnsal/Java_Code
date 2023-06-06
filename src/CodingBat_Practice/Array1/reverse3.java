package CodingBat_Practice.Array1;

import java.util.Arrays;

public class reverse3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] reversed1 = reverse3(nums1);
        System.out.println(Arrays.toString(reversed1));  // Output: [3, 2, 1]

        int[] nums2 = {5, 11, 9};
        int[] reversed2 = reverse3(nums2);
        System.out.println(Arrays.toString(reversed2));  // Output: [9, 11, 5]

        int[] nums3 = {7, 0, 0};
        int[] reversed3 = reverse3(nums3);
        System.out.println(Arrays.toString(reversed3));  // Output: [0, 0, 7]
    }

    public static int[] reverse3(int[] nums) {
        int[] reversed = new int[3];
        reversed[0] = nums[2];
        reversed[1] = nums[1];
        reversed[2] = nums[0];
        return reversed;
    }
}
