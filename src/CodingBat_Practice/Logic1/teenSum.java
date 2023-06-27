package CodingBat_Practice.Logic1;

public class teenSum {
    public int teenSum(int a, int b) {
        if((13 <= a && a <= 19) || (13 <= b && b <= 19))
            return 19;

        return a + b;
    }
}
