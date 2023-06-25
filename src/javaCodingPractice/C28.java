package javaCodingPractice;

import java.util.HashMap;
import java.util.Map;

public class C28 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        // Map to store the complement of each element in nums and its index
        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                // Found a pair that adds up to the target
                return new int[]{complementMap.get(complement), i};
            }
            complementMap.put(nums[i], i);
        }

        // No valid pair found
        throw new IllegalArgumentException("No two elements add up to the target.");
    }


}
