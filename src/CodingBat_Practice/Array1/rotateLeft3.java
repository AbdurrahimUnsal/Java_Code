package CodingBat_Practice.Array1;

import java.util.Arrays;

public class rotateLeft3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] rotated1 = rotateLeft3(nums1);
        System.out.println(Arrays.toString(rotated1));  // Output: [2, 3, 1]

        int[] nums2 = {5, 11, 9};
        int[] rotated2 = rotateLeft3(nums2);
        System.out.println(Arrays.toString(rotated2));  // Output: [11, 9, 5]

        int[] nums3 = {7, 0, 0};
        int[] rotated3 = rotateLeft3(nums3);
        System.out.println(Arrays.toString(rotated3));  // Output: [0, 0, 7]
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] rotated = new int[3];
        rotated[0] = nums[1];
        rotated[1] = nums[2];
        rotated[2] = nums[0];
        return rotated;
    }
}
