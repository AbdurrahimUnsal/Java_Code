package CodingBat_Practice.Recursion_1;

public class sumDigits {
    public int sumDigits(int n) {
        if(n == 0)
            return 0;

        return n % 10 + sumDigits(n / 10);
    }
}
