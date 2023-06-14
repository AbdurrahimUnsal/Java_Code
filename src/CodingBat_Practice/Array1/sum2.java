package CodingBat_Practice.Array1;

public class sum2 {
    public static void main(String[] args) {
        int result1 = sum2(new int[]{1, 2, 3});
        int result2 = sum2(new int[]{1, 1});
        int result3 = sum2(new int[]{1, 1, 1, 1});

        // Print the results
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }
}
