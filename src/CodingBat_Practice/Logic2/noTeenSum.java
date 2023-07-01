package CodingBat_Practice.Logic2;

public class noTeenSum {
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if(13 <= n && n <= 19 && n != 15 && n != 16)
            return 0;

        return n;
    }
}
