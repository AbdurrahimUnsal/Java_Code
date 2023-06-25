package CodingBat_Practice.Array2;

public class has12 {
    public boolean has12(int[] nums) {
        boolean found1 = false;
        for (int num : nums) {
            if (num == 1) {
                found1 = true;
            }
            if (found1 && num == 2) {
                return true;
            }
        }
        return false;
    }
}
