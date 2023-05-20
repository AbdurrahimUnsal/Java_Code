package CodingBat_Practice.Warmup_1;

public class diff21 {
    public static void main(String[] args) {
        /*
        Given an int n, return the absolute difference between n and 21,
        except return double the absolute difference if n is over 21.
         */
      /*
      2.way
      public static void main(String[] args) {
        System.out.println(diff21(19)); // 2
        System.out.println(diff21(10)); // 11
        System.out.println(diff21(21)); // 0
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
       */
    }
    public int diff21(int n){

        if (n<21){
            System.out.println(21-n);

        }else {
            System.out.println(2*(n-21));
        }
        return n;
    }
}
