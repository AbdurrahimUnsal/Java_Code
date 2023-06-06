package CodingBat_Practice.Array1;

import java.util.Arrays;

public class makePi {
    public static void main(String[] args) {
        int[] piDigits = makePi();
        System.out.println(Arrays.toString(piDigits));  // Output: [3, 1, 4]
    }

    public static int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }
}
