package CodingBat_Practice.Array1;

public class firstLast6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6};
        int[] arr2 = {6, 1, 2, 3};
        int[] arr3 = {13, 6, 1, 2, 3};

        System.out.println(firstLast6(arr1));  // Output: true
        System.out.println(firstLast6(arr2));  // Output: true
        System.out.println(firstLast6(arr3));  // Output: false
    }

    public static boolean firstLast6(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];

        return (first == 6 || last == 6);
    }
}
