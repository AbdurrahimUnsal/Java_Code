package day09;

public class C01_Review {
    public static void main(String[] args) {

        String str = "123";
        char chr = 'A';  char chr2 = 123;

        System.out.println(Integer.parseInt(str)+4);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // Java can not convert all datatypes

        /*
        String str1 = false;
        String str2 = 12;
        boolean bl1 = 23;
        int number1 = "Hello";
        */

        // when we try to assing a datatype with smaller capasity to a larger capasity, java will hande the casting.
        // without doing anything java will change the data type to bigger one ( auto widening )

        double db1 = 23;
        short sh1 = 45;

        int number2 = sh1;


        // when wt try to assign a datatype with lager capasity to smaller capasity, Java will underline it. To hande
        // the problem, If we want to force java to conver the datatype we need to write the data type. It is called
        // explicit narrowing


        sh1 = (short) number2;

        char chr1 = 'K';  // to assign we neet to use  single quoutes

        int number3 = 'K';

        if (number3 > 'B') {
            System.out.println("K has higher value than B");
        }

        System.out.println((char)('k'+1));

        String strNumber ="123";

        System.out.println(Integer.parseInt(strNumber)+1); //124

        System.out.println(strNumber+1); //1231




    }

}
