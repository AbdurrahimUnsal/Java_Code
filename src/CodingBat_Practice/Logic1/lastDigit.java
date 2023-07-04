package CodingBat_Practice.Logic1;

public class lastDigit {
    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
    }
}
