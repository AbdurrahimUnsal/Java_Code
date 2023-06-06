package CodingBat_Practice.Array1;

public class sum3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        System.out.println(sum3(nums1));  // Output: 6

        int[] nums2 = {5, 11, 2};
        System.out.println(sum3(nums2));  // Output: 18

        int[] nums3 = {7, 0, 0};
        System.out.println(sum3(nums3));  // Output: 7
    }

    public static int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
