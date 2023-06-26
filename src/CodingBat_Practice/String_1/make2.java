package CodingBat_Practice.String_1;

public class make2 {
    public int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
        int count = 0;
        int i;

        i = 0;
        while(count < 2 && i < a.length) {
            arr[count] = a[i];
            count++;
            i++;
        }

        i = 0;
        while(count < 2 && i < b.length) {
            arr[count] = b[i];
            count++;
            i++;
        }

        return arr;
    }
}
