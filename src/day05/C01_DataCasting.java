package day05;

public class C01_DataCasting {
    public static void main(String[] args) {



        boolean  a = true;
        char b = 'H';


        byte c = 25;     // -128  to 127
        short d = 100;
        int e = 150;
        long f = 2000;
        float g = 12.345f;
        double h = 56.7890123;

        System.out.println(a); // true
        a = false; //boolean can take only true or false
        System.out.println(a); // false

        b = 'J';
        System.out.println(b); // J
        b = 67; //Interesting
        System.out.println(b);

        int z = c;
        short y = c;
        long t = c;

        int s = (int)f;

        int numa = 12;
        int numb = 130;

        byte numz = (byte)numa; //explicit narrowing

        System.out.println(numz);

        byte numt = (byte)numb;

        System.out.println(numt);





    }
}
