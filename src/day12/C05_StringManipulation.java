package day12;

public class C05_StringManipulation {
    public static void main(String[] args) {

        String str = "java is fun";

        System.out.println(str.toUpperCase());// JAVA IS FUN
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str); //JAVA IS FUN

        System.out.println(str.length());//11

        System.out.println(str.charAt(0));// first char "J"

        System.out.println(str.charAt(str.length()-1)); // Last letter of a string "N"




    }
}
