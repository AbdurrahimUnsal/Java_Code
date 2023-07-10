package CodingBat_Practice.AP_1;

public class mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[n];
        int aIndex = 0;
        int bIndex = 0;

        for(int index = 0; index < n; index++) {
            if(a[aIndex].compareTo(b[bIndex]) < 0) {
                arr[index] = a[aIndex];
                aIndex++;
            } else if(a[aIndex].compareTo(b[bIndex]) > 0) {
                arr[index] = b[bIndex];
                bIndex++;
            } else {
                arr[index] = a[aIndex];
                aIndex++;
                bIndex++;
            }
        }

        return arr;
    }
}
