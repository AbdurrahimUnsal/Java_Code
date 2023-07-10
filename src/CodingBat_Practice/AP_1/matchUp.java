package CodingBat_Practice.AP_1;

public class matchUp {
    public int matchUp(String[] a, String[] b) {
        int count = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i].length() > 0 && b[i].length() > 0 &&
                    a[i].charAt(0) == b[i].charAt(0))
                count++;
        }

        return count;
    }
}
