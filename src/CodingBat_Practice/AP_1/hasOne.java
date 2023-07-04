package CodingBat_Practice.AP_1;

public class hasOne {
    public boolean hasOne(int n) {
        while(n != 0) {
            if(n % 10 == 1)
                return true;

            n /= 10;
        }

        return false;
    }
}
