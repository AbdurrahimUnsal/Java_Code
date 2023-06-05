package CodingBat_Practice.Warmup_2;

public class arrayCount9 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 9};
        int[] arr2 = {1, 9, 9};
        int[] arr3 = {1, 9, 9, 3, 9};

        System.out.println(arrayCount9(arr1));  // Output: 1
        System.out.println(arrayCount9(arr2));  // Output: 2
        System.out.println(arrayCount9(arr3));  // Output: 3
    }

    public static int arrayCount9(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }

        return count;
    }
}
