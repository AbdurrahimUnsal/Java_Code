package CodingBat_Practice.Logic1;

public class twoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
}
