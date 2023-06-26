package CodingBat_Practice.String_1;

public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        if(a[0] + a[1] < b[0] + b[1])
            return b;

        return a;
    }
}
