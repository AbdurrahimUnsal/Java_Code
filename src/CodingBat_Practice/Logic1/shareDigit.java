package CodingBat_Practice.Logic1;

public class shareDigit {
    public boolean shareDigit(int a, int b) {
        int al = a / 10;
        int ar = a % 10;
        int bl = b / 10;
        int br = b % 10;

        return al == bl || al == br || ar == bl || ar == br;
    }
}
