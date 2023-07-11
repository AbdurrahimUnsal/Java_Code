package javaCodingPractice;

import static java.lang.Long.sum;

public class C52 {
    public static void main(String[] args) {
        int result = Math.toIntExact(sum(10));
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}



