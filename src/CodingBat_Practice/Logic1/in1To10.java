package CodingBat_Practice.Logic1;

public class in1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode)
            return n <= 1 || 10 <= n;

        return 1 <= n && n <= 10;
    }
}
