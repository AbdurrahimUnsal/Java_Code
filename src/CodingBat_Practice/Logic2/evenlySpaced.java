package CodingBat_Practice.Logic2;

public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int temp;
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if(b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        return b - a == c - b;
    }
}
