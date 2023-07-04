package CodingBat_Practice.AP_1;

public class dividesSelf {
    public boolean dividesSelf(int n) {

        for(int val = n; val != 0; val /= 10) {
            int digit = val % 10;
            if(digit == 0 || n % digit != 0)
                return false;
        }

        return true;
    }
}
