package CodingBat_Practice.Logic2;

public class roundSum {
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int rd = num % 10;

        if(rd >= 5)
            return num + 10 - rd;

        return num - rd;
    }
}
