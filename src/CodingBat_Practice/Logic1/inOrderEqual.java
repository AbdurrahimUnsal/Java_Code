package CodingBat_Practice.Logic1;

public class inOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk)
            return a <= b && b <= c;

        return a < b && b < c;
    }
}
