package day37_string_builder;

public class C03_Equals_Compare {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("easy");
        StringBuilder sb4 = new StringBuilder("Hava");
        String str = "Java";

//        System.out.println(sb1 == str);
//        We cannot use == relational operator for different data types

        System.out.println(sb1 == sb2);//false
        System.out.println(sb1 == sb1);//true

        System.out.println(sb1.equals(sb2));//false

         /*
        If we try to compare to different stringBuilders by equals() method. Result will be always false. Because this
        equals method is coming from object class, not from the stringBuilder Class
         */

        //To check the equality of StringBuilder object we need to use compareTo()

        System.out.println(sb1.compareTo(sb2));//0
        System.out.println(sb1.compareTo(sb3));//-27
        System.out.println(sb1.compareTo(sb4));//2

         /*
        When we use compareTo() method, if the result is 0 this means they are equal
        if it is something else, it means they are not same. The result will be calculated from the ascii table value
        difference. But we can not know which characters are different so if the result is not zero. It wont be  useful
        for us.
         */
    }
}
