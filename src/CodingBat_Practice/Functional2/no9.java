package CodingBat_Practice.Functional2;

import java.util.List;

public class no9 {
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }
}
