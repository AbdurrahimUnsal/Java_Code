package com.campany.day10;

public class Practice6 {
    public static void main(String[] args) {
        /**      1
         *      12
         *     123
         *    1234
         *
         */
        int n=4;//row number
        for (int i = 1; i <=n ; i++) {//now
            for (int j = n; j >i ; j--) {//space
                System.out.print(" ");

            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(k+" ");

            }
            System.out.println();

        }
    }
}
