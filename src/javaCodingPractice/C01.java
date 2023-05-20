package javaCodingPractice;

public class C01 {

    public static void main(String[] args) {
            /*
        Write a program that prints outthe numbers from 1 to 30 butfor
        numbers which are a multiple of 3,
        print "FIN" instead of the number and for numbers which are a
        multiple of 5, print "RA" instead ofthe number.
        For numbers which are a multiple of both 3 and 5,print "FINRA"
        instead ofthe number.
         */
        for (int i = 1; i <=30 ; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FINRA");
            } else if (i%3==0) {
                System.out.println("FIN");
            }else if (i%5==0) {
                System.out.println("RA");
            }else {
                System.out.println(i);
            }
        }
    }

    }

