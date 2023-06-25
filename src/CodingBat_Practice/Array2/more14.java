package CodingBat_Practice.Array2;

public class more14 {
    public static boolean main(String[] args) {
        int count1 = 0;
        int count4 = 0;
        int[] nums = new int[0];
        for (int num : nums) {
            if (num == 1) {
                count1++;
            } else if (num == 4) {
                count4++;
            }
        }
        return count1 > count4;
    }
}
