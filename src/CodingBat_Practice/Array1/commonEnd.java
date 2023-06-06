package CodingBat_Practice.Array1;

public class commonEnd {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {7, 3};
        System.out.println(commonEnd(a1, b1));  // Output: true

        int[] a2 = {1, 2, 3};
        int[] b2 = {7, 3, 2};
        System.out.println(commonEnd(a2, b2));  // Output: false

        int[] a3 = {1, 2, 3};
        int[] b3 = {1, 3};
        System.out.println(commonEnd(a3, b3));  // Output: true
    }

    public static boolean commonEnd(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length;

        return (a[0] == b[0]) || (a[aLength - 1] == b[bLength - 1]);
    }
}
