package day06;

public class C03_IncrementAndDecrement {
    public static void main(String[] args) {

        int a = 20;

        a = a + 3; // 23
        System.out.println(a);

        a += 3;
        System.out.println(a); //26

        a++; // a = a + 1;  ++ is going to increase the number by one
        System.out.println(a); //27

        a =+ 3;//Interesting
        System.out.println(a); //3

        ++a;
        System.out.println(a); //4

        //all above are ways to increment

        int b = 50;
        b = b-3;
        System.out.println(b);//47

        b -= 3;  // b = b-3;
        System.out.println(b);//44

        b--; // b = b-1;  -- is going to decrease the number bby one
        System.out.println(b);//43

        b =- 3; //interesting
        System.out.println(b);// -3

        --b;
        System.out.println(b); //-4


    }
}
