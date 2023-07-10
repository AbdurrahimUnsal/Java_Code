package CodingBat_Practice.Recursion_1;

public class powerN {
    public int powerN(int base, int n) {
        if(n <= 1)
            return base;

        return base * powerN(base, n - 1);
    }
}
