package CodingBat_Practice.Array2;

public class bigDiff {
    public static int main(String[] args) {


        int[] nums = new int[0];
        int min = nums[0];
            int max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }

            return max - min;

        }
    }

