package CodingBat_Practice.AP_1;

public class copyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for(int i = 0; index < count; i++) {
            if(isEndy(nums[i])) {
                arr[index] = nums[i];
                index++;
            }
        }

        return arr;
    }

    public boolean isEndy(int n) {
        return 0 <= n && n <= 10 || 90 <= n && n <= 100;
    }
}
