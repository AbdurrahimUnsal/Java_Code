package day16_string_manipulations;

public class C04_Replace {
    public static void main(String[] args) {

        String str = "Java is better than any";

        System.out.println(str.replace('j', 'H')); // if the replace method can't find the thing to replace it will not change the original value

        System.out.println(str.replace('J', 'H'));//Hava is better than any
        System.out.println(str);//Java is better than any

        System.out.println(str.replace("a", ""));//Jv is better thn ny
        System.out.println(str.replace("Java", "X"));//X is better than any
        System.out.println(str.replace("be", "567")); //Java is 567tter than any


        str = str.replace(" ", "");//Str is updated with new value
        System.out.println(str); //Javaisbetterthanany  to get rid of the space

        System.out.println(str.replace("",  " ")); // J a v a i s b e t t e r t h a n a n y

        System.out.println();

        //

        String str5 = "Jaca is ecccasy";

        System.out.println(str5.replaceFirst("c", "v")); // it will replace the first occurrence





    }
}
