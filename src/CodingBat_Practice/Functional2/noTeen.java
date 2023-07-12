package CodingBat_Practice.Functional2;

import java.util.List;

public class noTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n <= 19 && n >= 13);
        return nums;
    }
}
