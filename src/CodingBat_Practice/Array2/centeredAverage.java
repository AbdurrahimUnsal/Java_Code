package CodingBat_Practice.Array2;

public class centeredAverage {
    public static int main(String[] args) {
        int sum = 0;
        int[] nums = new int[0];
        int min = nums[0];
        int max = nums[0];

        // Calculate the sum and find the largest and smallest values
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Subtract the largest and smallest values from the sum
        sum = sum - min - max;

        // Calculate the average by dividing the sum by the number of elements minus 2
        int average = sum / (nums.length - 2);

        return average;
    }
}
