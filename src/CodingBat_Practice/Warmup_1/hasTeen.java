package CodingBat_Practice.Warmup_1;

public class hasTeen {
    /*

     */

    public static void main(String[] args) {

        hasTeen ht = new hasTeen();
        System.out.println(ht.hasTeen(20, 19, 10));

    }

    public boolean hasTeen(int a, int b, int c) {

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false ;
}
    }