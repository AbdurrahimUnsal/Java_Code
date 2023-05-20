package day37_string_builder;

public class C04_StingBuilder_String_Methods {
    public static void main(String[] args) {

          /*
        When we try to use methods from different class than StringBuilder (toString(), subString())
        atfirstStep, these methods turns StringBuilder to String data. after using that kind of methods
        we can use other String Methods too
        Important
        ***When we use a method that turns our StringBuilder to String, These methods do not affect the original value of
        StringBuilder
         */




        StringBuilder sb1 = new StringBuilder("Java Life");
        StringBuilder sb2 = new StringBuilder("Java Life");
        String str = "easy";

        System.out.println(sb1.substring(5));//Life

        System.out.println(sb1);//Java Life


        ///str = sb1;
        str = sb1.toString().toUpperCase(); //toString() method will allow us to convert String builder to a string
        System.out.println(str);

        System.out.println(sb1.charAt(2));//v


    }
}
