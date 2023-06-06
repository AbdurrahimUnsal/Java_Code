package CodingBat_Practice.Array1;

public class maxEnd3 {
    public static void main(String[] args) {
        int[] result1 = maxEnd3(new int[]{1, 2, 3});
        int[] result2 = maxEnd3(new int[]{11, 5, 9});
        int[] result3 = maxEnd3(new int[]{2, 11, 3});

        // Print the results
        printArray(result1);
        printArray(result2);
        printArray(result3);
    }

    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]); // Determine the maximum value between the first and last element

        nums[0] = max; // Set the first element to the maximum value
        nums[1] = max; // Set the second element to the maximum value
        nums[2] = max; // Set the last element to the maximum value

        return nums; // Return the modified array
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
