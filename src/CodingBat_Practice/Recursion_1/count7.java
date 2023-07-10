package CodingBat_Practice.Recursion_1;

public class count7 {
    public int count7(int n) {
        if(n == 0)
            return 0;

        if(n % 10 == 7)
            return 1 + count7(n / 10);

        return count7(n / 10);
    }
}
