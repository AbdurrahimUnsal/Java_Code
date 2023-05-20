package CodingBat_Practice.Warmup_1;
public class close10 {

    public static void main(String[] args) {

        System.out.println(close10(13,7));
    }
    /*
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.
     close10(8, 13) → 8
     close10(13, 8) → 8
     close10(13, 7) → 0
     */
    public static int close10(int a, int b) {
      int A = Math.abs(a-10);
      int B = Math.abs(b-10);
      if (A<B )
      return a;
      if (B<A)
      return b;
      return 0;
    }

}