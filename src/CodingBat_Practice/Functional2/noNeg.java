package CodingBat_Practice.Functional2;

import java.util.List;

public class noNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;

        // OR the equivalent stream solution
        // Note that the boolean logic is opposite
        // return nums.stream()
        //   .filter(n -> n >= 0)
        //   .collect(Collectors.toList());
    }
}
