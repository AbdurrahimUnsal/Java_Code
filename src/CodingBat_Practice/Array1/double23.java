package CodingBat_Practice.Array1;

public class double23 {
    public static void main(String[] args) {
        System.out.println(double23(new int[]{2, 2}));  // true
        System.out.println(double23(new int[]{3, 3}));  // true
        System.out.println(double23(new int[]{2, 3}));  // false
    }

    public static boolean double23(int[] nums) {
        if (nums.length != 2) {
            return false;
        }
        return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
    }
}
