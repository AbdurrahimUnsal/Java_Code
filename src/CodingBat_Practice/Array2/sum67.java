package CodingBat_Practice.Array2;

public class sum67 {
    public static int main(String[] args) {
        int sum = 0;
        boolean ignore = false;

        int[] nums = new int[0];
        for (int num : nums) {
            if (num == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum += num;
            }

            if (num == 7 && ignore) {
                ignore = false;
            }
        }

        return sum;
    }
}
