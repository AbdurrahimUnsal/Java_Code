package CodingBat_Practice.Array2;

public class countEvens {

    public static void main(String[] args){

    }
    public int countEvens(int[] nums) {

        int[] countEvens = new int[]{2, 1, 2, 3, 4};
        countEvens = new int[]{2, 2, 0};
        countEvens = new int[]{1, 3, 5};

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
