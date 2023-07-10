package CodingBat_Practice.AP_1;

public class scoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    public int largestSpecial(int[] a) {
        int largest = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 10 == 0 && a[i] > largest)
                largest = a[i];
        }

        return largest;
    }
}
