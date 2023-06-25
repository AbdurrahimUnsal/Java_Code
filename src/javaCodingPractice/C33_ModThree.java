package javaCodingPractice;

public class C33_ModThree {

    /*

Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true

     */
    public static void main(String[] args) {
        int nums[] = {2, 1, 3, 5};
        int nums2[] = {2, 1, 2, 5};
        System.out.println(modThree(nums));
        System.out.println(modThree(nums2));


    }

    public static boolean modThree(int[] nums) {
            for (int i = 0; i <= nums.length - 3; i++) {
                if ((nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) ||
                        (nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0)) {
                    return true;
                }
            }
            return false;
        }
}




