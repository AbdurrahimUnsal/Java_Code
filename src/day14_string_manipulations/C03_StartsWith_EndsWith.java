package day14_string_manipulations;

public class C03_StartsWith_EndsWith {
    public static void main(String[] args) {

        String str = "Java is great";

        System.out.println(str.startsWith("java"));//F
        System.out.println(str.startsWith("Java"));//T
        System.out.println(str.startsWith("ava"));//F

        String str2 = "Jav";

        System.out.println(str.startsWith(str2));//T
        System.out.println(str.startsWith(""));//T
        System.out.println(str.startsWith(" "));//F

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(str.endsWith("eat"));//t
        System.out.println(str.endsWith("t"));//t
        System.out.println(str.endsWith(""));//t
        System.out.println(str.endsWith("a is"));//f

        System.out.println(str.endsWith(str.substring(str.length()-1)));// t
        System.out.println(str.endsWith(str.substring(str.length()-3, str.length()-1)));// f

        System.out.println(str.startsWith("is", 5));//true




    }
}
